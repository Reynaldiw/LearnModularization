package com.reynaldiwijaya.teams.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.reynaldiwijaya.data.entity.Team
import com.reynaldiwijaya.phoenix.utils.gone
import com.reynaldiwijaya.phoenix.utils.visible
import com.reynaldiwijaya.teams.R
import kotlinx.android.synthetic.main.fragment_teams.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TeamsFragment : Fragment(), TeamAdapter.OnItemClick {

    private val viewModel : TeamViewModel by viewModel()
    private val teamAdapter: TeamAdapter by lazy {
        TeamAdapter(this)
    }

    private fun contentView() = R.layout.fragment_teams

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(contentView() ,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        initProcess()
    }

    private fun initUI() {
        rvTeam.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = teamAdapter
        }
    }

    private fun initProcess() {
        viewModel.state.observe(this, Observer {state ->
            when(state) {
                is TeamState.ShowLoading -> {
                    rvTeam.gone()
                    pbLoading.visible()
                }
                is TeamState.HideLoading -> {
                    pbLoading.gone()
                }
            }
        })
        viewModel.result.observe(this, Observer {
            rvTeam.visible()
            teamAdapter.setData(it)
        })
        viewModel.error.observe(this, Observer {
            error -> toast(error)
        })
    }

    override fun onItemClicked(data: Team) {
        toast("You choose ${data.teamName}")
    }

    private fun toast(message : String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}
