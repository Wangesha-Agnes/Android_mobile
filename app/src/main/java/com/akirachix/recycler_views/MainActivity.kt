package com.akirachix.recycler_views

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.recycler_views.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val names = listOf("Amina", "Brenda", "Carol", "Diana", "Esther", "Flo", "Gina", "Hellen",
            "Innocent", "Jacob", "Kelvin", "Lisa", "Mike", "Naomi", "Oscar", "Pearl", "Queen", "Robert",
            "Susan", "Timothy", "Unyolo", "Xavier", "Zippy", "Agnes", "Christine", "Bella", "Jay", "Redempta", "Daniel")

        binding.rvNames.layoutManager = LinearLayoutManager(this)
        val namesAdapter = NamesRecyclerViewAdapter(names)
        binding.rvNames.adapter = namesAdapter
    }
}
