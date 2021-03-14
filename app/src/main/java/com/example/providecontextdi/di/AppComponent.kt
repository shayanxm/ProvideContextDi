package com.example.providecontextdi.di

import android.app.Application
import com.example.providecontextdi.MainActivity
import com.example.providecontextdi.SharedPrefMan
import dagger.BindsInstance
import dagger.Component
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))

interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(sharedPrefMan: SharedPrefMan)




    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder
    }
}