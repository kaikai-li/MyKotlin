package com.kaikaili.internal.anim.run

import com.kaikaili.internal.base.IAnimal
import com.kaikaili.internal.base.SizeDelegation
import kotlin.properties.Delegates

/**
 *
 * @author kaikaili
 * @date 2019-06-20
 */
class RedDog(whiteDog: WhiteDog): IAnimal by whiteDog {
    var size: Int by SizeDelegation()

    val name: String by lazy { "xiao" + "bai" }

    var observableColor: Int by Delegates.observable(3) {
        /*
        color代表被监听的属性
        old代表修改之前的值
        new代表新值
         */
        color, old, new ->
        // do something
    }

    var eyeNum: Int by Delegates.vetoable(2) {
        num, old, new ->
        new == old
    }
}