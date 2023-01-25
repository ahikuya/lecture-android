package com.ahikuya.androidproject01.kotlin


open class Parent(){
    var parentName: String = "parentName"

    open fun printMyName(){

    }
}

val objClass = object: Parent() {
    var myName = "01"

    override fun printMyName(){
        println("내 이름은 ${myName}")
    }

    fun returnMyName():String{
        return myName
    }
}

fun main() {
    objClass.printMyName()
}

