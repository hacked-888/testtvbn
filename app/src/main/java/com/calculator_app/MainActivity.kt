package com.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var tvInputtext:TextView? = null
    var lastnumeric:Boolean = false
    var lastdot:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInputtext = findViewById(R.id.idtextview)
    }
    fun on_num_click(view: View){
        tvInputtext?.append((view as Button).text)
        lastnumeric = true
        lastdot = false
    }

    fun on_clear(view: View){
        tvInputtext?.text=""
    }

    fun ondecimalpoint(){
        if (lastnumeric && !lastdot){
            tvInputtext?.append(".")
            lastnumeric = false
            lastdot = true
        }
    }
}


