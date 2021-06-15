package com.recycler.view.base.adapter.using.kotlin.baseadapter.listener

import android.view.View

public interface OnRecyclerViewItemLongClick {
    fun onItemLongClick(itemView: View, any: Any?, position: Int)
}