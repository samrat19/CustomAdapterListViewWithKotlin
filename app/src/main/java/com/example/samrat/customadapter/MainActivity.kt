package com.example.samrat.customadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.userlist)
        var userArray : ArrayList<User> = ArrayList()
        userArray.add(User("Ami",12))
        userArray.add(User("tumi",13))
        userArray.add(User("se",15))
        userArray.add(User("ke",15))

        listView.adapter = Useradapter(applicationContext,userArray)
    }
}
