package com.labactivity.finalproject_tasteofpast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.finalproject_tasteofpast.databinding.ActivityRecipePageBinding

class RecipePage : AppCompatActivity() {
    private lateinit var binding: ActivityRecipePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}