package com.example.contactlist.mapsonuriev.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.contactlist.mapsonuriev.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

//@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     */

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

   /* Укажите имя Activity вместо map.
    setContentView(com.example.contactlist.mapsonuriev.R.layout.activity_main)
    mapview = findViewById<View>(com.example.contactlist.mapsonuriev.R.id.mapview) as MapView
    mapview!!.map.move(
    CameraPosition(Point(55.751574, 37.573856), 11.0f, 0.0f, 0.0f),
    Animation(Animation.Type.SMOOTH, 0F),
    null
    )

}
    override fun onStop() {
        mapView.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
        MapKitFactory.getInstance().onStart()
        mapView.onStart()
    }
}

    */
