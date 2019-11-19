package com.reynaldiwijaya.teams.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.reynaldiwijaya.data.entity.Team
import com.reynaldiwijaya.teams.domain.TeamUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

interface TeamContract {
    fun getTeamsByLeagueName(leagueName : String)
}

class TeamViewModel(private val useCase: TeamUseCase) : ViewModel(), TeamContract {

    private val _state = MutableLiveData<TeamState>()
    val state: LiveData<TeamState>
        get() = _state

    private val _result = MutableLiveData<List<Team>>()
    val result: LiveData<List<Team>>
        get() = _result

    private val _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error

    init {
        getTeamsByLeagueName("English Premier League")
    }

    override fun getTeamsByLeagueName(leagueName: String) {
        _state.value = TeamState.ShowLoading
        viewModelScope.launch {
            val result = useCase.getTeamsByLeagueName(leagueName)
            withContext(Dispatchers.Main) {
                _state.value = TeamState.HideLoading
                when(result) {
                    is TeamState.LoadSuccess -> _result.value = result.data.resultData
                    is TeamState.TeamError -> _error.value = result.error.message
                }
            }
        }
    }
}