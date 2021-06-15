package com.recycler.view.base.adapter.using.kotlin.baseadapter.listener

import android.view.View

public interface OnRecyclerViewItemChildClick {
    fun onItemChildClick(viewChild: View, any: Any?, position: Int)
}