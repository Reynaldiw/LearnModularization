package com.reynaldiwijaya.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Teams(
    @Expose @SerializedName("teams") val resultData : List<Team>
)

data class Team(
    @Expose @SerializedName("idTeam") val idTeam : String?,
    @Expose @SerializedName("strTeam") val teamName : String?,
    @Expose @SerializedName("strTeamBadge") val teamLogo : String?
)