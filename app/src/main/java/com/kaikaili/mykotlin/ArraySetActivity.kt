package com.kaikaili.mykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_array_set.*

/**
 * Array, Set
 * @author kaikaili
 * @date 2019-06-16
 */
class ArraySetActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array_set)

        // array
        var intArray = intArrayOf(5, 3, 9)
        intArray.reverse()
        var result = ""
        for (num in intArray) {
            result += num
        }

        arrayText.text = result

        // set
        var set = setOf(1, 2, 3)
        var mutableSet = mutableSetOf("java", "kotlin")
        mutableSet.filter { "j" in it }

        var list = listOf(1, 2, 3)
        var mutableList = mutableListOf("java", "kotlin")
        list.elementAt(1)

        var map = mapOf(1 to "one", 2 to "two", 3 to "three")
        map[2] // two
        var mutableMap = mutableMapOf("j" to "java", "k" to "kotlin")
        mutableMap["j"] = "android"
    }
}