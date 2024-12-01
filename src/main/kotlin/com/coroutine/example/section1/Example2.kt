package com.coroutine.example.section1

import java.lang.Thread.currentThread
import kotlin.concurrent.thread

class Example2: Thread() {
    override fun run() {
        println("[${currentThread().name}] 시작")
        Thread.sleep(2000L)
        println("[${currentThread().name}] 종료")
    }
}

fun main() {
    println("[${currentThread().name}] 시작")
    thread {
        println("[${currentThread().name}] 시작")
        Thread.sleep(2000L)
        println("[${currentThread().name}] 종료")
    }
    Thread.sleep(1000L)
    println("[${currentThread().name}] 종료")
}
/** Executor 프레임워크 등장
 * 스레드의 집합인 스레드풀을 미리 생성해놓고, 작업을 요청받으면 쉬고 있는 스레드에 작업을 분배할 수 있는 시스템
 * 스레드를 생성하고 삭제하는 비용을 줄이고, 스레드의 수를 제한하여 시스템의 부하를 조절할 수 있음
 */