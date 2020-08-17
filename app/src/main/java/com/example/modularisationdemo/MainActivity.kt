package com.example.modularisationdemo

import android.os.Bundle
import android.widget.Toast
import com.example.base_presentation.acvtivity.BaseActivity

class MainActivity : BaseActivity() {

    override fun layoutRes() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, getString(R.string.app_name), Toast.LENGTH_SHORT).show()
    }
}