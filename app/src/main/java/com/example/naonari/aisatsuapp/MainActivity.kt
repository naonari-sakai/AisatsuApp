package com.example.naonari.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.NotificationCompatSideChannelService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (hour<10 && hour>= 2){text1.text="おはよう"}
                else if (hour< 18 && hour>= 10){text1.text="こんにちは"}
                    else{text1.text="こんばんは"}
            },
            13,0,true)
        timePickerDialog.show()}
}