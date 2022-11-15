package com.example.mybroadcastreciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class MyBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {

        when(p1?.action){
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                if(p1.extras?.getBoolean("state") == true){
                    Toast.makeText(p0, "رحلة سعيدة .. شكرا", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(p0, "حمدلله ع السلامة ي اصدقاء", Toast.LENGTH_SHORT).show()

                }
            }
        }
    }
}