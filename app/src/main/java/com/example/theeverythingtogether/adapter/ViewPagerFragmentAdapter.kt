package com.example.theeverythingtogether.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.theeverythingtogether.fragments.DmFrag
import com.example.theeverythingtogether.fragments.MainPage

class ViewPagerFragmentAdapter(frm: FragmentActivity): FragmentStateAdapter(frm) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            return MainPage()
        }
        if(position == 1){
            return DmFrag()
        }
        return(Fragment())
    }
}