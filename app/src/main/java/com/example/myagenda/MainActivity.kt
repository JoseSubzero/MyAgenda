package com.example.myagenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.myagenda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.opList -> {
                    Navigation.findNavController(binding.fragmentContainerView)
                        .navigate(R.id.listFragment)
                    true
                }
                R.id.opNew -> {
                    Navigation.findNavController(binding.fragmentContainerView)
                        .navigate(R.id.newFragment)
                    true
                }
                R.id.opUpdate ->{
                    Navigation.findNavController(binding.fragmentContainerView)
                        .navigate(R.id.updateFragment)
                    true
                }
                R.id.opDelete ->{
                    Navigation.findNavController(binding.fragmentContainerView)
                        .navigate(R.id.deleteFragment)
                    true
                }
                else -> false
            }
        }
    }
}