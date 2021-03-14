package com.example.providecontextdi

import android.app.Application
import com.example.providecontextdi.di.DaggerAppComponent

class App: Application() {
    companion object {
        lateinit var instance:App
    }
    init {
        instance=this
    }

    override fun onCreate() {
        super.onCreate()
       // DaggerAppComponent.builder().application(this).build()
      DaggerAppComponent.builder().application(this).build()
    }
}