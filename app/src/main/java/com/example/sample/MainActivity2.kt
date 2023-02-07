package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sample.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding2: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding2 = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding2.root)

    }
}