package com.tree.shu.elf.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tree.shu.elf.R
import kotlinx.android.synthetic.main.activity_daily_push_one.*
class DailyPushOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_push_one)
        toolbar.title = ""
        setSupportActionBar(toolbar)

    }
}
