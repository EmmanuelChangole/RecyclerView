package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

class MainActivity : AppCompatActivity(),View.OnClickListener {
    var index:Int=0;
     val usersList:ArrayList<User> = ArrayList()
     val userAdapter=UserRecyclerAdapter(usersList);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         setUsers();

        recycler_view.adapter=userAdapter
        recycler_view.layoutManager=LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
        fab_button.setOnClickListener(this)
    }

    private fun setUsers() {
      usersList.clear();

    }

    override fun onClick(v: View?) {
        if (v == fab_button)
        {
            addUser()
        }

    }

    private fun addUser() {
         tvInfo.visibility=View.GONE
        usersList.add(index,User("Item ${index+1}","You have add  item ${index+1} to the list"))
        userAdapter.notifyDataSetChanged();
        index++

    }
}