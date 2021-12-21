package com.mmi.testdemo.di


import com.mmi.common.scopes.Fragment
import com.mmi.core.di.components.CoreComponent
import com.mmi.testdemo.TodayFixturesFragment
import dagger.Component

@Component(dependencies = [CoreComponent::class],
    modules = [CompetitionsViewModelModule::class]
)
@Fragment
interface CompetitionComponent {

    @Component.Factory
    interface Factory {
        fun create(component: CoreComponent): CompetitionComponent
    }

    fun inject(todayFixturesFragment: TodayFixturesFragment)
}