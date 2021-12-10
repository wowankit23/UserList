package com.test.mobileprogarmming.ui.listing

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.test.mobileprogarmming.R

import com.test.mobileprogarmming.model.User
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import  com.test.mobileprogarmming.model.Result
import android.widget.Toast

import androidx.lifecycle.viewModelScope

import androidx.recyclerview.widget.RecyclerView

import androidx.recyclerview.widget.ItemTouchHelper
import com.test.mobileprogarmming.data.local.UserDao
import kotlinx.coroutines.launch


/**
 * Shows list of users
 */
@AndroidEntryPoint
class ListingActivity : AppCompatActivity() {

    private val list = ArrayList<User>()
    private var viewModel : ListingViewModel?=null
    private lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        subscribeUi()
        SwipeItem()
    }

     private fun init() {
         viewModel=ViewModelProvider(this).get(ListingViewModel::class.java)


        title = "User List"
        val layoutManager = LinearLayoutManager(this)
        rvUsers.layoutManager = layoutManager

        val dividerItemDecoration = DividerItemDecoration(
            rvUsers.context,
            layoutManager.orientation
        )

         rvUsers.addItemDecoration(dividerItemDecoration)
        userAdapter = UserAdapter(this, list)
         rvUsers.adapter = userAdapter

    }

    private fun subscribeUi() {
        viewModel!!.userList.observe(this, Observer { result ->

            when (result.status) {
                Result.Status.SUCCESS -> {
                    result.data?.data?.let { list ->
                        userAdapter.updateData(list)
                    }
                    loading.visibility = View.GONE
                }

                Result.Status.ERROR -> {
                    result.message?.let {
                        showError(it)
                    }
                    loading.visibility = View.GONE
                }

                Result.Status.LOADING -> {
                    loading.visibility = View.VISIBLE
                }
            }

        })
    }

    private fun showError(msg: String) {
        Snackbar.make(vParent, msg, Snackbar.LENGTH_INDEFINITE).setAction("DISMISS") {
        }.show()
    }
private fun SwipeItem(){
    var simpleItemTouchCallback: ItemTouchHelper.SimpleCallback = object :
        ItemTouchHelper.SimpleCallback(
            0,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT or ItemTouchHelper.DOWN or ItemTouchHelper.UP
        ) {
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean {
            return false
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
            //Remove swiped item from list and notify the RecyclerView
            val position = viewHolder.adapterPosition
            viewModel!!.deleteUser(list[position])
            list!!.removeAt(position)
            userAdapter.notifyDataSetChanged()
        }
    }
    val itemTouchHelper = ItemTouchHelper(simpleItemTouchCallback)
    itemTouchHelper.attachToRecyclerView(rvUsers)
}

    }
