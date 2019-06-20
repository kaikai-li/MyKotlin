package com.kaikaili.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.io.File

typealias FileTable = MutableMap<String, MutableList<File>>

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.content_text_view);
        val value : Int = 5;
        //val nullInt: Int = null;
        textView.text = "Value is ${value}";

        //val a: Int? = 1 // 一个装箱的 Int (java.lang.Integer)
        //val b: Long? = a // 隐式转换产生一个装箱的 Long (java.lang.Long)
        //print(b == a) // 惊！这将输出“false”鉴于 Long 的 equals() 会检测另一个是否也为 Long

        val nullStr : String? = null
        if (nullStr != null) {
            nullStr.length
        }

        val valStr : String;
        valStr = "1"
        //valStr = "2"
        //nullStr!!.length

        //var nullValue : Int = testNull(5)

        var fileTable: FileTable?;

        var rangeClose = 3..5
        Log.d("my_kotlin", "rangeClose is $rangeClose")
        for (i in rangeClose) {
            print(i)  // 3,4,5
        }

        var rangeHalf = 3 until 5
        for (i in rangeHalf) {
            print(i) // 3,4
        }

        var rangeDown = 5 downTo 3
        for (i in rangeDown) {
            print(i) // 5,4,3
            Log.d("my_kotlin", "i=$i")
        }

        var rangeStep = 3..7 step 2
        for (i in rangeStep) {
            print(i) // 3,5,7
        }

        var j : Int = 0;
        val nums = arrayOf(1, 2, 3);
        for (index in 0 until nums.size) {
            j += index;
        }

        val range2 = 5 downTo 3 step 2;

        var p1 = Point(4, 10);
        var p2 = Point(5, 15);
        for (i in p1..p2) {
            println(i) //1,2,3
        }
        var distance = p1 - p2;
        var area = p1 * p2;
        val minusView : TextView = findViewById(R.id.minus_text_view)
        minusView.text = "distance between ${p1} and ${p2} is ${distance}"
        val timesView : TextView = findViewById(R.id.times_text_view)
        timesView.text = "area of ${p1} and ${p2} is ${area}"

        // if分支作为表达式
        val ageView : TextView = findViewById(R.id.age_text_view)
        ageView.text = if (value > 60) {
            "老年人"
        } else if (value > 40) {
            "中年人"
        } else {
            //"123"
            "青年人"
        }

        // when 分支
        val score = 'B'
        var scoreStr : String
        when(score) {
            'A' -> scoreStr = "优秀"
            'B' -> scoreStr = "良好"
            'C' -> scoreStr = "中"
            'D' -> scoreStr = "及格"
            else -> scoreStr = "不及格"
        }
        when(score) {
            'A', 'B' -> scoreStr = "优秀"
            'C', 'D' -> scoreStr = "中"
            else -> scoreStr = "不及格"
        }
        when(score) {
            'A' - 4, 'B' - 4 -> scoreStr = "优秀"
            'C', 'D' -> scoreStr = "中"
            else -> scoreStr = "不及格"
        }
        when(p1) {
            p1 -> println(p1)
            p2 -> println(p2)
            else -> println("empty")
        }

        // in, !in
        when(value) {
            in 1..3 -> println("1..3")
            in 3..6 -> println("3..6")
            in 6..10 -> println("6..10")
            else -> println("0")
        }

        // when 代替 if-else
        when {
            value > 60 -> println("老年人")
            value > 40 -> println("中年人")
            else -> println("青年人")
        }

        // for-in
        for (i in 1 until 5) {
            println(i)
        }

        // 标签
        outer@ for (i in 1 until 5) {
            for (j in 0 until 3) {
                if (j == 1) {
                    // 跳出outer标签所标识的循环
                    break@outer
                    // 忽略outer标签所指定的循环中的当次循环剩下的语句
                    continue@outer
                }
            }
        }

        // Array
        val i = 0
        var arr = Array(3) {"kotlin"}
        var arr0 = IntArray(5) {0}
        var arr1 = arrayOf("java", "android", "kotlin")
        var arr2 = arrayOfNulls<Int>(5)
        var arr3 = emptyArray<Long>()
        var arr4 = intArrayOf(1, 2, 3)

        for (i in 0 until arr4.size) {
            println(arr4[i])
            println(arr4.get(i))
            arr4[i] = i
            arr4.set(i, i)
        }

        for (str in arr1) {
            println(str)
        }

        for (i in arr.indices) {
            println(arr[i])
        }

        arr0.get(arr0.lastIndex)

        for ((index, value) in arr2.withIndex()) {
            println("Value of $index is $value")
        }

        var strList = ArrayList<String>()
        strList.add("1")

        var strSet : Set<String> = setOf("Java", "Kotlin", "Android")
        var strSet2 : MutableSet<String> = mutableSetOf("C", "Java")
        var strSet3 = hashSetOf<String>("1", "2", "3")
        strSet.all { it.length > 3 }

        for (str in strSet) {
            println(str)
        }

        strSet2.forEach { println(it) }
        strSet3.clear()
        var it = strSet2.iterator();
        while (it.hasNext()) {
            var str = it.next()
            if (str.length < 3) {
                it.remove()
            }
        }

        var strMap : HashMap<String, Int> = hashMapOf("one" to 1, "two" to 2, "three" to 3)
        for (en in strMap.entries) {
            println(en.key + en.value)
        }

        for (key in strMap.keys) {
            println(strMap[key])
        }

        for ((key, value) in strMap) {
            println(key + value)
        }

        strMap["one"] = 10
    }

    // is, !is
    fun realValue(value: Any) = when(value) {
        is String -> value.toInt()
        is Double -> value.toInt()
        is Int -> value
        else -> 0
    }

    fun testNull(value : Int) : Int? {
        if (value > 3) {
            return null;
        }

        return 123
    }
}

data class Point(val x: Int, val y: Int) {
    operator fun minus(target: Point) : Double {
        return Math.hypot((this.x - target.x).toDouble(),
            (this.y - target.y).toDouble());
    }

    operator fun rangeTo(target: Point) : IntRange {
        return IntRange(1, 3)
    }
}

// 扩展方法的形式
operator fun Point.times(target: Point) : Int {
    return Math.abs(this.x - target.x) * Math.abs(this.y - target.y);
}
