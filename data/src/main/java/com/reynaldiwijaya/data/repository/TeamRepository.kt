package com.reynaldiwijaya.data.repository

import com.reynaldiwijaya.data.entity.Teams
import retrofit2.Response

interface TeamRepository {
    suspend fun getTeamsByLeagueName(leagueName : String) : Response<Teams>
}