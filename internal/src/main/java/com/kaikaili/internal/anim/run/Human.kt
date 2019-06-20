package com.kaikaili.internal.anim.run

import com.kaikaili.internal.base.IAnimal

/**
 *
 * @author kaikaili
 * @date 2019-06-19
 */
class Human: IAnimal {

    var dog: WhiteDog
    val eye: WhiteDog.Eye
    var redDog: RedDog

    init {
        dog = WhiteDog()
        val leg = this.dog.Leg(3)
        eye = WhiteDog.Eye("black")

        dog.drink()

        redDog = RedDog(dog)
        redDog.move()

        // 5
        redDog.size

        redDog.size = 6
    }

    fun WhiteDog.drink() {
        // do something
    }

    var WhiteDog.hairColor: String
    get() = eye.color
    set(value) {eye.color = value}

    override fun breath() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun move() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}