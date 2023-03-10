package com.example.dootuuk3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dootuuk3.databinding.ActivityMainBinding
import com.example.projectdootuuk.AnimeClass

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.user.setOnClickListener(){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
        binding.current.setOnClickListener() {
            val intent = Intent(this, AllAnimeActivity::class.java)
            startActivity(intent)
        }


    }
}