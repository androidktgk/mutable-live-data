package com.govind8061.simplesimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel:MainViewModel
    var tvShowCount:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvShowCount=findViewById(R.id.tvShowData)

        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.factLiveData.observe(this, Observer {
            tvShowCount?.text=it
        })

        findViewById<Button>(R.id.btnIncrement).setOnClickListener {
            mainViewModel.updateFact()
        }
    }


}