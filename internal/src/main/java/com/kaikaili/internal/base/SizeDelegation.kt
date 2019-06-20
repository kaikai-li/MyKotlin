package com.kaikaili.internal.base

import kotlin.reflect.KProperty

/**
 *
 * @author kaikaili
 * @date 2019-06-20
 */
class SizeDelegation {

    private var defaultSize = 5

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return defaultSize
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newSize: Int) {
        defaultSize = newSize
    }
}