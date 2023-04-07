package com.example.nestedrecyclerview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.adapter.ParentAdapter
import com.example.nestedrecyclerview.data.ChildItem
import com.example.nestedrecyclerview.data.parentItem

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private var parentList=ArrayList<parentItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this)

        addDataToList()
        val adapter= ParentAdapter(parentList)
        recyclerView.adapter=adapter
    }

    private fun addDataToList() {
        val childItem1=ArrayList<ChildItem>()
        childItem1.add(ChildItem("Java", R.drawable.java))
        childItem1.add(ChildItem("Kotlin", R.drawable.kotlin))
        childItem1.add(ChildItem("Xml", R.drawable.xml))
        childItem1.add(ChildItem("Jetpack Compose", R.drawable.jetpack_compose))

        parentList.add(parentItem("Android Development", R.drawable.android_development,childItem1))

        val childItem2=ArrayList<ChildItem>()
        childItem2.add(ChildItem("Html", R.drawable.html))
        childItem2.add(ChildItem("Css", R.drawable.css))
        childItem2.add(ChildItem("Javascript", R.drawable.javascript))


        parentList.add(parentItem("FrontEnd Development", R.drawable.frontend_development,childItem2))


        val childItem3=ArrayList<ChildItem>()
        childItem3.add(ChildItem("PHP", R.drawable.php))
        childItem3.add(ChildItem("MongoDB", R.drawable.mongodb))
        childItem3.add(ChildItem("Python", R.drawable.python))


        parentList.add(parentItem("BackEnd Development", R.drawable.backend,childItem3))



        val childItem4=ArrayList<ChildItem>()
        childItem4.add(ChildItem("GO", R.drawable.go))
        childItem4.add(ChildItem("Python", R.drawable.python))
        childItem4.add(ChildItem("Solidity", R.drawable.solidity))
        childItem4.add(ChildItem("Ruby", R.drawable.ruby))

        parentList.add(parentItem("BlockChain Development", R.drawable.blockchain,childItem4))



        val childItem5=ArrayList<ChildItem>()
        childItem5.add(ChildItem("MongoDB", R.drawable.mongodb))
        childItem5.add(ChildItem("ExpressJs", R.drawable.expressjs))
        childItem5.add(ChildItem("ReactNative", R.drawable.reactnative))
        childItem5.add(ChildItem("NodeJs", R.drawable.nodejs))

        parentList.add(parentItem("Mern Stack Development", R.drawable.fullstack,childItem5))


        val childItem6=ArrayList<ChildItem>()
        childItem6.add(ChildItem("MongoDB", R.drawable.mongodb))
        childItem6.add(ChildItem("ExpressJs", R.drawable.expressjs))
        childItem6.add(ChildItem("Angular", R.drawable.angular))
        childItem6.add(ChildItem("NodeJs", R.drawable.nodejs))

        parentList.add(parentItem("Mean Stack Development", R.drawable.fullstack,childItem6))
    }
}