package com.example.youtubeclone.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone.R
import com.example.youtubeclone.models.CategoryDAta

class MyCategoryAdapter(private var categoryList: ArrayList<CategoryDAta>):
RecyclerView.Adapter<MyCategoryAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.each_category, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
         return categoryList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text= categoryList[position].categoryName
    }

    class MyViewHolder(private var itemView: View): RecyclerView.ViewHolder(itemView) {
            var name= itemView.findViewById<TextView>(R.id.tv_category)
    }
}