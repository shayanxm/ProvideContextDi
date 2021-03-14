package com.example.providecontextdi.di

import android.app.Application
import com.example.providecontextdi.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))

interface AppComponent {
    fun inject(mainActivity: MainActivity)
    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder
    }
}