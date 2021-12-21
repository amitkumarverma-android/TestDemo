package com.mmi.data.repository




import com.mmi.data.coroutines.DispatcherProvider
import com.mmi.data.remote.datasource.RemoteDataSource
import com.mmi.common.network.NetworkStatus
import com.mmi.domain.entities.DomainEntities
import com.mmi.domain.repository.CompetitionsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class CompetitionsRepositoryImpl(
    private val dispatcherProvider: DispatcherProvider,
    private val remoteDataSource: RemoteDataSource
) : CompetitionsRepository {

    override suspend fun getTodayMatches(date: String): NetworkStatus<DomainEntities.DomainMatchResponse> {
        return withContext(dispatcherProvider.io()) { remoteDataSource.getAllMatches(date) }
    }

    override suspend fun getAllCompetitions(): Flow<NetworkStatus<List<DomainEntities.DomainCompetitions>>> {
        TODO("Not yet implemented")
    }


}