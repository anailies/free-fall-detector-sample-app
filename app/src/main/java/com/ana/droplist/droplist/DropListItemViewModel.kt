package com.ana.droplist.droplist

import androidx.lifecycle.ViewModel
import com.ana.falldetector.model.Drop
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.SimpleDateFormat
import java.util.*

class DropListItemViewModel(private val drop: Drop) : ViewModel() {

    private val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
    private val date = Date(drop.timestamp)

    fun getDropDuration(): String = BigDecimal(drop.duration).setScale(2, RoundingMode.HALF_UP).toPlainString() + " s"
    fun getDropTime(): String = simpleDateFormat.format(date)

}
