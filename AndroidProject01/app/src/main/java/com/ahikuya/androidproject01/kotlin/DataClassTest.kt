package com.ahikuya.androidproject01.kotlin


// 일반 클래스 선언
class MyBasicClass(val name:String, val age:Int)

// 데이터 클래스 선언
data class MyDataClass(val name:String, val age:Int)

fun main() {
    val basic1 = MyBasicClass("01", 20)
    val basic2 = MyBasicClass("01", 20)
    println("basic equals = ${basic1.equals(basic2)}")
    println("basic toString = ${basic1.toString()}")

    val data1 = MyDataClass("02", 30)
    val data2 = MyDataClass("02", 30)
    println("data1 equals = ${data1.equals(data2)}")
    println("data1 toString = ${data1.toString()}")
}