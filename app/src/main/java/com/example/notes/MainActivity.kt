package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.Tab
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager2)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)

        var adapter = VPAdapter(this)
        viewPager.adapter = adapter
        val tabLayoutMediator = TabLayoutMediator(tabLayout, viewPager
        ) { tab: Tab, position: Int ->
            when (position) {
                0 -> tab.setIcon(R.drawable.drawable_notes_all)
                1 -> tab.setIcon(R.drawable.drawable_tasks)

            }
        }
        tabLayoutMediator.attach()


    }
}