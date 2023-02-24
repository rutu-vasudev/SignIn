package com.example.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submit(view: View) {

        val uname=findViewById<EditText>(R.id.uname).text.toString()
        val pass=findViewById<EditText>(R.id.pass).text.toString()

        if(uname=="admin" && pass=="admin"){
            Toast.makeText(this,"Hello Admin",Toast.LENGTH_LONG).show()
        }

    }
}