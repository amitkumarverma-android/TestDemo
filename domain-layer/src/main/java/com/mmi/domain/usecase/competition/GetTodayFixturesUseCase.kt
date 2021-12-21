package com.mmi.domain.usecase.competition


import com.mmi.common.network.NetworkStatus
import com.mmi.domain.entities.DomainEntities
import com.mmi.domain.repository.CompetitionsRepository
import javax.inject.Inject

class GetTodayFixturesUseCase @Inject constructor(
    private val competitionsRepository: CompetitionsRepository
) {

    suspend operator fun invoke(input: String?): NetworkStatus<DomainEntities.DomainMatchResponse> {
        return competitionsRepository.getTodayMatches(input.toString())
    }

}