package com.recycler.view.base.adapter.using.kotlin.single

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.recycler.view.base.adapter.using.kotlin.model.Food
import com.recycler.view.base.adapter.using.kotlin.R
import com.recycler.view.base.adapter.using.kotlin.baseadapter.listener.OnRecyclerViewItemChildClick
import com.recycler.view.base.adapter.using.kotlin.baseadapter.listener.OnRecyclerViewItemClick
import java.util.*

class SingleTypeRecyclerViewActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var foodArrayList: ArrayList<Food>? = null
    private var singleTypeItemRecyclerViewAdapter: SingleTypeItemRecyclerViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_type_recycler_view)
        initializeView()
        initializeObject()
        initializeEvent()
    }

    private fun initializeView() {
        recyclerView = findViewById(R.id.recyclerView)
    }

    private fun initializeObject() {
        foodArrayList = ArrayList()
        generateList()
        recyclerView!!.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView!!.layoutManager = linearLayoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        val itemDecoration: ItemDecoration =
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView!!.addItemDecoration(itemDecoration)
        singleTypeItemRecyclerViewAdapter = SingleTypeItemRecyclerViewAdapter()
        singleTypeItemRecyclerViewAdapter!!.addArrayList(foodArrayList)
        recyclerView!!.adapter = singleTypeItemRecyclerViewAdapter
    }

    private fun initializeEvent() {
        singleTypeItemRecyclerViewAdapter!!.setOnRecyclerViewItemChildClick(object :
            OnRecyclerViewItemChildClick {
            override fun onItemChildClick(viewChild: View, any: Any?, position: Int) {
                val food: Food = any as Food
                when (viewChild.id) {
                    R.id.foodImageViewOne -> Toast.makeText(
                        applicationContext,
                        "You clicked on foodImageViewOne ：" + food.foodDescription,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        })

        singleTypeItemRecyclerViewAdapter!!.setOnRecyclerViewItemClick(object :
            OnRecyclerViewItemClick {
            override fun onItemClick(itemView: View, any: Any?, position: Int) {
                val food: Food = any as Food

                val toast = Toast.makeText(
                    applicationContext,
                    "Click On Button 2" + food.foodName,
                    Toast.LENGTH_SHORT
                )
                toast.show()
            }
        })
    }

    private fun generateList() {
        foodArrayList!!.add(Food(R.drawable.aubergine, "Aubergine", "Created By Aubergine"))
        foodArrayList!!.add(Food(R.drawable.beer, "Beer", "Created By Beer"))
        foodArrayList!!.add(
            Food(
                R.drawable.birthdaycake,
                "Birthday Cake",
                "Created By Birthday Cake"
            )
        )
        foodArrayList!!.add(Food(R.drawable.biscuit, "Biscuit", "Created By Biscuit"))
        foodArrayList!!.add(Food(R.drawable.bread, "Bread", "Created By Bread"))
        foodArrayList!!.add(Food(R.drawable.breakfast, "Breakfast", "Created By Breakfast"))
        foodArrayList!!.add(Food(R.drawable.brochettes, "Brochettes", "Created By Brochettes"))
        foodArrayList!!.add(Food(R.drawable.burger, "Burger", "Created By Burger"))
        foodArrayList!!.add(Food(R.drawable.carrot, "Carrot", "Created By Carrot"))
        foodArrayList!!.add(Food(R.drawable.cheese, "Cheese", "Created By Cheese"))
        foodArrayList!!.add(Food(R.drawable.chicken, "Chicken", "Created By Chicken"))
        foodArrayList!!.add(Food(R.drawable.chocolate, "Chocolate", "Created By Chocolate"))
        foodArrayList!!.add(Food(R.drawable.cocktail, "Cocktail", "Created By Cocktail"))
        foodArrayList!!.add(Food(R.drawable.coffee, "Coffee", "Created By Coffee"))
        foodArrayList!!.add(Food(R.drawable.coke, "Coke", "Created By Coke"))
        foodArrayList!!.add(Food(R.drawable.covering, "Covering", "Created By Covering"))
        foodArrayList!!.add(Food(R.drawable.croissant, "Croissant", "Created By Croissant"))
        foodArrayList!!.add(Food(R.drawable.cup, "Cup", "Created By Cup"))
        foodArrayList!!.add(Food(R.drawable.cupcake, "Cupacke", "Created By Cupacke"))
        foodArrayList!!.add(Food(R.drawable.donut, "Donut", "Created By Donut"))
        foodArrayList!!.add(Food(R.drawable.egg, "Egg", "Created By Egg"))
        foodArrayList!!.add(Food(R.drawable.fish, "Fish", "Created By Fish"))
        foodArrayList!!.add(Food(R.drawable.fries, "Fries", "Created By Fries"))
        foodArrayList!!.add(Food(R.drawable.honey, "Honey", "Created By Brown"))
        foodArrayList!!.add(Food(R.drawable.icecream, "Icecream", "Created By Icecream"))
        foodArrayList!!.add(Food(R.drawable.jam, "Jam", "Created By Jam"))
        foodArrayList!!.add(Food(R.drawable.jelly, "Jelly", "Created By Jelly"))
        foodArrayList!!.add(Food(R.drawable.juice, "Juice", "Created By Juice"))
        foodArrayList!!.add(Food(R.drawable.ketchup, "Ketchup", "Created By Ketchup"))
        foodArrayList!!.add(Food(R.drawable.lemon, "Lemon", "Created By Lemon"))
        foodArrayList!!.add(Food(R.drawable.lettuce, "Lettuce", "Created By Lettuce"))
        foodArrayList!!.add(Food(R.drawable.loaf, "Loaf", "Created By Loaf"))
        foodArrayList!!.add(Food(R.drawable.milk, "Milk", "Created By Milk"))
        foodArrayList!!.add(Food(R.drawable.noodles, "Noodles", "Created By Noodles"))
        foodArrayList!!.add(Food(R.drawable.pepper, "Pepper", "Created By Pepper"))
        foodArrayList!!.add(Food(R.drawable.pickles, "Pickles", "Created By Pickles"))
        foodArrayList!!.add(Food(R.drawable.pie, "Pie", "Created By Pie"))
        foodArrayList!!.add(Food(R.drawable.pizza, "Pizza", "Created By Pizza"))
        foodArrayList!!.add(Food(R.drawable.rice, "Rice", "Created By Rice"))
        foodArrayList!!.add(Food(R.drawable.sausage, "Sausage", "Created By Sausage"))
        foodArrayList!!.add(Food(R.drawable.spaguetti, "Spaguetti", "Created By Spaguetti"))
        foodArrayList!!.add(Food(R.drawable.waterglass, "Waterglass", "Created By Waterglass"))
        foodArrayList!!.add(Food(R.drawable.steak, "Steak", "Created By Steak"))
        foodArrayList!!.add(Food(R.drawable.tea, "Tea", "Created By Tea"))
        foodArrayList!!.add(Food(R.drawable.watermelon, "Watermelon", "Created By Watermelon"))
        foodArrayList!!.add(Food(R.drawable.wine, "Wine", "Created By Wine"))
    }
}