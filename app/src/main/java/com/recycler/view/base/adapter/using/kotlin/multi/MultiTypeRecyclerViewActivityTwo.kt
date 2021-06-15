package com.recycler.view.base.adapter.using.kotlin.multi

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.recycler.view.base.adapter.using.kotlin.R
import com.recycler.view.base.adapter.using.kotlin.baseadapter.listener.OnRecyclerViewItemChildClick
import com.recycler.view.base.adapter.using.kotlin.baseadapter.listener.OnRecyclerViewItemClick
import com.recycler.view.base.adapter.using.kotlin.model.Food
import com.recycler.view.base.adapter.using.kotlin.model.FoodMultiItem
import com.recycler.view.base.adapter.using.kotlin.utilities.LayoutManagerUtils
import java.util.*

class MultiTypeRecyclerViewActivityTwo : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var foodArrayListOne: ArrayList<Food>? = null
    private var foodArrayListTwo: ArrayList<Food>? = null
    private var foodMultiItems: MutableList<FoodMultiItem>? = null
    private var multiTypeItemRecyclerViewAdapter: MultiTypeItemRecyclerViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_type_recycler_view_two)
        initializeView()
        initializeObject()
        initializeEvent()
    }

    private fun initializeView() {
        recyclerView = findViewById(R.id.recyclerView)
    }

    private fun initializeObject() {
        foodArrayListOne = ArrayList()
        foodArrayListTwo = ArrayList()
        generateList()
        foodMultiItems = ArrayList()
        foodMultiItems!!.addAll(list1)
        foodMultiItems!!.addAll(list2)
        foodMultiItems!!.addAll(list3)
        foodMultiItems!!.addAll(list4)
        foodMultiItems!!.addAll(list5)
        foodMultiItems!!.addAll(list6)
        foodMultiItems!!.addAll(list7)
        foodMultiItems!!.addAll(list8)
        foodMultiItems!!.addAll(list9)
        foodMultiItems!!.addAll(list10)
        foodMultiItems!!.addAll(list11)
        foodMultiItems!!.addAll(list12)
        foodMultiItems!!.addAll(list13)
        foodMultiItems!!.addAll(list14)
        foodMultiItems!!.addAll(list15)
        foodMultiItems!!.addAll(list16)
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

    private val list1: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 0..2) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list2: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 0..2) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListTwo!![i]
                val value = 2
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list3: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 3..5) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list4: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 3..5) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListTwo!![i]
                val value = 2
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list5: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 6..8) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list6: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 6..8) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListTwo!![i]
                val value = 2
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list7: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 9..11) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list8: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 9..11) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListTwo!![i]
                val value = 2
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list9: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 12..14) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list10: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 12..14) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListTwo!![i]
                val value = 2
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list11: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 15..17) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list12: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 15..17) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListTwo!![i]
                val value = 2
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list13: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 18..20) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list14: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 18..19) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListTwo!![i]
                val value = 2
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list15: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 21..23) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 1
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }
    private val list16: List<FoodMultiItem>
        private get() {
            val multiItems: MutableList<FoodMultiItem> = ArrayList()
            var index = 0
            for (i in 24..25) {
                index++
                val multiItem = FoodMultiItem()
                multiItem.food = foodArrayListOne!![i]
                val value = 2
                multiItem.setItemType(value)
                multiItems.add(multiItem)
            }
            return multiItems
        }

    private fun generateList() {
        /* 26 */
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

        /* 20 */foodArrayListTwo!!.add(Food(R.drawable.jelly, "Jelly", "Created By Jelly"))
        foodArrayListTwo!!.add(Food(R.drawable.juice, "Juice", "Created By Juice"))
        foodArrayListTwo!!.add(Food(R.drawable.ketchup, "Ketchup", "Created By Ketchup"))
        foodArrayListTwo!!.add(Food(R.drawable.lemon, "Lemon", "Created By Lemon"))
        foodArrayListTwo!!.add(Food(R.drawable.lettuce, "Lettuce", "Created By Lettuce"))
        foodArrayListTwo!!.add(Food(R.drawable.loaf, "Loaf", "Created By Loaf"))
        foodArrayListTwo!!.add(Food(R.drawable.milk, "Milk", "Created By Milk"))
        foodArrayListTwo!!.add(Food(R.drawable.noodles, "Noodles", "Created By Noodles"))
        foodArrayListTwo!!.add(Food(R.drawable.pepper, "Pepper", "Created By Pepper"))
        foodArrayListTwo!!.add(Food(R.drawable.pickles, "Pickles", "Created By Pickles"))
        foodArrayListTwo!!.add(Food(R.drawable.pie, "Pie", "Created By Pie"))
        foodArrayListTwo!!.add(Food(R.drawable.pizza, "Pizza", "Created By Pizza"))
        foodArrayListTwo!!.add(Food(R.drawable.rice, "Rice", "Created By Rice"))
        foodArrayListTwo!!.add(Food(R.drawable.sausage, "Sausage", "Created By Sausage"))
        foodArrayListTwo!!.add(Food(R.drawable.spaguetti, "Spaguetti", "Created By Spaguetti"))
        foodArrayListTwo!!.add(Food(R.drawable.waterglass, "Waterglass", "Created By Waterglass"))
        foodArrayListTwo!!.add(Food(R.drawable.steak, "Steak", "Created By Steak"))
        foodArrayListTwo!!.add(Food(R.drawable.tea, "Tea", "Created By Tea"))
        foodArrayListTwo!!.add(Food(R.drawable.watermelon, "Watermelon", "Created By Watermelon"))
        foodArrayListTwo!!.add(Food(R.drawable.wine, "Wine", "Created By Wine"))
    }
}