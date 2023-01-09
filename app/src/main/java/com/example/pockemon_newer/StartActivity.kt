package com.example.pockemon_newer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pockemon_newer.databinding.ActivityPrivateBinding
import com.example.pockemon_newer.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
         binding.reltive.setOnClickListener {
             val intent = Intent(this, PrivateActivity::class.java)
             startActivity(intent)
         }
    }
}