package com.mmi.testdemo.di


import com.mmi.common.scopes.Fragment
import com.mmi.core.di.components.CoreComponent
import com.mmi.testdemo.TodayFixturesFragment
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    dependencies = [CoreComponent::class],
    modules = [AndroidInjectionModule::class, AndroidSupportInjectionModule::class, AppModule::class, ActivityModule::class]
)
@Fragment
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(component: CoreComponent): AppComponent
    }

    fun inject(todayFixturesFragment: TodayFixturesFragment)
}