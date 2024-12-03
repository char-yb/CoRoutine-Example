package com.coroutine.example.section3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Example3 {
}

fun main() = runBlocking<Unit> {
    val imageProcessingDispatcher = Dispatchers.Default.limitedParallelism(2)
//    // Default
//    repeat(100) {
//        launch(imageProcessingDispatcher) {
//            Thread.sleep(1000)
//            println("[${Thread.currentThread().name}] 이미지 처리 완료")
//        }
//    }


//    // IO
//    // 다른 작업에 방해받지 않아야 하는 중요 작업이 있을 경우 사용
//    val dedicatedDispatcher = Dispatchers.IO.limitedParallelism(2)
//    repeat(100) {
//        launch(dedicatedDispatcher) {
//            Thread.sleep(1000)
//            println("[${Thread.currentThread().name}] 작업 실행")
//        }
//    }


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