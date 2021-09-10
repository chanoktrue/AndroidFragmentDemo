package com.trueddns.homenano.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.trueddns.homenano.fragmentdemo.databinding.ActivityMainBinding

//https://youtu.be/5n9DZmZjAHM

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    val oneFragment = OneFragment()
    val twoFragment = TwokFragment()
    val threeFragment = ThreeFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        // Add
//        supportFragmentManager.beginTransaction().apply {
//            add(R.id.layout, oneFragment)
//            add(R.id.layout, twoFragment)
//            add(R.id.layout, threeFragment)
//            commit()
//        }

        // Replace
//        supportFragmentManager.beginTransaction().apply {
//            add(R.id.layout, oneFragment)
//            add(R.id.layout, twoFragment)
//            commit()
//        }
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.layout, threeFragment)
//            commit()
//        }

        // Remove
//        supportFragmentManager.beginTransaction().apply {
//            add(R.id.layout, oneFragment)
//            add(R.id.layout, twoFragment)
//            commit()
//        }
//        supportFragmentManager.beginTransaction().apply {
//            remove(twoFragment)
//            commit()
//        }

        // AddTOBackStack
//        supportFragmentManager.beginTransaction().apply {
//            add(R.id.layout, oneFragment)
//            add(R.id.layout, twoFragment)
//            addToBackStack(null)
//            commit()
//        }
        supportFragmentManager.beginTransaction().apply {
            add(R.id.layout, oneFragment)
            addToBackStack(null)
            commit()
        }
        supportFragmentManager.beginTransaction().apply {
            add(R.id.layout, twoFragment)
            addToBackStack(null)
            commit()
        }
        supportFragmentManager.beginTransaction().apply {
            add(R.id.layout, threeFragment)
            addToBackStack(null)
            commit()
        }

        binding.backButton.setOnClickListener {
            Log.e("Click", "OK....")
            supportFragmentManager.popBackStack()

        }

    }
}