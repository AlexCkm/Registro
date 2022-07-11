package com.example.registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.registro.SharedPreferences.Companion.prefs
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


        initUI()
        chesckUserValues()



        binding.btnRegister.setOnClickListener {
            val myIntent = Intent(this,DataActivity::class.java )
            startActivity(myIntent)
        }

        binding.btnFacebook.setOnClickListener {
            val myIntent = Intent(this, InfomationActivity::class.java)
            startActivity(myIntent)

        }

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
    fun initUI(){
        binding.btnFacebook.setOnClickListener {
            accessSharedPreferences()
        }
    }

    fun chesckUserValues(){
        if (binding.etName.text.isNotEmpty())
            goAccess()

    }

    fun accessSharedPreferences() {
        if (binding.etName.toString().isNotEmpty()&&
            binding.etUserName.toString().isNotEmpty()&&
            binding.etEmail.toString().isNotEmpty()&&
            binding.etEmail.toString().isNotEmpty()&&
            binding.etPass.toString().isNotEmpty()&&
            binding.etRePassword.toString().isNotEmpty())
        {
            prefs.saveName(binding.etName.text.toString())
        prefs.saveUser_name(binding.etUserName.text.toString())
        prefs.saveEmail(binding.etEmail.text.toString())
        prefs.savePass(binding.etPass.text.toString())
        prefs.saveRepass(binding.etRePassword.text.toString())

        goAccess()
        }else{
            Toast.makeText(this, "Rellene este parametro", Toast.LENGTH_LONG).show()
        }
    }

    fun onRadioButton(view: View){
        if (view is RadioButton){
            val checked = view.isChecked
        }
        when(view.getId()){
            R.id.rbFemale ->
                if (checked){
                    prefs.saveRadioBoton("Female")
                }
            R.id.rbMale ->
                if (checked){
                    pref
                }
        }
    }

    private fun goAccess(){
        startActivity(Intent(this, InfomationActivity::class.java))
    }
//    override fun onCreateOptionMenu{
//        menu.add(Menu)
//    }
}