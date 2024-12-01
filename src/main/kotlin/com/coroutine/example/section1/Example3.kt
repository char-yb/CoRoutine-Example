package com.coroutine.example.section1

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class Example3 {

}

fun main() {
    val executorService = Executors.newFixedThreadPool(2)

    // 작업 1
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업 1 시작")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] 작업 1 완료")
    }

    // 작업 2
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업 2 시작")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] 작업 2 완료")
    }

    // 작업 3
    executorService.submit {
        println("[${Thread.currentThread().name}] 작업 3 시작")
        Thread.sleep(2000L)
        println("[${Thread.currentThread().name}] 작업 3 완료")
    }

    executorService.shutdown()
}
/** ExecutorService
 * 스레드풀을 생성하고 관리하는 인터페이스
 * 스레드풀을 생성하고 작업을 스케줄링하는 메서드를 제공
 * 개발자가 더 이상 스레드를 직접 생성하고 관리할 필요가 없음
 *
 * Executor 프레임워크의 한계
 * 스레드 블로킹 발생(작업이 끝날 때까지 다음 작업을 수행하지 못함)
 */