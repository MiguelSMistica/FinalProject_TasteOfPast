package com.labactivity.finalproject_tasteofpast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.finalproject_tasteofpast.databinding.ActivitySignUpPageBinding

class SignUpPage : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}