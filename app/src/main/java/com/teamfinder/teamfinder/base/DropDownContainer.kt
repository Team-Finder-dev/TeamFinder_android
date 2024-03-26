package com.teamfinder.teamfinder.base

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.StyleRes
import com.teamfinder.teamfinder.R

class DropDownContainer @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    @AttrRes defStyleAttr: Int = 0,
    @StyleRes defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {
    init {
        LayoutInflater.from(context).inflate(R.layout.layout_drop_down_item, this, true)

        val textView = findViewById<TextView>(R.id.tv_title)

        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.DropDownContainer,
            defStyleAttr,
            defStyleRes
        ).apply {
            try {
                val title = getString(R.styleable.DropDownContainer_title) ?: ""

                textView.text = title
            } finally {
                recycle()
            }
        }
    }
}