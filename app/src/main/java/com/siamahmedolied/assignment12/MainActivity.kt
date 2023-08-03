package com.siamahmedolied.assignment12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.siamahmedolied.assignment12.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var score:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.setOnClickListener {
        score++
        binding.ScoreTV.text = "$score"
        }
        binding.btn2.setOnClickListener {
            score--
        binding.ScoreTV.text = "$score"
        }

    }

}