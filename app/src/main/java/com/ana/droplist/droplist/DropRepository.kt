package com.ana.droplist.droplist

import androidx.lifecycle.LiveData
import com.ana.falldetector.init.FallDetector
import com.ana.falldetector.model.Drop

object DropRepository {

    fun getAllDrops(): LiveData<List<Drop>>? {
        return FallDetector.getAllDrops()
    }
}