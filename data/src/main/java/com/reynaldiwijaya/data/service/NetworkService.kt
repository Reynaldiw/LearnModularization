package com.reynaldiwijaya.data.service

import com.reynaldiwijaya.data.entity.Teams
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {

    @GET("api/v1/json/1/search_all_teams.php")
    suspend fun getListTeamsByLeague(
        @Query("l") leagueName : String
    ) : Response<Teams>
}