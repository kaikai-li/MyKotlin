package com.kaikaili.mykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_process_control.*

/**
 * if, when, for
 * @author kaikaili
 * @date 2019-06-15
 */
class ProcessControlActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_process_control)

        // if
        ageBtn.setOnClickListener {
            if (TextUtils.isEmpty(ageText.text)) {
                return@setOnClickListener
            }

            var age: Int = ageText.text.toString().toInt()
            var type = if (age > 60) "老年人" else if (age > 20) "中年人" else "青年人"
            ageResultText.text = getString(R.string.age_result_str, type)
        }

        // when
        whenBtn.setOnClickListener{
            if (TextUtils.isEmpty(ageText.text)) {
                return@setOnClickListener
            }

            var age = ageText.text.toString().toInt()
            when {
                age > 60 ->"老年人"
                age > 20 -> "中年人"
                else -> "青年人"
            }
        }

        // for
        var nums = arrayOf(1, 2, 3)
        var sum = 0
        for (num in nums) {
            sum += num
        }

        outer@ for (num in nums) {
            for (value in nums) {
                if (value == 2) {
                    break@outer
                }
            }
        }
    }
}