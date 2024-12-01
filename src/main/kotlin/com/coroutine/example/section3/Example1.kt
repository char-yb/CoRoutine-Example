package com.coroutine.example.section3

import kotlinx.coroutines.*

class Example1 {
}

val singleThreadDispatcher: CoroutineDispatcher = newSingleThreadContext("SingleThread")

fun main() = runBlocking<Unit> {
    launch(singleThreadDispatcher) {
        println("[${Thread.currentThread().name}] 실행")
    }
}