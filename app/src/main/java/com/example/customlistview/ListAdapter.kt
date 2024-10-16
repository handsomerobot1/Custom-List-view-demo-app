package com.example.customlistview

import android.app.Activity
import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class ListAdapter(private val context:Activity,private val name:Array<String>,private val desccription:ArrayList<String>,private val image:Array<Int>):ArrayAdapter<String>(context,R.layout.item_layout,name) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
     val inflater=context.layoutInflater
        val rowView=inflater.inflate(R.layout.item_layout,null,true)

        val nameText=rowView.findViewById<TextView>(R.id.nameTxt)
        val descText=rowView.findViewById<TextView>(R.id.descTxt)
        val profileImg=rowView.findViewById<CircleImageView>(R.id.profileImg)

        nameText.text=name[position]
        descText.text=desccription[position]
        profileImg.setImageResource(image[position])

        return rowView
    }
}