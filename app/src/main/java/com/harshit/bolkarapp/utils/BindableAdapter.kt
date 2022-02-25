package com.harshit.bolkarapp.utils

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.harshit.bolkarapp.adapter.RecyclerAdapter
import com.harshit.bolkarapp.pojo.entities.Members
import com.harshit.bolkarapp.ui.HomeViewModel


@BindingAdapter("assignList","assignViewModel", requireAll = true)
fun bindList(recyclerView: RecyclerView, list: List<Members>?, homeViewModel: HomeViewModel) {
    val adapter = getMemberAdapter(recyclerView)
    adapter.update(list)
    adapter.homeViewModel = homeViewModel
}

private fun getMemberAdapter(recyclerView: RecyclerView): RecyclerAdapter {
    return if (recyclerView.adapter != null && recyclerView.adapter is RecyclerAdapter) {
        recyclerView.adapter as RecyclerAdapter
    } else {
        val adapter = RecyclerAdapter()
        recyclerView.adapter = adapter
        adapter
    }
}





@BindingAdapter("setImage")
fun bindImage(imageView: ImageView, url: String?) {
    url?.let {
        Glide.with(imageView.context).load(url).into(imageView)
    }
}

@BindingAdapter("setDate")
fun bindDate(textView: TextView, date: String?) {
    date?.let {
        textView.text = DateHelper.formatDate(it)
    }
}