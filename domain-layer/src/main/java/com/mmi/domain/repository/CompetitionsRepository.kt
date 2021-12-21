package com.mmi.domain.repository


import com.mmi.common.network.NetworkStatus
import com.mmi.domain.entities.DomainEntities
import kotlinx.coroutines.flow.Flow


interface CompetitionsRepository {

    suspend fun getTodayMatches(date: String): NetworkStatus<DomainEntities.DomainMatchResponse>

   suspend fun getAllCompetitions(): Flow<NetworkStatus<List<DomainEntities.DomainCompetitions>>>

/*     suspend fun getStandings(id: Long): NetworkStatus<DomainStandingResponse>

    suspend fun getSingleMatch(id: Long, date: String): NetworkStatus<DomainMatchResponse>

    suspend fun getTeam(id: Long): NetworkStatus<DomainTeamResponse>

    suspend fun getPlayers(id: Long): NetworkStatus<DomainPlayerResponse>*/
}