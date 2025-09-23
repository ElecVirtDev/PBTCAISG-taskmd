## 13-1 컬렉션 프레임워크

- **컬렉션 프레임워크**: 널리 알려져있는 자료구조(Data Structure)를 사용해서 객체들을 효율적으로 추가·삭제·검색할 수 있도록 인터페이스와 구현 클래스들을 `java.util` 패키지에서 제공한다. 이들을 총칭해서 **컬렉션 프레임워크(Collection Framework)**라고 한다.
- **List 컬렉션**: 배열과 비슷하게 객체를 인덱스로 관리한다. 배열과의 차이점은 저장 용량이 자동으로 증가하며, 객체를 저장할 때 자동 인덱스가 부여된다는 것이다. 추가·삭제·검색을 위한 다양한 메소드가 제공된다. 동일한 객체를 중복으로 저장할 수 있고, null도 저장할 수 있다.
- **Set 컬렉션**: 저장 순서가 유지되지 않는다. 객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있다. Set 컬렉션은 수학의 집합과 비슷하며, 집합은 순서와 상관없고 중복이 허용되지 않기 때문이다.
- **Map 컬렉션**: 키(Key)와 값(Value)으로 구성된 `Map.Entry` 객체를 저장하는 구조를 갖고 있다. `Entry`는 Map 인터페이스 내부에 선언된 중첩 인터페이스다. 여기서 키와 값은 모두 객체이며, 키는 중복으로 저장될 수 없으나 값은 중복으로 저장될 수 있다. 만약 기존에 저장된 키와 동일한 키로 값을 저장할 경우 기존의 값은 없어지고 새로운 값으로 대체된다.

### 확인 문제 및 풀이

1. List 컬렉션은 인덱스로 객체를 관리하며, 중복 저장을 허용한다. Set 컬렉션은 순서를 유지하지 않으며, 중복 저장을 허용하지 않는다. Map 컬렉션은 키와 값으로 구성된 `Map.Entry`를 저장한다.

   1-4. List와 Set은 서로 null을 저장할 수 있는 정도가 다르다. List의 경우 null을 여러 번 저장할 수 있지만, Set은 한 번만 저장할 수 있다.

2. List 컬렉션에서 대표적인 구현 클래스로는 `ArrayList·Vector·LinkedList`가 있다. 멀티 스레드 환경에서는 ArrayList보다는 Vector가 스레드에 안전하다. 중간 위치에 객체를 빈번히 삽입하거나 제거할 경우에는 `LinkedList`를 사용하는 것이 좋다.

   2-3. ArrayList에서 객체를 삭제했을 때 삭제된 위치는 빈 공간이 되지 않는다.

3. Set 컬렉션에서 대표적인 구현 클래스로는 `HashSet·LinkedHashSet·TreeSet`이 있으며, Set 컬렉션에서 객체를 하나씩 꺼내오고 싶다면 `Iterator`를 이용해야 한다. HashSet은 `hashCode()`와 `equals()`를 이용해서 중복된 객체를 판별한다.

   3-4. Set 컬렉션에는 null을 저장할 수 있다.

4. Map 컬렉션에서 대표적인 구현 클래스로는 `HashMap·Hashtable·TreeMap`이 있으며, HashMap과 Hashtable은 `hashCode()`와 `equals()`를 이용해서 중복 키를 판별한다. 멀티 스레드 환경에서는 HashMap보다 Hashtable이 스레드에 안전하다.

   4-4. Map 컬렉션에는 다른 키로 객체를 중복해서 저장할 수 있다.

5. 싱글 스레드 환경에서 `Board` 객체를 저장 순서에 맞게 읽고 싶다. 가장 적합한 컬렉션을 생성하게끔 작성하기
   `List<Board>` 변수 = new `ArrayList<Board>`

6. 싱글 스레드 환경에서 학번(String)을 키로, 점수(Integer)를 값으로 저장하는 가장 적합한 컬렉션을 생성하게끔 작성하기
   `Map<String, Integer>` 변수 = new `HashMap<String, Integer>`

7. `BoardDao` 객체의 `getBoardList()` 메소드를 호출하려면 `List<Board>` 타입의 컬렉션을 리턴한다. `ListExample` 클래스를 실행할 때 다음과 같이 출력될 수 있도록 `BoardDao`의 `getBoardList()` 메소드를 작성해보기

```
//ListExample.java, BoardDao 사용 클래스
package sec01.verify.exam07;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
```

```
//Board.java, 게시물 클래스
package sec01.verify.exam07;

public class Board {
	private String title;
	private String content;

	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() { return title; }
	public String getContent() { return content; }
}
```

```
//BoardDao.java, 게시물을 가져오는 클래스
package sec0101.verify.exam07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> list = new ArrayList<Board>();
	list.address(new Board("제목1", "내용1"));
	list.address(new Board("제목2", "내용2"));
	list.address(new Board("제목3", "내용3"));

	return list;
}
```

8. "`HashSet`에 `Student` 객체를 저장하고자 한다. 학번이 같으면 동일한 `Student`라 가정하고 중복 저장이 되지 않게 하고싶다. `Student` 클래스에서 재정의해야 하는 `hashCode()`와 `equals()` 메소드의 내용을 채워보자. `Student`의 해시코드는 학번이라고 가정하기."

