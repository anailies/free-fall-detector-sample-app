package com.ana.droplist.droplist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ana.falldetector.service.SensorService
import com.ana.falltrackerapp.R
import com.ana.falltrackerapp.databinding.ActivityDropListBinding

class DropListActivity : AppCompatActivity() {

    private lateinit var viewModel: DropListViewModel

    private val adapter: DropListRvAdapter? = DropListRvAdapter()

    private lateinit var viewDataBinding: ActivityDropListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drop_list)

        //service is started here.
        val intent = Intent(this, SensorService::class.java)
        startService(intent)

        viewModel = ViewModelProviders.of(this).get(DropListViewModel::class.java)

        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_drop_list)
        viewDataBinding.viewModel = viewModel
        viewDataBinding.lifecycleOwner = this

        viewDataBinding.recyclerView.adapter = adapter
        viewDataBinding.recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }
}
