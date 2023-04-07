package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.data.parentItem

class ParentAdapter(private val parentList: List<parentItem>):RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {

    inner class ParentViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val logoTv: ImageView =itemView.findViewById(R.id.parentLogoIv)
        val titleTv: TextView =itemView.findViewById(R.id.parentTitleTv)
        val childRecyclerView: RecyclerView =itemView.findViewById(R.id.langRecyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.parent_item,parent,false)
        return ParentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return parentList.size
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {

        val parentItem=parentList[position]
        holder.logoTv.setImageResource(parentItem.logo)
        holder.titleTv.text=parentItem.title

        holder.childRecyclerView.setHasFixedSize(true)
        holder.childRecyclerView.layoutManager=GridLayoutManager(holder.itemView.context,3)

        val adapter= ChildAdapter(parentItem.mList)
        holder.childRecyclerView.adapter=adapter
    }
}