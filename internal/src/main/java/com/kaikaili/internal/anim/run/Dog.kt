package com.kaikaili.internal.anim.run

import com.kaikaili.internal.base.IAnimal

/**
 *
 * @author kaikaili
 * @date 2019-06-18
 */
abstract class Dog: IAnimal {

    // 抽象属性不需要初始值
    abstract val footNum: Int

    abstract fun run()

    override fun breath() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun move() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    enum class Type {
        Teddy, Golden, Bichon
    }
}