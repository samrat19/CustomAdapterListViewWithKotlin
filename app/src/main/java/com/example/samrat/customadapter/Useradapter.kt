package com.example.samrat.customadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Useradapter(var context: Context , var user: ArrayList<User>): BaseAdapter() {

    private class ViewHolder(row : View?){

        var name : TextView = row?.findViewById(R.id.uname) as TextView
        var id : TextView = row?.findViewById(R.id.uno) as TextView

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view : View?
        var viewholder : ViewHolder

        if (convertView == null){

            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.user,convertView,false)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        }else{
            view = convertView
            viewholder = view.tag as ViewHolder
        }

        var user : User = getItem(position) as User
        viewholder.name.text = user.Name
        viewholder.id.text = user.Num.toString()
        return view as View
    }

    override fun getItem(position: Int): Any {
        return user.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return user.count()
    }

}