package com.tree.shu.elf.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.view.ViewGroup
import com.tree.shu.elf.R
import com.tree.shu.elf.base.BaseActivity
import com.tree.shu.elf.view.adapter.SquareAdapter
import kotlinx.android.synthetic.main.activity_square.*
import java.util.ArrayList

/**
 * Created by Tree on 2019/6/11 17:11
 */

class SquareActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
        rv_square.layoutManager = LinearLayoutManager(this)
        rv_square.adapter = SquareAdapter()
        getMoodObject()
    }

    private fun getMoodObject():ArrayList<View> {
        var a: ViewGroup = View.inflate(this, R.layout.layout_mood, null) as ViewGroup
        var moodList = ArrayList<View>()
        for (i in 0 until a.childCount) {
            moodList.add(a.getChildAt(i))
        }
        a.removeAllViews()
        return moodList
    }
}
