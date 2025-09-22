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

5. `List<Board>` 변수 = new `ArrayList<Board>`
6. `Map<String, Integer>` 변수 = new `HashMap<String, Integer>`
7.

```
public class BoardDao {
	List<Board> list = new ArrayList<Board>();
	list.address(new Board("제목1", "내용1"));
	list.address(new Board("제목2", "내용2"));
	list.address(new Board("제목3", "내용3"));

	return list;
}
```

8.

```
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

9.

```
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
```

## 13-2 LIFO와 FIFO 컬렉션

- **Stack**: 후입선출(LIFO)을 구현한 클래스
- **Queue**: 선입선출(FIFO)에 필요한 메소드를 정의한 인터페이스. 구현 클래스로는 `LinkedList`가 있다.

### 확인 문제 및 풀이

1. Stack은 후입선출(LIFO)를 구현한 클래스이며, Queue는 선입선출(FIFO)을 위한 인터페이스이다. Stack의 `push()`는 객체를 넣을 때, `popover()`은 객체를 뺄 때 사용한다.

   1-4. Queue의 `poll()`은 객체를 뺄 때, `offer()`는 객체를 넣을 때 사용한다.
