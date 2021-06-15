package com.recycler.view.base.adapter.using.kotlin.baseadapter.listener

import android.view.View

public interface OnRecyclerViewItemChildLongClick {
    fun onItemChildLongClick(viewChild: View, any: Any?, position: Int)
}