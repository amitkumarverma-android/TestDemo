package com.mmi.domain.usecase.competition


import com.mmi.common.network.NetworkStatus
import com.mmi.domain.entities.DomainEntities
import com.mmi.domain.repository.CompetitionsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCompetitionsUseCase @Inject constructor(
    private val competitionsRepository: CompetitionsRepository
) {

    suspend operator fun invoke(): Flow<NetworkStatus<List<DomainEntities.DomainCompetitions>>> {
        return competitionsRepository.getAllCompetitions()
    }

}