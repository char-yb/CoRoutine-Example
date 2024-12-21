package com.coroutine.example.section4

import kotlinx.coroutines.*

class Example4 {
}

fun main() = runBlocking {
    val longJob: Job = launch(Dispatchers.Default) {
        Thread.sleep(1000L)
        println("[${Thread.currentThread().name}] launch 동작")
    }

    longJob.cancelAndJoin()

    executeAfterJobCancelled()
}

fun executeAfterJobCancelled() {
    println("[${Thread.currentThread().name}] 취소 후 실행")
}