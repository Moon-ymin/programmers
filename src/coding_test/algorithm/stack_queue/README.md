# 큐와 스택

## 01. 큐(Queue)
FIFO 구조로 저장하는 형식

### 1) 큐의 기능
- Enqueue : 큐에 데이터를 넣는 기능
- Dequeue : 큐에서 데이터를 꺼내는 기능

### 2) 큐의 메서드
- boolean add(Object o)
  - 지정된 객체를 Queue에 추가
  - 성공하면 true 반환
  - 저장공간 부족하면 *illegalStateException* 발생
- Object remove()
  - Queue에서 객체를 꺼내 반환
  - 비어있으면 *NoSuchElementException* 발생
- Object element()
  - 삭제없이 요소를 읽어옴
  - peek과 달리 Queue가 비어있을 때 *NoSuchElementException* 발생
- boolean offer(Object o)
  - Queue에 객체를 저장
  - 성공하면 true, 실패하면 false 반환
- Object poll()
  - Queue에서 객체를 꺼내서 반환
  - 비어있으면 null 반환
- Object peek()
  - 삭제없이 요소를 읽어온다
  - Queue가 비어있으면 null 반환

### 3) 큐 사용 예제
```java
import java.util.LinkedList;

Queue<Integer> queue_int = new LinkedList<Integer>();
Queue<String> queue_str = new LinkedList<String>();

// 데이터 추가는 add 또는 offer 사용
queue_int.add(1);
queue_int.offer(2);

queue_int.poll();   // 큐의 첫 번째 값 반환, 해당 값은 큐에서 삭제
queue_int.remove(); // poll 과 동일
```

### 4) Queue의 Enqueue와 Dequeue 직접 구현하기
[ArrayList 활용 Queue 구현](Queue.java)

---
## 02. 스택 (Stack)
LIFO 방식으로 동작

### 1) Stack 의 메서드
- Object push(Object item)
  - Stack에 객체(item) 저장
- Object pop()
  - Stack의 맨 위에 저장된 객체를 꺼냄
  - 비었을 떄는 *EmptySearchException* 발생
- Object peek()
  - Stack의 맨 위에 저장된 객체를 반환
  - pop()과 달리 Stack에서 객체를 꺼내진 않음
  - 비었을 때는 *EmpthStackException* 발생
- boolean empty
  - Stack 이 비어있는지 확인
- int search(Object o)
  - Stack에서 주어진 객체 를 찾아서 그 위치를 반환, 못 찾으면 -1
  - *배열과 달리 위치가 1부터 시작*

### 2) 스택의 활용
- 재귀 알고리즘을 반복문을 통해 구현할 수 있게 해줌
- 실행 취소
- 백 트래킹
- 웹 브라우저 뒤로가기
- 문자열의 역순 출력

### 3) 스택의 push 와 pop 직접 구현하기

```java
import java.util.ArrayList;

public class Stack<T> {
  private ArrayList<T> stack = new ArrayList<>();
  
  // push
  public void push(T item){
      stack.add(item);
  }
  // pop
  public T pop(){
      if (stack.isEmpty()){
          return null;
      } else {
          return stack.remove( stack.size() -1 );
      }
  }
}
```
