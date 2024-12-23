package com.coroutine.example.section4

import kotlinx.coroutines.*

class Example4 {
}

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val longJob: Job = launch(Dispatchers.Default) {
        repeat(10) { repeatTime ->
            delay(1000L)
            println("[${getElapsedTime(startTime)}] $repeatTime 번째 실행")
        }
    }

    delay(2500L)
    longJob.cancel()

//    longJob.cancelAndJoin()
//    executeAfterJobCancelled()
}

fun executeAfterJobCancelled() {
    println("[${Thread.currentThread().name}] 취소 후 실행")
}

