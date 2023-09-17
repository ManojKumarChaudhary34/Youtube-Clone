package com.example.youtubeclone.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeclone.R
import com.example.youtubeclone.models.VideoData

class MyVerticalAdapter(private var videoList: ArrayList<VideoData>) :
    RecyclerView.Adapter<MyVerticalAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.each_video, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.video_image.setImageResource(videoList[position].videoImage)
       holder.icon_image.setImageResource(videoList[position].iconImage)
        holder.tv_title.text= videoList[position].title
        holder.tv_sub_title.text= videoList[position].subTitle
    }

    class MyViewHolder(private var itemView: View) : RecyclerView.ViewHolder(itemView) {
        var video_image= itemView.findViewById<ImageView>(R.id.iv_video)
        var icon_image= itemView.findViewById<ImageView>(R.id.iv_logo)
        var tv_title= itemView.findViewById<TextView>(R.id.tv_title)
        var tv_sub_title= itemView.findViewById<TextView>(R.id.tv_subTitle)
    }
}