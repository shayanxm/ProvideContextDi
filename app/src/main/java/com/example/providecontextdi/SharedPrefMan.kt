package com.example.providecontextdi

import android.app.Application
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.util.Log
import com.example.providecontextdi.di.DaggerAppComponent
import javax.inject.Inject


class SharedPrefMan(contextx: Context){
    var context=contextx
//    @Inject
//    lateinit var context: Context
    @Inject
    lateinit var sharedPreferences: SharedPreferences

    init {
        Log.e("dix", "init called")
        val defultValue = ""
       // val token = sharedPrefMan.getString("TOKEN", defultValue)

      //  getFromSharedPrefences("test")
        DaggerAppComponent.builder().application(context.applicationContext as Application).build().inject(this)
     //  DaggerAppComponent.builder().build().inject(this)
        getFromSharedPrefences("test")
    }
    public fun getFromSharedPrefences(key:String): String {
        //   val sharedPref = this.getPreferences(Context.MODE_PRIVATE)

        val defultValue = ""
//        val sharedPref = context.?.getPreferences(Context.MODE_PRIVATE) ?: return
//        with(sharedPref.edit()) {
//            putInt(getString(R.string.saved_high_score_key), newHighScore)
//            apply()
//        }


        val PATH: String =
        sharedPreferences.getString(key, "ppp").toString()


//        val editor = sharedPreferences.edit()

//        val token = sharedPreferences.getString("TOKEN", defultValue)
        Log.e("dix", PATH)
        return PATH!!
    }

}