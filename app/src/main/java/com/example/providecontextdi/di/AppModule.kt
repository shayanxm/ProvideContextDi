package com.example.providecontextdi.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.providecontextdi.SharedPrefMan
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideSharedPref(context:Application):SharedPrefMan=
        SharedPrefMan(context)

@Provides
@Singleton
fun  provideShared(context: Application):SharedPreferences{
   return context.getSharedPreferences("PATH", Context.MODE_PRIVATE)

}

}