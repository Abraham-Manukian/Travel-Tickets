package com.example.traveltickets

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.traveltickets.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Пример использования View Binding для работы с представлениями
        binding.btnSearch.setOnClickListener {
            val departure = binding.etDeparture.text.toString()
            val destination = binding.etDestination.text.toString()
            // Здесь можно добавить логику для обработки поиска
        }
    }
}