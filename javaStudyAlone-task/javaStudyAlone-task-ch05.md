## 05-1 참조 타입과 참조 변수

- **기본 타입**: `byte, short, char, int, long, float, double, boolean` 타입을 말한다. 이들 타입의 변수에는 값 자체가 저장된다.
- **참조 타입**: 기본 타입을 제외한 배열·열거·클래스·인터페이스 등을 말한다. 참조 타입의 변수에는 객체의 번지가 저장되며, 번지로 객체를 참조한다는 의미에서 참조 타입이라고 한다.
- **메모리 사용 영역**: JVM은 운영체제에서 할당받은 메모리 영역을 메소드 영역·힙 영역·스택 영역으로 구분해서 사용하며, 메소드 영역에는 정적 필드·상수·메소드 코드·생성자 코드가 위치, 힙 영역에는 객체가 생성, 스택 영역에는 변수가 생성된다.
- **번지 비교**: 비교 연산자(==, !=)가 기본 타입에서 사용될 경우 값을 비교하나, 참조 타입에서 사용될 시 번지를 비교한다. ==이 true가 나오면 같은 객체를 참조한다는 뜻이고, false가 나오면 다른 객체를 참조한다는 뜻이다.
- **null**: 참조 타입 변수는 객체를 참조하지 않는다는 뜻으로 null 값을 가질 수 있다. 해당 값 또한 초기값으로 사용할 수 있으므로 null로 초기화된 참조 변수는 스택 영역에 생성된다.
- **NullPointerException**: 참조 변수가 null을 가질 경우, 참조 객체가 없으므로 해당 객체를 통해 객체를 사용할 수 없다. 만약 null인 참조 변수를 통해 존재하지도 않는 객체의 필드 또는 메소드를 사용할 경우 NullPointerException이 발생한다.

### 확인 문제 및 풀이

1. 참조 타입에는 배열·열거·클래스·인터페이스가 있다. 참조 변수의 메모리 생성 위치는 스택이며, 참조 타입에서 ==, != 연산자는 객체 번지를 비교한다.

   1-4. 참조 변수는 **null 값으로 초기화할 수 있다.**

2. 로컬 변수는 스택 영역에 생성되며 실행 블록이 끝나면 소멸된다. 상수·메소드 코드·생성자 코드는 메소드 영역에 생성되며, 배열 및 객체는 힙 영역에 생성된다.

   2-3. 참조되지 않은 객체는 **JVM이 쓰레기 수집기를 실행시켜서 자동으로 제거**한다.

3. String은 클래스이므로 참조 타입이다. 동일한 문자열 리터럴을 저장하는 변수는 동일한 String 객체를 참조하며, `new String("문자열")`은 무조건 새로운 String 객체를 생성한다.

   3-2. String의 문자열 비교를 위해서는 **`equals()` 메소드를 사용**해야 한다.

4. 참조 변수에 저장되는 것은 객체의 번지이며, null을 저장해서 변수를 초기화시킬 수 있다. 참조 변수에 null이 저장된 상태에서는 객체를 사용할 수 없다.

   4-4. NullPointerException은 **변수에서 존재하지 않는 객체의 필드나 메소드를 사용하려고할 때 발생**한다.

5. true, false, true, true, true

## 05-2 배열

- **배열**: 같은 타입의 데이터를 연속된 공간에 나열, 각 데이터에 인덱스(index)를 부여해놓은 자료 구조
- **인덱스**: 배열 항목에 붙인 번호. 0번부터 시작하며 0~(배열 길이 - 1)까지 범위를 가짐
- **배열 선언**: 변수 선언과 비슷함. 대괄호가 추가되어 `타입[] 변수;` 형태로 선언된다. `int[] scores`는 int 배열을 선언하며, scores는 배열 변수이다.
- **배열 생성**: 배열을 생성하는 방법으로 2가지가 있다.
  - `{값1, 값2, 값3, ...}`처럼 값 목록으로 생성
  - `new 타입[길이];`로 생성
