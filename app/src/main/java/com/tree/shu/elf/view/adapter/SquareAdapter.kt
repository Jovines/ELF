package com.tree.shu.elf.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tree.shu.elf.R
import kotlinx.android.synthetic.main.recycle_item_square.view.*

/**
 * Created by Tree on 2019/6/12 15:16
 */

class SquareAdapter : RecyclerView.Adapter<ViewHodler>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHodler {
        return ViewHodler(LayoutInflater.from(viewGroup.context).inflate(R.layout.recycle_item_square,viewGroup,false))
    }

    override fun onBindViewHolder(holder: ViewHodler, position: Int) {

    }

    override fun getItemCount(): Int {
        return 9
    }
}

class ViewHodler(item: View) : RecyclerView.ViewHolder(item){
    init {
        item.iv_background_picture
    }
}

