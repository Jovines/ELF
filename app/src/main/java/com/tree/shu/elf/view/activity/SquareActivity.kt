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
import kotlinx.android.synthetic.main.include_content_evaluate.*
import java.util.ArrayList

/**
 * Created by Tree on 2019/6/11 17:11
 */

class SquareActivity : AppCompatActivity() {

    //目前的心情
    var presentMood = R.id.mood_happy

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)
        toolbar.title = ""
        setSupportActionBar(toolbar)
        //recyclerview的配置
        rv_square.layoutManager = LinearLayoutManager(this)
        rv_square.adapter = SquareAdapter()
        var list = getMoodObject()
        //表情控件的控制
        gl_yes_evaluate_content.addView(list.filter { it.id == presentMood }[0])
        list.forEach {
            it.setOnClickListener {
                if (it.id == presentMood) {
                    list.forEach {
                        ll_no_evaluate_content
                    }
                }
            }
        }
    }

    private fun getMoodObject(): ArrayList<View> {
        var a: ViewGroup = View.inflate(this, R.layout.layout_mood, null) as ViewGroup
        var moodList = ArrayList<View>()
        for (i in 0 until a.childCount) {
            moodList.add(a.getChildAt(i))
        }
        a.removeAllViews()
        return moodList
    }

}
