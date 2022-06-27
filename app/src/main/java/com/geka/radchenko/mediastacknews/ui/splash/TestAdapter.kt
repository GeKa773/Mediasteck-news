package com.geka.radchenko.mediastacknews.ui.splash

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil

import com.geka.radchenko.mediastacknews.base.BaseRecyclerAdapter
import com.geka.radchenko.mediastacknews.base.BaseViewHolder
import com.geka.radchenko.mediastacknews.databinding.ItemTestBinding

class TestAdapter :
    BaseRecyclerAdapter<TestAdapter.TestData, TestAdapter.TestHolder>(DiffCallback) {


    inner class TestHolder(private val binding: ItemTestBinding) :
        BaseViewHolder<TestData>(binding) {
        override fun bind(position: Int, item: TestData) {
            binding.data = item
        }

    }

    data class TestData(
        val id: Int, val t1: String, val t2: String
    )

    private companion object DiffCallback : DiffUtil.ItemCallback<TestData>() {
        override fun areItemsTheSame(oldItem: TestData, newItem: TestData): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: TestData, newItem: TestData): Boolean {
            return try {
                oldItem.id == newItem.id &&
                        oldItem.t1 == newItem.t1 &&
                        oldItem.t2 == newItem.t2

            } catch (e: Exception) {
                false
            }
        }

    }

    override fun getViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        return TestHolder(
            ItemTestBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        return TestHolder(
            ItemTestBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
}