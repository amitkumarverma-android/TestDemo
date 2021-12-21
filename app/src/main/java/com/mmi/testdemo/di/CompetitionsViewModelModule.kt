package com.mmi.testdemo.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mmi.common.scopes.Fragment
import com.mmi.common.scopes.ViewModelKey
import com.mmi.presentation.factory.ViewModelFactory
import com.mmi.presentation.viewmodels.CompetitionsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface CompetitionsViewModelModule {

    @Binds
    @Fragment
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CompetitionsViewModel::class)
    fun bindCompetitionsViewModel(viewModel: CompetitionsViewModel): ViewModel

}