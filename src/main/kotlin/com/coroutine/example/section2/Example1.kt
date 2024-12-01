package com.coroutine.example.section2

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Example1 {
}

fun main() = runBlocking<Unit>(CoroutineName("runBlocking 코루틴")) {
    println("[${Thread.currentThread().name}] runBlocking 코루틴 실행")

    launch(CoroutineName("launch 코루틴")) {
        println("[${Thread.currentThread().name}] launch 코루틴 실행")
    }
}
// -Dkotlinx.coroutines.debug 로 VM 옵션을 주면 디버깅 모드로 실행됨