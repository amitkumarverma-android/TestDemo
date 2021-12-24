package com.mmi.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
/*    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

   /* override fun androidInjector(): AndroidInjector<Any> = androidInjector*/
}