package com.ana.droplist.apphelper

import android.app.Application
import com.ana.falldetector.init.FallDetector

class App : Application () {

    /*
    Fall detector library is initialized here and passed the context.
     */

    private val runnable : Runnable = Runnable {
        run {
            FallDetector.initialize(this)
        }
    }

    override fun onCreate() {
        super.onCreate()
        FallDetector.applicationContext = this
        Thread(runnable).start()
    }
}