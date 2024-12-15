package com.coroutine.example.section4

import kotlinx.coroutines.*

class Example1 {
}

fun main() = runBlocking {
    val updateTokenJob = withContext(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 토큰 업데이트 시작")
        delay(100L)
        println("[${Thread.currentThread().name}] 토큰 업데이트 완료")
    }
    // join() 함수를 사용해 순차 처리하기
    // Job 객체의 join 함수를 사용하면, 코루틴 순차 처리가 가능하다. -> 만약 A 코루틴이 완료된 후에 B 코루틴이 실행되어야 한다면, B 코루틴이 실행되기 전에 A 코루틴에 대해 join 함수를 호출하면 된다.
//    updateTokenJob.join()

    val networkCallJob = withContext(Dispatchers.IO) {
        println("[${Thread.currentThread().name}] 네트워크 요청")
    }
}