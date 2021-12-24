package com.mmi.core



import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment

import com.mmi.core.di.AppInjector
import com.mmi.core.di.components.CoreComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject


class MainApplication: Application(),HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    private lateinit var  coreComponent: CoreComponent
    companion object {
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as MainApplication).coreComponent
    }

    override fun onCreate() {
        super.onCreate()
        coreComponent = AppInjector.init(this)
    }

    override fun androidInjector(): AndroidInjector<Any> =androidInjector

}

fun Activity.coreComponent() = MainApplication.coreComponent(this)
fun Fragment.coreComponent() = MainApplication.coreComponent(requireContext())
