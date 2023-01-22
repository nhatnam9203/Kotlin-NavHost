package com.example.navhost

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import java.util.jar.Attributes

class CustomItemVIew(context: Context, attrs: Attributes) : LinearLayout(context, attrs) {

    init{
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.custom_item_view, this,true)
    }

    private fun setText(type:String){
        when(type){
            "left" ->{

            }
            "right" ->{

            }
        }
    }

    private fun getText(){

    }
}