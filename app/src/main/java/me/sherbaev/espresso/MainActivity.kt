package me.sherbaev.espresso

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import me.sherbaev.espresso.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val vb by viewBinding(ActivityMainBinding::bind, R.id.main_container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupIntents()
    }

    private fun setupIntents() = with(vb) {
        deviceList.adviceRoot.setOnClickListener {
            Toast.makeText(this@MainActivity, "Pressed", Toast.LENGTH_SHORT).show()
        }
    }
}