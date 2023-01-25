package com.ahikuya.androidproject01.kotlin

fun main() {
    val calcSize = {width:Int, height: Int -> width * height}       // 람다 함수를 선언하고 변수에 대입
    calcSize(20, 20)        // 람다 함수 실행
}