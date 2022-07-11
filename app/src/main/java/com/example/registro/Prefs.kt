package com.example.registro

import android.content.Context

class Prefs (val context: Context) {
    val DATABASE = "MyDb"
    val NAME = "NAME_"
    val USER_NAME ="USER_NAME"
    val EMAIL ="EMAIL"
    val PASS ="PASS"
    val REPASS ="REPASS"
    val RADIOBOTON = "RBOTON"
    val storage = context.getSharedPreferences(DATABASE,
        Context.MODE_PRIVATE)


    fun saveName(name: String){
        storage.edit().putString(NAME, name).apply()
    }

    fun saveUser_name(name:String){
        storage.edit().putString(USER_NAME, name).apply()
    }

    fun saveEmail(name:String){
        storage.edit().putString(EMAIL, name).apply()
    }

    fun savePass (name:String){
        storage.edit().putString(PASS, name).apply()
    }

    fun saveRepass(name:String){
        storage.edit().putString(REPASS, name).apply()
    }
    fun saveRadioBoton(radioButon: String){
        storage.edit().putString(RADIOBOTON, radioButon).apply()
    }

    fun getname():String{
        return storage.getString(NAME, "")!!
    }

    fun getUserName():String{
        return storage.getString(USER_NAME, "")!!
    }

    fun getemail():String{
        return storage.getString(EMAIL, "")!!

    }

    fun getPass():String{
        return  storage.getString(PASS, "")!!
    }

    fun getRepass():String{
        return storage.getString(REPASS, "")!!
    }

    fun getRadioBotton():String{
        return storage.getString(RADIOBOTON, "")!!
    }

    fun cleanData(){
        storage.edit().clear().apply()
    }
}

