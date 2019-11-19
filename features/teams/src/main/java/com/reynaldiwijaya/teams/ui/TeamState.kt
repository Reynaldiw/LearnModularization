package com.reynaldiwijaya.teams.ui

import com.reynaldiwijaya.data.entity.Teams

sealed class TeamState {
    object ShowLoading: TeamState()
    object HideLoading: TeamState()

    data class TeamError(val error: Exception): TeamState()
    data class LoadSuccess(val data: Teams): TeamState()
}