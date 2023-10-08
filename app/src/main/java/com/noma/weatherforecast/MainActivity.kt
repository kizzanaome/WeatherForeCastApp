package com.noma.weatherforecast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.noma.weatherforecast.data.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
         val service = RetrofitInstance().createRetrofit()
            val apiResponse = service.getWeather("Kampala" , "7a7832296092ee52fb6badf906bd09fe")

            withContext(Dispatchers.Main){
                val textView = findViewById<TextView>(R.id.response)
                textView.text = apiResponse.weather[0].description
                textView.text = apiResponse.toString()

            }

        }
    }
}