- **배열 길이**: 배열에 저장될 수 있는 항목(값)의 수. 배열의 length 필드에 저장되어 있어서 `변수.length`로 배열 길이를 읽을 수 있다.
- **다차원 배열**: 배열 항목(값)이 또 다른 배열을 참조할 때. 다차원 배열의 선언과 생성 방법은 `타입[][] 변수 = new 타입[길이1][길이2];`이다. `변수.length`는 1차원 배열의 `길이1`이 되고, `변수[인덱스].length`는 해당 항목이 참조하는 2차원 배열의 `길이2`를 의미한다.
- **향상된 for문**: `for(타입 변수 : 배열) {...}`. 향상된 for문은 반복 실행을 하기 위해서 루프 타운터 변수와 증감식을 사용하지 않는다. 배열의 항목 개수만큼 반복한 다음, 자동으로 for문을 빠져나간다. 반복할 때마다 변수에는 배열에서 가져온 항목이 저장된다.

### 확인 문제 및 풀이

1. 배열을 생성하는 방법으로는 `int[] array = {1, 2, 3};`, `int[] array = new int[3];`, `int[][] array = new int[3][2];`가 있다.

   1-2. **배열을 생성하기 전에 배열을 초기화할 수 없다.**

2. 정수 타입의 배열 항목의 기본 초기값은 0이다. 실수 타입의 배열 항목의 기본 초기값은 0.0F 또는 0.0이며, 참조 타입 배열 항목의 기본 초기값은 null이다.

   2-3. boolean 타입 배열 항목의 **기본 초기값은 false**이다.

3. 3, 5
4.

```
for (int i = 0; i < array.length; i++) {
  if (max < array[i]) {
	max = array[i];
  }
}
```

5.

```
int count = 0;
for (int i = 0; i < array.length; i++) {
  for (int j = 0; j < array[i].length; j++) {
	sum += array[i][j];
	count++;
  }
}
avg = (double) sum / count;
```

6.

```
if (selectNo == 1) {
  System.out.print("학생 수> ");
  studentNum = Integer.parseInt(scanner.nextLine());
  scores = new int[studentNum];
} else if (selectNo == 2) {
  for (int i = 0; i < scores.length; i++) {
	System.out.print("scores[" + i + "]> ");
	scores[i] = Integer.parseInt(scanner.nextLine());
  }
} else if (selectNo == 3) {
  for (int i = 0; i < scores.length; i++) {
	System.out.println("scores[" + i + "]: " + scores[i]);
  }
} else if (selectNo == 4) {
  int max = 0;
  int sum = 0;
  double avg = 0;
  for (int i = 0; i < scores.length; i++) {
	max = (max < scores[i]) ? scores[i] : max;
	sum += scores[i];
  }
  avg = (double) sum / studentNum;
  System.out.println("최고 점수: " + max);
  System.out.println("평균 점수: " + avg);
} else if (selectNo == 5) {
  run = false;
}
```

## 05-3 열거 타입

- **열거 타입**: 몇 가지로 제한된 상수를 가지는 타입
- **열거 타입 선언**: `enum 타입 {상수, 상수, ...}` 형태로 열거 타입을 선언. (예: `enum Week {MONDAY, ..., SUNDAY}`)
- **열거 상수**: 열거 타입을 선언할 때 주어진 상수. `타입.상수` 형태로 사용한다. (예: Week 열거 타입의 상수 MONDAY의 경우 `Week.MONDAY`)
- **열거 타입 변수**: 열거 타입으로 선언된 변수. 열거 타입 변수에는 열거 상수 중 하나가 대입된다. (예: `Week today = Week.FRIDAY;`의 경우 today가 열거 타입 변수)

### 확인 문제 및 풀이

1. 열거 타입은 한정된 값을 갖는 타입이다. 열거 타입 변수에는 열거 타입에 정의된 상수를 대입할 수 있다. 열거 상수는 관례적으로 대문자로 작성한다.

   1-3. 열거 타입 변수에 **null을 대입할 수도 있다.**

2. `public enum LoginResult { SUCCESS, FAIL_ID, FAIL_PASSWORD }`
