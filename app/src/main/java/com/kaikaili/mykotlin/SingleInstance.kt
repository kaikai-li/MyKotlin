package com.kaikaili.mykotlin

/**
 *
 * @author kaikaili
 * @date 2019-06-20
 */
object SingleInstance {

    var value: Int = 0

    init {
        value = 3
    }

    fun plus(a: Int) = value + a
}