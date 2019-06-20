package com.kaikaili.mykotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.activity_new_main.*

/**
 *
 * @author kaikaili
 * @date 2019-06-15
 */
class NewMainActivity: AppCompatActivity() {

    companion object {
        private const val PROCESS_CONTROL = 1
        private const val ARRAY_AND_SET = 2
        private const val CLASS_BASIC = 3
    }

    private var items = arrayOf(Item("流程控制", PROCESS_CONTROL),
        Item("数组集合", ARRAY_AND_SET),
        Item("类基础", CLASS_BASIC))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_main)
        setTitle(R.string.kotlin_interesting_team)

        val adapter: ListAdapter = ArrayAdapter<Item>(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter
        listView.setOnItemClickListener{ _, _, position, _ ->
            val item = listView.adapter.getItem(position)
            if (item is Item) {
                when(item.type) {
                    PROCESS_CONTROL -> startActivity(Intent(this, ProcessControlActivity::class.java))
                    ARRAY_AND_SET -> startActivity(Intent(this, ArraySetActivity::class.java))
                    CLASS_BASIC -> startActivity(Intent(this, ClassBasicActivity::class.java))
                    else -> {

                    }
                }
            }
        }
    }

    private inner class Item(var name: String, var type: Int) {
        override fun toString(): String {
            return name
        }
    }
}