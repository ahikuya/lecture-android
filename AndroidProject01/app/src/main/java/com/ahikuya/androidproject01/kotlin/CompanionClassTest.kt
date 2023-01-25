package com.ahikuya.androidproject01.kotlin

class CompanionClassTest {
    companion object{
        var myName = "kim"

        fun printMyName(){
            println("내 이름은 ${myName} 입니다.")
        }
    }
}

fun main() {
    CompanionClassTest.printMyName()
}