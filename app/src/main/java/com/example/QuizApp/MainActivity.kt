package com.example.QuizApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN

        buttonStart.setOnClickListener {
            var userName=editTextName.text.toString()
            if (userName.isEmpty()){
                Toast.makeText(applicationContext,"please enter your Name", Toast.LENGTH_SHORT).show()
            }else{
                val intent= Intent(this,QuizQuetionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
