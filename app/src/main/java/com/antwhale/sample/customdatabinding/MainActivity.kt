package com.antwhale.sample.customdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.antwhale.sample.customdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName

    private lateinit var binding: ActivityMainBinding
    val mainViewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainViewModel = mainViewModel

        mainViewModel.content.observe(this) {
            Log.d(TAG, "content: $it")
        }

    }
}