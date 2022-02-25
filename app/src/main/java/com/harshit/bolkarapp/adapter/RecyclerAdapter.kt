package com.harshit.bolkarapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.harshit.bolkarapp.R
import com.harshit.bolkarapp.databinding.MembersSingleItemBinding
import com.harshit.bolkarapp.pojo.entities.Members
import com.harshit.bolkarapp.ui.HomeViewModel
import com.harshit.bolkarapp.utils.DiffUtilMembers

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var itemList: List<Members> = listOf()
    lateinit var homeViewModel: HomeViewModel

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val binding: MembersSingleItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.members_single_item, parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size

    fun update(updated: List<Members>?) {
        val old = itemList
        itemList = updated ?: listOf()
        DiffUtil.calculateDiff(DiffUtilMembers(old, itemList)).dispatchUpdatesTo(this)
    }

    inner class ViewHolder(private val binding: MembersSingleItemBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun bind(currentItem: Members){
            binding.item = currentItem
            binding.viewModel = homeViewModel
            binding.executePendingBindings()
        }
    }

}