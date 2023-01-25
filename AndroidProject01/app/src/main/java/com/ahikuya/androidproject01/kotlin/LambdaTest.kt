package com.ahikuya.androidproject01.kotlin



// 고차함수 정의
// 매개변수로 함수를 입력 받고 함수를 반환한다.
fun validSize(width: (Int) -> Boolean): () -> String{
    val result = if(width(50)){
        "valid"
    }else{
        "invalid"
    }
    return {result}
}

fun main() {
    val calcSize = {width:Int, height: Int -> width * height}       // 람다 함수를 선언하고 변수에 대입
    calcSize(20, 20)        // 람다 함수 실행

    val validSize = validSize({no -> no > 0})
    println(validSize())
}