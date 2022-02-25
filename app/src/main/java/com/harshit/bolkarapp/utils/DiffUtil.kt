package com.harshit.bolkarapp.utils

import androidx.recyclerview.widget.DiffUtil
import com.harshit.bolkarapp.pojo.entities.Members

class DiffUtilMembers(
    private val oldList: List<Members>,
    private val newList: List<Members>
): DiffUtil.Callback(){
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

}