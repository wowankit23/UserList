package com.test.mobileprogarmming.ui.listing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.test.mobileprogarmming.model.Constants
import com.test.mobileprogarmming.model.User
import com.test.mobileprogarmming.R
import kotlinx.android.synthetic.main.list_item_user.view.*

class UserAdapter(private val context: Context, private val list: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(private val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) {
            itemView.setOnClickListener {

            }
            itemView.tvName.text = user.name
            Glide.with(context).load(Constants.IMAGE_URL)
                .apply(RequestOptions().override(400, 400).centerInside().placeholder(R.drawable.placehoder)).into(itemView.ivPoster)
            itemView.tvEmail.text = user.email
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_user, parent, false)
        return UserViewHolder(context, view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun updateData(newList: List<User>) {
        list.clear()
        val sortedList = newList.sortedBy { user -> user.name }
        list.addAll(sortedList)
        notifyDataSetChanged()
    }
}