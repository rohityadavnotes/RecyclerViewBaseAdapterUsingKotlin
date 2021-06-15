package com.recycler.view.base.adapter.using.kotlin.multi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recycler.view.base.adapter.using.kotlin.R
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.recycler.view.base.adapter.using.kotlin.baseadapter.listener.OnRecyclerViewItemChildClick
import com.recycler.view.base.adapter.using.kotlin.baseadapter.listener.OnRecyclerViewItemClick
import com.recycler.view.base.adapter.using.kotlin.model.Food
import com.recycler.view.base.adapter.using.kotlin.model.FoodMultiItem
import com.recycler.view.base.adapter.using.kotlin.utilities.LayoutManagerUtils
import java.util.*

class MultiTypeRecyclerViewActivityOne : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var foodArrayListOne: ArrayList<Food>? = null
    private var foodMultiItems: MutableList<FoodMultiItem>? = null
    private var multiTypeItemRecyclerViewAdapter: MultiTypeItemRecyclerViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_type_recycler_view_one)
        initializeView()
        initializeObject()
        initializeEvent()
    }

    private fun initializeView() {
        recyclerView = findViewById(R.id.recyclerView)
    }

    private fun initializeObject() {
        foodArrayListOne = ArrayList()
        generateList()
        foodMultiItems = ArrayList()
        foodMultiItems!!.addAll(list)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = LayoutManagerUtils.getLinearLayoutManagerVertical(this)
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        val itemDecoration: ItemDecoration =
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView!!.addItemDecoration(itemDecoration)
        multiTypeItemRecyclerViewAdapter = MultiTypeItemRecyclerViewAdapter()
        multiTypeItemRecyclerViewAdapter!!.addArrayList(foodMultiItems)
        recyclerView!!.adapter = multiTypeItemRecyclerViewAdapter
    }

    private fun initializeEvent() {
        multiTypeItemRecyclerViewAdapter!!.setOnRecyclerViewItemClick(object :
            OnRecyclerViewItemClick {
            override fun onItemClick(itemView: View, any: Any?, position: Int) {
                val foodMultiItem: FoodMultiItem = any as FoodMultiItem
                Toast.makeText(
                    applicationContext,
                    "The position you click is ：" + position + "==" + foodMultiItem.food!!.foodName,
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        multiTypeItemRecyclerViewAdapter!!.setOnRecyclerViewItemChildClick(object :
            OnRecyclerViewItemChildClick {
            override fun onItemChildClick(viewChild: View, any: Any?, position: Int) {
                val foodMultiItem: FoodMultiItem = any as FoodMultiItem

                when (viewChild.id) {
                    R.id.foodImageViewOne -> Toast.makeText(
                        applicationContext,
                        "You clicked on foodImageViewOne ：" + foodMultiItem.food!!.foodName,
                        Toast.LENGTH_SHORT
                    ).show()
                    R.id.foodImageViewTwo -> Toast.makeText(
                        applicationContext,
                        "You clicked on foodImageViewTwo ：" + foodMultiItem.food!!.foodName,
                        Toast.LENGTH_SHORT
                    ).show()
                    else -> {
                    }
                }
            }
        })
    }

    private val list: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in foodArrayListOne!!.indices) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = index % 2 + 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }

    private fun generateList() {
        foodArrayListOne!!.add(Food(R.drawable.aubergine, "Aubergine", "Created By Aubergine"))
        foodArrayListOne!!.add(Food(R.drawable.beer, "Beer", "Created By Beer"))
        foodArrayListOne!!.add(
            Food(
                R.drawable.birthdaycake,
                "Birthday Cake",
                "Created By Birthday Cake"
            )
        )
        foodArrayListOne!!.add(Food(R.drawable.biscuit, "Biscuit", "Created By Biscuit"))
        foodArrayListOne!!.add(Food(R.drawable.bread, "Bread", "Created By Bread"))
        foodArrayListOne!!.add(Food(R.drawable.breakfast, "Breakfast", "Created By Breakfast"))
        foodArrayListOne!!.add(Food(R.drawable.brochettes, "Brochettes", "Created By Brochettes"))
        foodArrayListOne!!.add(Food(R.drawable.burger, "Burger", "Created By Burger"))
        foodArrayListOne!!.add(Food(R.drawable.carrot, "Carrot", "Created By Carrot"))
        foodArrayListOne!!.add(Food(R.drawable.cheese, "Cheese", "Created By Cheese"))
        foodArrayListOne!!.add(Food(R.drawable.chicken, "Chicken", "Created By Chicken"))
        foodArrayListOne!!.add(Food(R.drawable.chocolate, "Chocolate", "Created By Chocolate"))
        foodArrayListOne!!.add(Food(R.drawable.cocktail, "Cocktail", "Created By Cocktail"))
        foodArrayListOne!!.add(Food(R.drawable.coffee, "Coffee", "Created By Coffee"))
        foodArrayListOne!!.add(Food(R.drawable.coke, "Coke", "Created By Coke"))
        foodArrayListOne!!.add(Food(R.drawable.covering, "Covering", "Created By Covering"))
        foodArrayListOne!!.add(Food(R.drawable.croissant, "Croissant", "Created By Croissant"))
        foodArrayListOne!!.add(Food(R.drawable.cup, "Cup", "Created By Cup"))
        foodArrayListOne!!.add(Food(R.drawable.cupcake, "Cupacke", "Created By Cupacke"))
        foodArrayListOne!!.add(Food(R.drawable.donut, "Donut", "Created By Donut"))
        foodArrayListOne!!.add(Food(R.drawable.egg, "Egg", "Created By Egg"))
        foodArrayListOne!!.add(Food(R.drawable.fish, "Fish", "Created By Fish"))
        foodArrayListOne!!.add(Food(R.drawable.fries, "Fries", "Created By Fries"))
        foodArrayListOne!!.add(Food(R.drawable.honey, "Honey", "Created By Brown"))
        foodArrayListOne!!.add(Food(R.drawable.icecream, "Icecream", "Created By Icecream"))
        foodArrayListOne!!.add(Food(R.drawable.jam, "Jam", "Created By Jam"))
        foodArrayListOne!!.add(Food(R.drawable.jelly, "Jelly", "Created By Jelly"))
        foodArrayListOne!!.add(Food(R.drawable.juice, "Juice", "Created By Juice"))
        foodArrayListOne!!.add(Food(R.drawable.ketchup, "Ketchup", "Created By Ketchup"))
        foodArrayListOne!!.add(Food(R.drawable.lemon, "Lemon", "Created By Lemon"))
        foodArrayListOne!!.add(Food(R.drawable.lettuce, "Lettuce", "Created By Lettuce"))
        foodArrayListOne!!.add(Food(R.drawable.loaf, "Loaf", "Created By Loaf"))
        foodArrayListOne!!.add(Food(R.drawable.milk, "Milk", "Created By Milk"))
        foodArrayListOne!!.add(Food(R.drawable.noodles, "Noodles", "Created By Noodles"))
        foodArrayListOne!!.add(Food(R.drawable.pepper, "Pepper", "Created By Pepper"))
        foodArrayListOne!!.add(Food(R.drawable.pickles, "Pickles", "Created By Pickles"))
        foodArrayListOne!!.add(Food(R.drawable.pie, "Pie", "Created By Pie"))
        foodArrayListOne!!.add(Food(R.drawable.pizza, "Pizza", "Created By Pizza"))
        foodArrayListOne!!.add(Food(R.drawable.rice, "Rice", "Created By Rice"))
        foodArrayListOne!!.add(Food(R.drawable.sausage, "Sausage", "Created By Sausage"))
        foodArrayListOne!!.add(Food(R.drawable.spaguetti, "Spaguetti", "Created By Spaguetti"))
        foodArrayListOne!!.add(Food(R.drawable.waterglass, "Waterglass", "Created By Waterglass"))
        foodArrayListOne!!.add(Food(R.drawable.steak, "Steak", "Created By Steak"))
        foodArrayListOne!!.add(Food(R.drawable.tea, "Tea", "Created By Tea"))
        foodArrayListOne!!.add(Food(R.drawable.watermelon, "Watermelon", "Created By Watermelon"))
        foodArrayListOne!!.add(Food(R.drawable.wine, "Wine", "Created By Wine"))
    }
}