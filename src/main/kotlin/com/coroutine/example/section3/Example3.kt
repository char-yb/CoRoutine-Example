package com.coroutine.example.section3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Example3 {
}

fun main() = runBlocking<Unit> {
    launch(Dispatchers.IO) {
//    launch(Dispatchers.Default) {
        launch {
            println("[${Thread.currentThread().name}] 작업 1 실행")
        }
        launch {
            println("[${Thread.currentThread().name}] 작업 2 실행")
        }
        launch {
            println("[${Thread.currentThread().name}] 작업 3 실행")
        }
    }

}