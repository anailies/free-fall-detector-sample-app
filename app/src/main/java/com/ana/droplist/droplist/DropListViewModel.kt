package com.ana.droplist.droplist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ana.falldetector.model.Drop

class DropListViewModel : ViewModel() {

    var dropList : LiveData<List<Drop>>? = DropRepository.getAllDrops()

}