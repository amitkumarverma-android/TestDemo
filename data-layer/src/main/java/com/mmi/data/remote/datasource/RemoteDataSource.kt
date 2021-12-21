package com.mmi.data.remote.datasource

import com.mmi.common.network.NetworkStatus
import com.mmi.domain.entities.DomainEntities


interface RemoteDataSource {

    suspend fun getAllMatches(date: String): NetworkStatus<DomainEntities.DomainMatchResponse>

    suspend fun getAllCompetitions(): NetworkStatus<DomainEntities.DomainCompetitionResponse>

}