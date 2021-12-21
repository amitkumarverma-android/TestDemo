package com.mmi.data.di

import com.mmi.data.coroutines.DefaultDispatcherProvider
import com.mmi.data.coroutines.DispatcherProvider
import com.mmi.data.remote.ApiService
import com.mmi.data.remote.datasource.RemoteDataSource
import com.mmi.data.remote.datasource.RemoteDataSourceImpl
import com.mmi.data.repository.CompetitionsRepositoryImpl
import com.mmi.domain.repository.CompetitionsRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(includes = [NetworkModule::class])
class DataModule {
    /// Provide DispatcherProvider ///

    @Provides
    @Singleton
    internal fun provideDispatcherProvider(): DispatcherProvider = DefaultDispatcherProvider()

    /// Provide Remote Data Sources ///

    @Provides
    fun provideRemoteDataSource(apiService: ApiService): RemoteDataSource {
        return RemoteDataSourceImpl(apiService)
    }

    /// Provide repositories ///

    @Singleton
    @Provides
    fun provideCompetitionsRepository(
        dispatcherProvider: DispatcherProvider,
        remoteDataSource: RemoteDataSource
    ): CompetitionsRepository {
        return CompetitionsRepositoryImpl(dispatcherProvider, remoteDataSource)
    }
}