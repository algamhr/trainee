package com.algatraining.trainee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val countTextView = findViewById<TextView>(R.id.countTextView)
        var timesClicked = 0

        btnClickMe.setOnClickListener {

            timesClicked += 1

            countTextView.text = timesClicked.toString()
            Toast.makeText(this, "Test Click Successful", Toast.LENGTH_LONG).show()
        }
    }
}
