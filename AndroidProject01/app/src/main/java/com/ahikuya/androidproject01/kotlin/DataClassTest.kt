package com.ahikuya.androidproject01.kotlin

class MyBasicClass(val name:String, val age:Int)

data class MyDataClass(val name:String, val age:Int)

fun main() {
    val basic1 = MyBasicClass("01", 20)
    val basic2 = MyBasicClass("01", 20)
    println("basic equals = ${basic1.equals(basic2)}")

    val data1 = MyDataClass("02", 30)
    val data2 = MyDataClass("02", 30)
    println("basic equals = ${data1.equals(data2)}")
}