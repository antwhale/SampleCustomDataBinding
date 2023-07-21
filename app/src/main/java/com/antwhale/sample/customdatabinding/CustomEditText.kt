package com.antwhale.sample.customdatabinding

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.antwhale.sample.customdatabinding.databinding.CustomEdittextBinding

class CustomEditText(context: Context, attributeSet: AttributeSet? = null) : FrameLayout(context, attributeSet) {
    private lateinit var binding : CustomEdittextBinding
    val editText
        get() = binding.mainEditText
    init {
        binding = CustomEdittextBinding.inflate(LayoutInflater.from(context), this, true)
        binding.emojiTextView.text = "\uD83D\uDE00"
    }

}