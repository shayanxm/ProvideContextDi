package com.example.providecontextdi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.providecontextdi.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var sharedPrefMan: SharedPrefMan
    lateinit var sharedPress:SharedPrefMan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPref = this?.getPreferences(Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putString("string", "newHighScore")
            apply()
        }

        DaggerAppComponent.builder().application(this.application).build().inject(this)
      //  DaggerAppComponent.builder().build().inject(this)
sharedPrefMan.getFromSharedPrefences("test")
//      sharedPrefMan.getFromSharedPrefences("test")
    }
}