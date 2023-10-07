package com.example.youtubeclone.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.youtubeclone.R
import com.example.youtubeclone.databinding.ActivityMainBinding
import com.example.youtubeclone.fragments.HomeFragment
import com.example.youtubeclone.fragments.LibraryFragment
import com.example.youtubeclone.fragments.NewAddFragment
import com.example.youtubeclone.fragments.ShortsFragment
import com.example.youtubeclone.fragments.SubscriptionFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.bottomNavigationView.itemIconTintList = null //this must be included for changing icon of bottomNav
        replaceWithFragment(HomeFragment())
        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.id_home ->replaceWithFragment(HomeFragment())
                    R.id.id_shorts-> replaceWithFragment(ShortsFragment())
                    R.id.id_new -> replaceWithFragment(NewAddFragment())
                    R.id.id_subscription -> replaceWithFragment(SubscriptionFragment())
                    R.id.id_library ->  replaceWithFragment(LibraryFragment())
                else -> {

                }
            }
            true
        }


    }
    private fun replaceWithFragment(fragment: Fragment) {
        val fragmentManager= supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}