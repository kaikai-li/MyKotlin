package com.kaikaili.internal.anim.fly

/**
 *
 * @author kaikaili
 * @date 2019-06-18
 */
internal class FlyBird: Bird() {

    override var footNum: Int = 4

    override fun fly () {

    }

    fun eatSomething() {
        eat()
    }
}