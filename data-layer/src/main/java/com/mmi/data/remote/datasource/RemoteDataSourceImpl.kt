package com.mmi.data.remote.datasource


import com.mmi.common.network.NetworkStatus
import com.mmi.data.remote.ApiService
import com.mmi.data.utils.safeApiCall
import com.mmi.domain.entities.DomainEntities


class RemoteDataSourceImpl(private val apiService: ApiService): RemoteDataSource {


    override suspend fun getAllMatches(date: String): NetworkStatus<DomainEntities.DomainMatchResponse> {
        return safeApiCall {apiService.getAllMatches(date, date)}
    }

    override suspend fun getAllCompetitions(): NetworkStatus<DomainEntities.DomainCompetitionResponse> {
        return safeApiCall {apiService.getAllCompetitions("TIER_ONE")}
    }


}