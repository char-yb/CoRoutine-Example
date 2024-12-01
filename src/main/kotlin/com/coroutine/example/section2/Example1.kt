package com.coroutine.example.section2

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Example1 {
}

fun main() = runBlocking<Unit> {
    println("[${Thread.currentThread().name}] runBlocking 코루틴 실행")

    launch {
        println("[${Thread.currentThread().name}] launch 코루틴 실행")
    }
}