package com.mmi.presentation.viewmodels

import androidx.lifecycle.*
import com.mmi.common.network.NetworkStatus
import com.mmi.domain.usecase.competition.GetCompetitionsUseCase
import com.mmi.domain.usecase.competition.GetTodayFixturesUseCase
import com.mmi.presentation.mappers.map
import com.mmi.presentation.models.Competitions

import javax.inject.Inject

class CompetitionsViewModel @Inject constructor(
    private val getTodayFixturesUseCase: GetTodayFixturesUseCase,
    private val getCompetitionsUseCase: GetCompetitionsUseCase
) : ViewModel() {

    private val _competitionsLiveData = MutableLiveData<NetworkStatus<List<Competitions>>>()
    val competitionsLiveData = _competitionsLiveData


    fun getAllMatches(date: String) = liveData {
        emit(NetworkStatus.Loading())
        when (val result = getTodayFixturesUseCase.invoke(date)) {
            is NetworkStatus.Success -> emit(NetworkStatus.Success(result.data?.map()))
            is NetworkStatus.Error -> emit(NetworkStatus.Error(result.errorMessage!!, null))
        }
    }


}
