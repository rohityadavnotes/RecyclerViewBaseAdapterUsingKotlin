package com.recycler.view.base.adapter.using.kotlin.baseadapter.listener

import android.view.View

public interface OnRecyclerViewItemClick {
    fun onItemClick(itemView: View, any: Any?, position: Int)
}