package com.ana.droplist.droplist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ana.falldetector.model.Drop


class DropListRvAdapter : RecyclerView.Adapter<DropListRvAdapter.ViewHolder>() {

    private var dropList: MutableList<Drop>? = null

    fun setItems(dropList: MutableList<Drop>?) {
        this.dropList = dropList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = com.ana.falltrackerapp.databinding.DropListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return dropList?.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val drop = dropList?.get(position)
        holder.bindView(drop!!)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(drop: Drop) {
            val binding: com.ana.falltrackerapp.databinding.DropListItemBinding = DataBindingUtil.getBinding(itemView)!!
            binding.viewModel = DropListItemViewModel(drop)
        }

    }

}