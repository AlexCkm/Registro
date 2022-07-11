package com.example.registro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.registro.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBinding
    var Spiner = "Spinner"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataBinding.inflate(layoutInflater)
        setContentView(binding.root)


        fun getSpinner(spinner: Spinner){

            val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(this, R.array.SpinnerOne,
                android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adaptador
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Spiner = parent?.getItemAtPosition(position).toString()
                    Spiner = "Azul"

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Spiner = "Rojo"

                }
            }

        }

    }
}