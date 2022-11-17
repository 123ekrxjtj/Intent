package com.example.myapplication

import androidx.lifecycle.ViewModel

class CommonDataViewModel :ViewModel() {

    var inputString : String = ""

    fun saveString(s:String)
    {
        inputString = s
    }

}