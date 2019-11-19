package com.reynaldiwijaya.data.repository

import com.reynaldiwijaya.data.entity.Teams
import com.reynaldiwijaya.data.service.NetworkService
import retrofit2.Response

class TeamRepositoryImpl(private val service : NetworkService) : TeamRepository {
    override suspend fun getTeamsByLeagueName(leagueName: String): Response<Teams> {
        return service.getListTeamsByLeague(leagueName)
    }
}