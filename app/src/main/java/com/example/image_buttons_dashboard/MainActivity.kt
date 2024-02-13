package com.example.image_buttons_dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = this.findViewById(R.id.imageButton1) as ImageButton
        val boton2 = this.findViewById(R.id.imageButton2) as ImageButton
        val boton3 = this.findViewById(R.id.imageButton3) as ImageButton
        val boton4 = this.findViewById(R.id.imageButton4) as ImageButton

        boton1.setOnClickListener { view ->
            showToast("Button 1: Fernando Soto Aparicio")
        }

        boton2.setOnClickListener { view ->
            showToast("Button 2: Fernando Soto Aparicio")
        }

        boton3.setOnClickListener { view ->
            showToast("Button 3: Fernando Soto Aparicio")
        }

        boton4.setOnClickListener { view ->
            showToast("Button 4: Fernando Soto Aparicio")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}