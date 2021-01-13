package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_items.view.*

class UserRecyclerAdapter(val usersList:ArrayList<User> ):RecyclerView.Adapter<UserRecyclerAdapter.UserViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder
    {
      var view:View= LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return UserViewHolder(view);

    }

    override fun getItemCount(): Int {
      return usersList.size;
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int)
    {
       holder.desc.text=usersList.get(position).des
       holder.name.text=usersList.get(position).name;



    }


    class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {

      val name:TextView=itemView.tvName
      val desc:TextView=itemView.tvdesc


    }



}