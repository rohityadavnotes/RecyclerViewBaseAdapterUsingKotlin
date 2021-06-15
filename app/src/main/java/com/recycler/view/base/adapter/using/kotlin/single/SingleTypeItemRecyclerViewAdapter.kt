package com.recycler.view.base.adapter.using.kotlin.single

import com.recycler.view.base.adapter.using.kotlin.model.Food
import com.recycler.view.base.adapter.using.kotlin.R
import com.recycler.view.base.adapter.using.kotlin.baseadapter.adapter.BaseSingleItemAdapter
import com.recycler.view.base.adapter.using.kotlin.baseadapter.adapter.BaseViewHolder

class SingleTypeItemRecyclerViewAdapter : BaseSingleItemAdapter<Food?, BaseViewHolder?>() {
    override val viewHolderLayoutResId: Int
        protected get() = R.layout.recycler_view_item_row_a

    init {
        addChildClickViewIds(R.id.foodImageViewOne)
    }

    override fun convert(viewHolder: BaseViewHolder?, t: Food?, position: Int) {
        viewHolder!!.setImageResource(R.id.foodImageViewOne, t!!.foodImage)
        viewHolder.setText(R.id.foodNameTextViewOne, t.foodName)
        viewHolder.setText(R.id.foodDescriptionTextViewOne, t.foodDescription)
    }
}