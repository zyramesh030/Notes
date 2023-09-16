package com.example.notes

import android.content.Context
import android.graphics.drawable.Drawable
import android.media.Image
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ImageSpan
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

open class VPAdapter(fm: FragmentManager, behaviorResumeOnlyCurrentFragment: Int) : FragmentPagerAdapter(fm) {

    var fragList: ArrayList<Fragment> = ArrayList()
    var imageList: ArrayList<Int> = ArrayList()

    override fun getCount(): Int {
        return fragList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragList.get(position)
    }

    open fun addFragment(frag: Fragment){
        fragList.add(frag)
    }
}