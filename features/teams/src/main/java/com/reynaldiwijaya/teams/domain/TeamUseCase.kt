package com.reynaldiwijaya.teams.domain

import com.reynaldiwijaya.data.repository.TeamRepository
import com.reynaldiwijaya.teams.ui.TeamState
import retrofit2.HttpException
import java.io.IOException

class TeamUseCase(private val repository: TeamRepository) {

    suspend fun getTeamsByLeagueName(leagueName : String) : TeamState {
        val response = repository.getTeamsByLeagueName(leagueName)
        return try {
            if (response.isSuccessful) {
                response.body()?.let {
                    TeamState.LoadSuccess(it)
                } ?: TeamState.TeamError(IOException("Result Not Found"))
            } else {
                TeamState.TeamError(IOException("Error occurred during fetching movies!"))
            }
        }catch (e : HttpException) {
            TeamState.TeamError(IOException(e.message()))
        }catch (e : Throwable) {
            TeamState.TeamError(IOException(e.message))
        }
    }
}