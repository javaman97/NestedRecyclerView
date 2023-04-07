package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.data.ChildItem
import com.example.nestedrecyclerview.R

class ChildAdapter(val childList:List<ChildItem>):RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {
    inner class ChildViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val logoTv: ImageView =itemView.findViewById(R.id.childLogoIv)
        val titleTv: TextView =itemView.findViewById(R.id.childTitleTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.child_item,parent,false)
        return ChildViewHolder(view)
    }

    override fun getItemCount(): Int {
       return childList.size
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val childItem=childList[position]
        holder.logoTv.setImageResource(childItem.logo)
        holder.titleTv.text=childItem.title
    }
}