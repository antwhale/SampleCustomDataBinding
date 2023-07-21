package com.antwhale.sample.customdatabinding

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener

@BindingAdapter("content")
fun setContentOnEditText(view: CustomEditText, newValue: String) {
    val oldValue = view.editText.text.toString()

    if(oldValue != newValue) {
        view.editText.setText(newValue)
    }
}

@BindingAdapter("contentAttrChanged")
fun setInverseBindingListenerOnEditText(view: CustomEditText, listener: InverseBindingListener?) {
    val watcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun afterTextChanged(p0: Editable?) {
            listener?.onChange()
        }
    }
    view.editText.addTextChangedListener(watcher)
}

@InverseBindingAdapter(attribute = "content", event = "contentAttrChanged")
fun getContentOnEditText(view: CustomEditText) = view.editText.text.toString()


