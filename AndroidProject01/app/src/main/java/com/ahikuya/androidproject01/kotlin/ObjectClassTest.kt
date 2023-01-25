package com.ahikuya.androidproject01.kotlin

val objClass = object {
    var myName = "01"

    fun printMyName(){
        println("내 이름은 ${myName}")
    }

    fun returnMyName():String{
        return myName
    }
}

fun main() {
    objClass.printMyName()      // 에러
}

