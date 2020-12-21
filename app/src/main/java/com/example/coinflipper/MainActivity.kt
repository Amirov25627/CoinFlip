package com.example.coinflipper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flipButton = findViewById<Button>(R.id.button)
        val image = findViewById<ImageView>(R.id.coin)
        val coin = LuckyCoin()

        flipButton.setOnClickListener {
            val x = coin.spin()
            if (x == 0){
                //change picture to reverse
                image.setImageDrawable(getDrawable(R.drawable.ic_revers))
                flipButton.text = "Орел"
            }
            if (x == 1){
                // change to avers
                image.setImageDrawable(getDrawable(R.drawable.ic_avers))
                flipButton.text = "Решка"
            }
        }
    }

}

class LuckyCoin{
    fun spin(): Int{
        return (0..1).random()
    }
}