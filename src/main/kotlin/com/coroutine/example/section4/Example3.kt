package com.coroutine.example.section4

import kotlinx.coroutines.*

class Example3 {
}

fun main() = runBlocking<Unit> {
    val startTime = System.currentTimeMillis()
    // 실행 요청되는 부분이 없기에 코루틴이 실행되지 않고 생성 상태에 있다.
    val lazyJob: Job = launch(start = CoroutineStart.LAZY) {
//        println("[${getElapsedTime(startTime)}] launch 코루틴 지연 실행")
    } // 출력 없음

    delay(3000L)
    lazyJob.start() // 코루틴 실행 join() 함수를 사용해도 무방
}