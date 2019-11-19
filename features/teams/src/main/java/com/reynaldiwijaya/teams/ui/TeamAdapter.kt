package com.reynaldiwijaya.teams.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reynaldiwijaya.data.entity.Team
import com.reynaldiwijaya.phoenix.utils.loadImageUrl
import com.reynaldiwijaya.teams.R
import kotlinx.android.synthetic.main.item_team.view.*

class TeamAdapter(private val onItemClick: OnItemClick) : RecyclerView.Adapter<TeamAdapter.ViewHolder>() {

    private val mData = arrayListOf<Team>()

    fun setData(data : List<Team>) {
        mData.clear()
        mData.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_team, parent, false))
    }

    override fun getItemCount(): Int = mData.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val team = mData[position]
        holder.bindItem(team)
    }


    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun bindItem(data : Team) {
            with(itemView) {
                tvTitle.text = data.teamName
                data.teamLogo?.let { imgTeam.loadImageUrl(context, it, R.drawable.ic_broken_image) }
                setOnClickListener {
                    onItemClick.onItemClicked(data)
                }
            }
        }
    }

    interface OnItemClick {
        fun onItemClicked(data : Team)
    }
}