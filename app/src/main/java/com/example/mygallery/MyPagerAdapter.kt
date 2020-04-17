package com.example.mygallery

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    //뷰페이저가 표시할 프래그먼트 목록
    private val items = ArrayList<Fragment>()

    //

    /**
     * Return the Fragment associated with a specified position.
     * position 위치의 프래그먼트
     */
    override fun getItem(position: Int): Fragment {
        return items[position]
    }

    /**
     * Return the number of views available.
     * item 개수
     */
    override fun getCount(): Int {
        return items.size
    }

    /**
     * 아이템 갱신
     */
    fun updateFraments(items: List<Fragment>) {
        this.items.addAll(items)
    }

}