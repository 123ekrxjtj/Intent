package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    companion object{
        val KeyName = "lastName"
        val TAG = "Orientation"
    }

    private lateinit var editText: EditText
    private val dataViewModel : CommonDataViewModel by lazy { 
        ViewModelProvider(this)[(CommonDataViewModel::class.java)]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate() 호출")

        //  val dataViewModel = ViewModelProvider(this).get(CommonDataViewModel::class.java)
        //  val dataViewModel = ViewModelProvider(this)[CommonDataViewModel::class.java]
        //  위쪽으로 이동함

        editText = findViewById(R.id.nameEditText)
        var s = dataViewModel.inputString
        //  var s = savedInstanceState?.getString(KeyName)
        editText.setText(s)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState() 호출")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState() 호출")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() 호출")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() 호출")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() 호출")
        
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() 호출")
        dataViewModel.saveString(editText.text.toString())
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() 호출")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() 호출")
    }
}