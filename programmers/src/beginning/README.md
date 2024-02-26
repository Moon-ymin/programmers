## 유클리드호제법
- 2개의 자연수(또는 정식) a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단, a>b)
a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
- 이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고, 다시 
r을 r'로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때 나누는 수가
a와 b의 최대공약수이다.

### 추가
- https://heoseongh.github.io/algorithm/Euclidean/
- 최대공약수(GCD, Greatest Common Divisor)
  - 유클리드 호제법 (O(logN)의 시간 복잡도)
    1. a를 b로 나눈 나머지를 r이라고 할 때 (단, a>b) a와 b의 최대 공약수는 b와 r의 최대공약수와 같다는 성질 이용
    2. b와 r의 최대 공약수 r0를 구하고, 다시 r을 r0으로 나눈 나머지를 구하는 과정을 반복하여(recursive) 나머지가 0이 되었을 때의 그 몫이 a와 b의 최대 공약수이다.
    
   public static int gcd(int a, int b) { // a > b 일때
     if(b == 0) return a;	// gcd를 찾았다면 그 몫을 return
     else return gcd(b, a % b);
   }

- 최소공배수(LCM, Least Common Muptiple)
  1. 최소 공배수 = 두 자연수의 곱 / 최대 공약수 (LCM = a * b / GCD)
    public static int lcm(int a, int b, int gcd) {
     return (a * b) / gcd
   }

---
## reverse() 메서드 
- https://velog.io/@jmjgirl/JAVA-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%92%A4%EC%A7%91%EA%B8%B0-reverse
- 저장되어 있는 문자열의 순서를 거꾸로 나열하는 메서드
- StringBuffer 클래스, StringBuilder 클래스의 메서드

### StringBuffer 클래스 
1. String 클래스는 인스턴스를 생성할 때 지정된 문자열을 변경할 수 없지만 StringBuffer 클래스는 변경 가능
2. 내부적으로 문자열 편집을 위한 버퍼(buffer)를 가지고 있으며, StringBuffer 인스턴스를 생성할 때 그 크기를 지정할 수 있다
3. 주요 메서드
   1. .append() : StringBuffer 인스턴스가 저장하고 있는 문자열 뒤에 덧붙인다
   2. .delete(int start, int end) : 시작위치(start) 부터 끝 위치(end) 사이에 있는 문자를 제거한다 (단, 끝 위치의 문자는 제외!)
   3. .deleteCharAt(int index) : 지정된 위치(index)의 문자를 제거한다.
   4. .insert(int pos, String str) : 두번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(pos)에 추가한다. (pos는 0부터 시작)
   5. .replace(int start, int end, string str) : 지정된 범위(start ~ end)의 문자들을 주어진 문자열로 바꾼다. (end 위치의 문자는 범위에 포함 되지않는다!)
   6. .reverse( ) : 문자열의 순서를 거꾸로 나열한다.
   7. .setCharAt(int index, char ch) : 지정된 위치의 문자를 주어진 문자(ch)로 바꾼다
   8. .toString( ) : StringBuffer 인스턴스의 문자열을 String으로 반환한다.
   9. .subString(int start) or .subString(int start, int end) : 지정된 범위 내의 문자열을 String으로 뽑아서 반환한다.

### StringBuillder 클래스
1. StringBuffer은 멀티쓰레드에 안전하도록 동기화되어있다.
   - 멀티쓰레드로 작성된 프로그램이 아닌 경우, StringBuffer의 동기화는 불필요하게 성능만 떨어뜨리게 된다.
   - 그래서 StringBuffer에서 쓰레드의 동기화만 뺀 StringBuilder을 사용한다

---
### List<Integer> <-> int[] 변환
배열 크기 선언의 어려움이 있을 때 : https://no-brain-dev.tistory.com/11
