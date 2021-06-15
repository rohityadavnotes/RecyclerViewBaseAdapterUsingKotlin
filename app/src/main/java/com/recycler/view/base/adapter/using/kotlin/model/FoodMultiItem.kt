package com.recycler.view.base.adapter.using.kotlin.model

import com.recycler.view.base.adapter.using.kotlin.baseadapter.adapter.MultiItemEntity

class FoodMultiItem : MultiItemEntity {
    var food: Food? = null
    private var itemType = 0

    override fun getItemType(): Int {
        return itemType
    }

    fun setItemType(itemType: Int) {
        this.itemType = itemType
    }
}