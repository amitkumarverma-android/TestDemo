package com.mmi.core.di.components

import android.content.Context
import com.mmi.core.MainApplication
import com.mmi.core.di.modules.CoreModule
import com.mmi.data.di.DataModule
import com.mmi.domain.repository.CompetitionsRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [CoreModule::class, DataModule::class])
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }



    val competitionsRepository: CompetitionsRepository

}