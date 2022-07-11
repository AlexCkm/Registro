package com.example.registro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registro.SharedPreferences.Companion.prefs
import com.example.registro.databinding.ActivityInfomationBinding
import com.google.android.material.internal.NavigationMenu

class InfomationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInfomationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfomationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }
    fun initUi(){
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        val name = prefs.getname()
        val USER_NAME = prefs.getUserName()
        val Email = prefs.getemail()
        val Pass = prefs.getPass()
        val Repass = prefs.getRepass()
        val radioBoton = prefs.getRadioBotton()
        binding.textView.text= "\n$name\n$USER_NAME\n$Email\n$Pass\n$Repass\n$radioBoton"

    }


}