package com.example.chessprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chessbutton: Button = findViewById(R.id.chessopen)
        chessbutton.setOnClickListener(){
            val intent = Intent(this, ChessActivity::class.java)
            startActivity(intent)
        }
        var checkersbutton: Button = findViewById(R.id.button2)
        checkersbutton.setOnClickListener(){
            val intent = Intent(this, SnakeActivity::class.java)
            startActivity(intent)
        }
    }
}