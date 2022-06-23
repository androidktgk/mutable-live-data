package com.govind8061.simplesimple

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var factLiveData=MutableLiveData<String>("This is a fact")

    fun updateFact(){
        factLiveData.value="Another Fact"
    }
}