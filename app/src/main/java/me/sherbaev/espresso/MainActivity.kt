package me.sherbaev.espresso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import me.sherbaev.espresso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            deviceList.adviceRoot.setOnClickListener {
                Toast.makeText(this@MainActivity, "Pressed", Toast.LENGTH_SHORT).show()
            }
        }

    }
}