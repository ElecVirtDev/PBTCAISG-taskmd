## 11-1 `java.lang` 패키지

- **Object 클래스**: Java의 최상위 부모 클래스. Object 클래스의 메소드는 모든 Java 객체에서 사용할 수 있다.
- **System 클래스**: System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다. 프로그램 종료·키보드로부터 입력·모니터로 출력·현재 시간 읽기 등이 가능하다. System 클래스의 모든 필드와 메소드는 정적 필드와 정적 메소드로 구성되어 있다.
- **Class 클래스**: Java는 클래스와 인터페이스의 메타 데이터를 Class 클래스로 관리한다. 메타 데이터는 클래스의 이름·생성자 정보·필드 정보·메소드 정보를 말한다.
- **String 클래스**: 문자열 리터럴은 String 객체로 자동 생성되지만, String 클래스의 다양한 생성자를 이용해서 직접 String 객체를 생성할 수도 있다. String 객체는 문자열 조작을 위한 많은 메소드를 가지고 있다.
- **Wrapper(포장) 클래스**: 기본 타입의 값을 갖는 객체를 포장 객체라고 한다. 포장 객체는 외부에서 변경할 수 없다. 기본 타입의 값을 포장 객체로 만드는 것을 박싱, 그 반대로 포장 객체로부터 기본 타입의 값을 얻는 것을 언박싱이라 불린다.
- **Math 클래스**: 수학 계산에 사용할 수 있는 메소드를 제공한다. Math 클래스가 제공하는 메소드는 모두 정적 메소드로, Math 클래스로 바로 사용할 수 있다.

### 확인 문제 및 풀이

1. Object 클래스는 모든 Java 클래스의 최상위 부모 클래스이며, Object의 `equals()` 메소드는 == 연산자와 동일하게 번지를 비교한다. 동등 비교를 위해 `equals()`와 `hashCode()` 메소드를 재정의하는 것이 좋다.

   1-4. Object의 toString() 메소드는 기본적으로 객체의 필드값을 문자열로 리턴하지 않는다.

2. "작성하는 클래스를 동등 비교하는 컬렉션 객체인 `HashSet, HashMap, HashTable`을 사용하려고 한다. Object의 `equals()`와 `hashCode()` 메소드를 재정의했다고 가정할 경우, 메소드 호출 순서를 생각해보자."
   | `hashCode()` 리턴값 | → [같음] → | `equals()` 리턴값 | → true → | [동등 객체] |
   | ------------------- | ---------- | ----------------- | -------- | ----------- |
   | ↓ | - | ↓ false | - | - |
   | 다름 | → | [다른 객체] | - | - |

3. "`Student` 클래스를 작성하되, Object의 `equals()`와 `hashCode()`를 재정의해서 `Student`의 학번(studentNum)이 같으면 동등 객체가 될 수 있도록 하기. `hashCode()`의 리턴값은 `studentNum` 필드값의 해시코드를 리턴하도록 하기."

```
//Student.java
package sec01.verify.exam03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
```

```
//StudentExample.java
package sec01.verify.exam03;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();

		//new Student("1")의 점수 95를 저장
		hashMap.put(new Student("1"), "95");

		//new Student("1") 로 점수를 읽어옴
		String score  = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
	}
}
```

```
//실행 결과
1번 학생의 총점: 95
```

4. "`Member` 클래스를 작성하되, Object의 `toString()` 메소드를 재정의해서 MemberExample 클래스의 실행 결과처럼 나오도록 작성하기."

```
//Member.java
package sec01.verify.exam04;

public class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}
}
```

```
//MemberExample.java
package sec01.verify.exam04;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		System.out.println(member);
	}
}
```

```
//실행 결과
blue: 이파란
```

5. Class 객체는 `Class.forName()` 메소드 또는 객체의 `getClass()` 메소드로 얻을 수 있다. 클래스의 생성자·필드·메소드에 대한 정보를 알아낼 수 있으며, 클래스 파일을 기준으로 상대 경로의 리소스의 정보를 얻을 수 있다.

   5-4. `클래스.class`로 Class 객체를 얻을 수 있다.

6. "바이트 배열 {73, 32, 108, 111, 118, 101, 32, 121, 111, 117}을 문자열로 변환하기."

```
//BytesToStringExample.java
package sec01.verify.exam06;

public class BytesToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		String str = new String(bytes);
		System.out.println( str );
	}
}
```

7. "문자열 `모든 프로그램은 자바 언어로 개발될 수 있다.`에서 `자바` 문자열이 포함되어 있는지 확인하고, `자바`를 `Java`로 대치한 새로운 문자열로 만들어보기."

```
//FindAndReplaceExample.java
package sec01.verify.exam07;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바");
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		} else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str = str.replace("자바", "Java");
			System.out.println("-->" + str);
		}
	}
}
```

```
//실행 결과
자바 문자열이 포함되어 있습니다.
--> 모든 프로그램은 Java 언어로 개발될 수 있다.
```

8. "박싱된 `Integer` 객체를 == 연산자로 비교했다. 100을 박싱한 `Integer` 객체는 true가 나오는데, 300을 박싱한 `Integer` 객체는 false가 나오는 이유는?"

```
//IntegerCompareExample.java
package sec01.verify.exam08;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		System.out.println( obj1 == obj2 );
		System.out.println( obj3 == obj4 );
	}
}
```

```
//실행 결과
true
false
```

값의 범위가 `-128~127`인 경우 ==은 값을 비교, 그 외의 값은 번지를 비교한다.

9. "문자열 `200`을 정수로 변환하는 코드와 숫자 150을 문자열로 변환하는 코드 작성하기."

```
//StringConvertExample.java
package sec01.verify.exam09;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);

		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
	}
}
```

## 11-2 `java.util` 패키지

- **Date 클래스**: 날짜를 표현하는 클래스. 객체 간 날짜 정보를 주고 받을 때 매개 변수나 리턴 타입으로 주로 사용된다.
- **Calendar 클래스**: 달력을 표현하는 클래스. 추상(abstract) 클래스이므로 new 연산자를 사용해서 인스턴스를 생성할 수 없다. Calendar 클래스의 정적 메소드인 `getInstance()` 메소드를 이용하면 현재 운영체제에 설정되어 있는 시간대(TimeZone)를 기준으로 한 Calendar 하위 객체를 얻을 수 있다.

### 확인 문제 및 풀이

1. "`Date`와 `SimpleDateFormat` 클래스를 이용해서 오늘의 날짜를 `2024년 05월 08일 수요일 10시 30분` 같이 출력하는 프로그램 작성하기."

```
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		Date nowrap = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now));
	}
}
```

2. "`Calendar` 클래스를 이용해서 1번과 동일한 실행 결과를 출력하는 프로그램 작성하기."

```
import java.util.Calendar;

public class DateAndTime {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		String strMonth = (month < 10)? ("0"+month) : (""+month);

		int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
		String strDayOfMonth = (dayOfMonth<10)? ("0"+dayOfMonth) : (""+dayOfMonth);

		String[] dayArray = {"일", "월", "화", "수", "목", "금", "토"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = dayArray[dayOfWeek-1]+"요일";

		int hour = now.get(Calendar.HOUR_OF_DAY);
	}
}
```
