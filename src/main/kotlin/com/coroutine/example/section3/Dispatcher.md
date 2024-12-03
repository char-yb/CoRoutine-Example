Dispatcher

### Dispatcher.IO

네트워크 요청이나 DB 읽기 쓰기 같은 입출력 작업을 실행하는 디스패처
* 사용할 수 있는 스레드의 수: 64와 JVM에서 사용할 수 있는 프로세서의 수 중 큰 값
* 자식 코루틴은 별도로 Dispatcher를 설정하지 않으면 부모 코루틴에서 설정된 코루틴 Dispatcher를 그대로 사용한다.


### Dispatcher.Default
CPU 바운드 작업을 위한 디스패처
* CPU 바운드 작업: 이미지, 동영상 처리나 대용량 데이터 변환같은 끊이지 않고 연산이 필요한 작업.

만약 모든 Thread가 이미지 처리 작업을 위해 투입이 된다면 동영상 처리나 대용량 데이터 변환같은 작업은 대기해야 한다.
이런 경우에는 Dispatcher.Default를 사용하면 된다, limited Parallelism을 제공해 특정 작업 위에 사용할 수 있는 스레드의 수를 제한한다.