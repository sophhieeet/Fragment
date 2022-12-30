package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity3 : AppCompatActivity() {

    lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        
        val viewPager = findViewById<ViewPager2>(R.id.myViewPager)
        val tabBar = findViewById<TabLayout>(R.id.tabBar)

        viewPagerAdapter = ViewPagerAdapter(this)
        viewPager.adapter = viewPagerAdapter

        TabLayoutMediator(tabBar, viewPager){ tab, position ->
            tab.text = "bar ${position + 1}"
        }.attach()
    }
}