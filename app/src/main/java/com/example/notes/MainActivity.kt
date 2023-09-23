package com.example.notes

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
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

        val floatingAddBtn = findViewById<FloatingActionButton>(R.id.floating_add_btn)
        floatingAddBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, AddNotes::class.java)
            startActivity(intent)
            val editText = findViewById<EditText>(R.id.add_note_page)
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
        })

        val settingsBtn = findViewById<ImageView>(R.id.settings_btn)
        settingsBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, SettingsPage::class.java)
            startActivity(intent)
        })

    }
}