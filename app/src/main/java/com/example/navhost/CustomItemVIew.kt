package com.example.navhost

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.example.navhost.databinding.CustomItemViewBinding

class CustomItemVIew(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {


    private lateinit var text_left: TextView
    private lateinit var text_right: TextView

    init{
        val inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.custom_item_view, this,true)
        val typedArray: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomItemVIew) as TypedArray
        val val_text_left = typedArray.getText(R.styleable.CustomItemVIew_text_left) ?: "text left"
        val val_text_right = typedArray.getText(R.styleable.CustomItemVIew_text_right) ?: "text right"

        text_left = view.findViewById<TextView>(R.id.id_custom_view_text_left)
        text_right = view.findViewById<TextView>(R.id.id_custom_view_text_right)

        text_left.text = val_text_left?.toString()
        text_right.text = val_text_right?.toString()

    }

    public fun setText(type:String, textString: String? = "text"){
        when(type){
            "left" ->{
                text_left.text = textString
            }
            "right" ->{
                text_right.text = textString
            }
        }
    }

    public fun getText(type:String){
        when(type){
            "left" ->{

            }
            "right" ->{
            }
        }
    }
}
