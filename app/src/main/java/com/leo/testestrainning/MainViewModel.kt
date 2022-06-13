package com.leo.testestrainning

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _valueLiveData = MutableLiveData(0)
    val valueLiveData: LiveData<Int> = _valueLiveData

    fun increase() {
        _valueLiveData.value = valueLiveData.value?.plus(1)
    }
}