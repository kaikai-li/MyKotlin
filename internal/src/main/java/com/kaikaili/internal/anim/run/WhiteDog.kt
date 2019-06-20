package com.kaikaili.internal.anim.run

/**
 *
 * @author kaikaili
 * @date 2019-06-18
 */
class WhiteDog: Dog() {
    override val footNum: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class Leg(length: Int) {
        var length: Int = length
    }

    class Eye(var color: String)
}