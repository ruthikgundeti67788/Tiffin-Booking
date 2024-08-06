package com.tiffinbooking.ui.application

import android.app.Application
import com.google.firebase.FirebaseApp
import com.tiffinbooking.ui.model.OrderModel

class AppConfig : Application() {
    companion object {
        val list = ArrayList<OrderModel>()
    }
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(applicationContext)
    }


}