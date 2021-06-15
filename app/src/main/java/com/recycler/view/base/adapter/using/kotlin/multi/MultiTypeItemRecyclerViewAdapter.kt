package com.recycler.view.base.adapter.using.kotlin.multi

import com.recycler.view.base.adapter.using.kotlin.R
import com.recycler.view.base.adapter.using.kotlin.baseadapter.adapter.BaseMultipleItemAdapter
import com.recycler.view.base.adapter.using.kotlin.baseadapter.adapter.BaseViewHolder
import com.recycler.view.base.adapter.using.kotlin.model.FoodMultiItem

class MultiTypeItemRecyclerViewAdapter :
    BaseMultipleItemAdapter<FoodMultiItem?, BaseViewHolder?>() {

    init {
        addItemType(1, R.layout.recycler_view_item_row_a)
        addItemType(2, R.layout.recycler_view_item_row_b)
        addChildClickViewIds(R.id.foodImageViewOne, R.id.foodImageViewTwo)
    }

    override fun convert(viewHolder: BaseViewHolder?, t: FoodMultiItem?, position: Int) {
        val food = t!!.food
        val itemViewType = viewHolder!!.itemViewType
        when (itemViewType) {
            1 -> {
                viewHolder.setImageResource(R.id.foodImageViewOne, food!!.foodImage)
                viewHolder.setText(R.id.foodNameTextViewOne, food.foodName)
                viewHolder.setText(R.id.foodDescriptionTextViewOne, food.foodDescription)
            }
            2 -> {
                viewHolder.setImageResource(R.id.foodImageViewTwo, food!!.foodImage)
                viewHolder.setText(R.id.foodNameTextViewTwo, food.foodName)
                viewHolder.setText(R.id.foodDescriptionTextViewTwo, food.foodDescription)
            }
            else -> {
            }
        }
    }
}