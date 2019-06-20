package com.kaikaili.mykotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 *
 * @author kaikaili
 * @date 2019-06-17
 */
class ClassBasicActivity: AppCompatActivity() {

    lateinit var value: String
    //lateinit val time: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_basic)


        var address1 = Address("TJ", "JN")
        var address2 = Address("CN")

        val user = User("小明", "123", 18)
        var (n, p, a) = user
        var (_, password, age) = user

        var pair = Pair(1, "ok")
        var triple = Triple(1, 2, 3)

        SingleInstance.value = 5
        // 10
        SingleInstance.plus(5)
    }

    inner class Address constructor(city: String, street: String) {
        var myAddress: String? = null
        init {
            myAddress = city + street
        }

        constructor(country: String) : this("TJ", "DL")
    }

    class User(name: String, pass: String, age: Int) {
        var name = name
        var pass = pass
        var age = age

        operator fun component1(): String {
            return name
        }

        operator fun component2(): String {
            return pass
        }

        operator fun component3(): Int {
            return age
        }
    }

    data class Result(var status: Int, var msg: String) {
        var content: String? = null
        constructor(status: Int, msg: String, content: String): this(status, msg) {
            this.content = content
        }
    }
}