```
//HashSetExample.java
package sec01.verify.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();

		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));	//학번이 같으므로 저장되지 않음

		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
```

```
//Student.java, hashCode()와 equals() 재정의
package sec01.verify.exam08;

public class Student {
    public int studentNum;
    public String name;

    pbulic Student(int studentNum, String name) {
        this.student = studentNum;
        this.name = name;
    }
}

@Override
public int hashCode() {
	return studentNum;
}

@Override
public boolean equals(Object obj) {
	if(!(obj instanceof Student)) return false;
	Student student = (Student) obj;
	if(studentNum != student.studentNum) return false;
	return true;
}
```

9. "`HashMap`에 아이디(String)와 점수(Integer)가 저장되어 있습니다. 실행 결과처럼 평균 점수를 출력하고, 최고 점수와 최고 점수를 받은 아이디를 출력하기"

```//점수 관리
package sec01.verify.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            if(entry.getValue()>maxScore) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore += entry.getValue();
        }

        int avgScore = totalScore / map.size();
        System.out.println("평균점수: "+avgScore);
        System.out.println("최고점수를 받은 아이디: "+name);
    }
}
```

```
//실행 결과
평균점수: 91
최고점수: 96
최고점수를 받은 아이디: blue
```

### 13-1-ChatGPT

#### JAVA에서 스레드 안전(THREAD SAFE)는 무슨 소리지?

Java에서 "스레드 안전(Thread Safe)"는 여러 스레드가 동시에 특정 코드를 실행할 때, 그 코드가 예상한 대로 동작하도록 보장된 상태를 말합니다. 즉, 다중 스레드 환경에서 하나의 자원(변수, 객체 등)을 동시에 접근하거나 수정하더라도, 그 자원이 일관성 있는 상태를 유지하고 오류가 발생하지 않도록 하는 것입니다.

##### 예시

만약 여러 스레드가 동시에 하나의 변수나 객체를 수정하는 경우, 예기치 않은 동작이나 데이터 불일치가 발생할 수 있습니다. 스레드 안전을 보장하기 위해서는 이런 동시 접근을 조정할 필요가 있습니다.

##### 스레드 안전을 보장하는 방법

1. **동기화(Synchronization):**

   - `synchronized` 키워드를 사용하여 한 번에 하나의 스레드만 특정 코드 블록에 접근할 수 있도록 보장할 수 있습니다.
   - 예시:

     ```java
     public synchronized void increment() {
         count++;
     }
     ```

2. **불변 객체(Immutable Objects):**

   - 객체의 상태를 한 번 설정하면 변경할 수 없도록 만들어, 여러 스레드가 객체를 공유해도 데이터가 변하지 않도록 하는 방법입니다.
   - 예시:

     ```java
     public final class Person {
         private final String name;
         private final int age;

         public Person(String name, int age) {
             this.name = name;
             this.age = age;
         }

         // getter methods only
     }
     ```

3. **스레드 안전한 컬렉션 클래스:**

   - `java.util.concurrent` 패키지에는 스레드 안전을 고려한 다양한 컬렉션 클래스가 포함되어 있습니다. 예를 들어, `CopyOnWriteArrayList`, `ConcurrentHashMap` 등이 있습니다.
   - 예시:

     ```java
     Map<String, String> map = new ConcurrentHashMap<>();
     ```

4. **`ReentrantLock`과 같은 명시적 락 사용:**

   - `ReentrantLock`을 사용하여 동기화 블록을 명시적으로 제어할 수 있습니다. 이 방법은 `synchronized`보다 더 세밀하게 락을 관리할 수 있는 장점이 있습니다.
   - 예시:

     ```java
     ReentrantLock lock = new ReentrantLock();
     lock.lock();
     try {
         // critical section
     } finally {
         lock.unlock();
     }
     ```

##### 왜 중요한가?

- **데이터 무결성:** 여러 스레드가 동시에 데이터를 수정할 때, 스레드 안전하지 않으면 데이터가 중간에 손상될 수 있습니다.
- **예상 가능한 결과:** 스레드 안전성을 보장하면, 여러 스레드가 동시에 작업을 할 때도 코드의 동작이 예측 가능해지고 버그를 예방할 수 있습니다.

쉽게 말해서, "스레드 안전"은 여러 스레드가 동시에 같은 자원에 접근할 때 그 자원이 일관되게 유지되도록 보장하는 것입니다.

## 13-2 LIFO와 FIFO 컬렉션

- **Stack**: 후입선출(LIFO)을 구현한 클래스
- **Queue**: 선입선출(FIFO)에 필요한 메소드를 정의한 인터페이스. 구현 클래스로는 `LinkedList`가 있다.

### 확인 문제 및 풀이

1. Stack은 후입선출(LIFO)를 구현한 클래스이며, Queue는 선입선출(FIFO)을 위한 인터페이스이다. Stack의 `push()`는 객체를 넣을 때, `popover()`은 객체를 뺄 때 사용한다.

   1-4. Queue의 `poll()`은 객체를 뺄 때, `offer()`는 객체를 넣을 때 사용한다.
