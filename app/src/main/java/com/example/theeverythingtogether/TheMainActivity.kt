package com.example.theeverythingtogether

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.theeverythingtogether.adapter.ViewPagerFragmentAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TheMainActivity : AppCompatActivity() {
    private lateinit var BottomNavigationView: BottomNavigationView
    private lateinit var navController: NavController
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_main)
        BottomNavigationView = findViewById(R.id.bottomNavigationView)
        navController = findNavController(R.id.nav_host_fragment)
        BottomNavigationView.setupWithNavController(navController)
        tabLayout=findViewById(R.id.tabLayout)
        viewPager2=findViewById(R.id.viewPager2)
        viewPager2.adapter = ViewPagerFragmentAdapter(this)
        TabLayoutMediator(tabLayout,viewPager2){tab, position ->
            tab.text = "Tab ${position+1}"
        }.attach()


    }
}