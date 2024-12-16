## 코루틴 순차처리
- "토큰 업데이트 후 네트워크 요청", "이미지 변환 후 업로드 요청"같이 작업 간에 선후 관계있는 작업들이 있다.
-> 이런 작업들이 만약 순차 처리가 안된다면 문제가 생기는데, 이런 작업들을 순차적으로 처리하려면 어떻게 해야할까?
- launch 함수를 사용하면 코루틴을 병렬로 실행할 수 있지만, 이런 경우에는 `join`을 사용하여 순차적으로 실행할 수 있다.
- 혹은 withContext로도 가능함

### joinAll 함수를 사용한 복수 코루틴 순차 처리
- 실제 개발 시에는 서로 독립적인 복수의 코루틴을 병렬 실행한 후 이들이 모두 완료됐을 때 다음 작업을 실행해야 하는 경우가 많다.
ex) 복수의 이미지 변환 후 업로드를 해야하는 경우
- 이런 경우에는 `joinAll` 함수를 사용하면 된다.
- 