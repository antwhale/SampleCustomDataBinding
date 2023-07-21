package com.antwhale.sample.customdatabinding

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val content = MutableLiveData("")
    val TAG = MainViewModel::class.java.simpleName

    init {
        Log.d(TAG, "MainViewModel init")
    }
}