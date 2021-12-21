package com.mmi.data.remote


import com.mmi.data.BuildConfig.API_KEY
import com.mmi.domain.entities.DomainEntities
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

import retrofit2.http.Query

interface ApiService {

    @GET("matches")
    @Headers("X-Auth-Token: $API_KEY")
    suspend fun getAllMatches(@Query("dateFrom") dateFrom: String,
                              @Query("dateTo") dateTo: String)
            : Response<DomainEntities.DomainMatchResponse>



    @GET("competitions")
    @Headers("X-Auth-Token: $API_KEY")
    suspend fun getAllCompetitions(@Query("plan") plan: String)
            : Response<DomainEntities.DomainCompetitionResponse>


}