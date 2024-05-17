package com.labactivity.finalproject_tasteofpast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.finalproject_tasteofpast.databinding.ActivityDishesListPageBinding

class DishesListPage : AppCompatActivity() {
    private lateinit var binding: ActivityDishesListPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishesListPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgDynamite.setOnClickListener{
            val intent = Intent(this, RecipePage::class.java)
            startActivity(intent)
        }
    }
}