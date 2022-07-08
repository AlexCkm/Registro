package com.example.registro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.registro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        val ID_Ajustes = Menu.FIRST
        val ID_MasAjustes = Menu.FIRST + 1
        val ID_Snackbar = Menu.FIRST +2
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val actionBar = supportActionBar

        actionBar!!.title = " SingUp"

        actionBar.setIcon(R.drawable.ic_baseline_arrow_back_24)

        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true) //para volver a casa

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(Menu.NONE, ID_Ajustes, Menu.NONE,"Ajustes")
        menu?.add(Menu.NONE, ID_MasAjustes, Menu.NONE,"Mas ajustes")
        menu?.add(Menu.NONE, ID_Snackbar, Menu.NONE,"Informacíon")
        return super.onCreateOptionsMenu(menu)
    }



}