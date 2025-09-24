## 03-1 연산자와 연산식

- **연산자**: 연산의 종류를 결정짓는 기호. 종류로는 산술(+, -, \*, /, %), 증감(++, --), 비교(==, !=, ...), 논리(&&, ||, ...), 대입(=, +=, -=, ...) 등이 있다.
- **피연산자**: 연산식에서 연산되는 데이터 혹은 값. (예: 연산식 `3 + x`에서는 3과 변수 x가 피연산자)
- **연산 방향**: 연산식에서 같은 종류의 연산자가 여러 개 사용될 경우, 방향이 왼쪽에서 오른쪽이거나 오른쪽에서 왼쪽으로 연산된다. 대부분의 연산자는 왼쪽에서 오른쪽으로 연산하지만, 증감(++, --) 및 대입(=, +=, -=)은 오른쪽에서 왼쪽으로 연산한다.
- **연산 우선 순위**: 서로 다른 연산자들이 복합적으로 구성될 경우 우선적으로 연산되는 연산자가 있다. 이때 괄호()로 감싼 연산이 최우선순위를 가지게 된다.

### 확인 문제 및 풀이

1. 연산자는 피연산자의 수에 따라 단항·이항·삼항 연산자로 구분하며, 비교 연산자와 논리 연산자의 산출 타입은 boolean(true/false) 타입이다. 하나의 값이 올 수 있는 자리라면 연산식도 올 수 있다.

   1-3. 연산식은 **하나의 값만 산출**해낸다.

2. 산술 연산(+, -, \*, /)은 연산 방향이 왼쪽에서 오른쪽으로 수행되며, 대입 연산(=, +=)은 연산 방향이 오른쪽에서 왼쪽으로 수행된다. 우선 순위와 관계 없이 먼저 연산을 하고 싶다면 괄호 ()로 묶어준다.

   2-4. **논리 연산(&&, ||)은 산술 연산보다 나중에 수행**된다.

## 03-2 연산자의 종류

- **증감 연산자(++, --)**: 변수의 값을 1씩 증가/감소시킨다
- **비교 연산자(==, != 등)**: 값이 같거나 다른지를 비교하고 boolean 값을 산출해낸다.
- **논리 연산자(&&, ||, ! 등)**: 논리곱·논리합·논리 부정을 수행하고 boolean 값을 산출해낸다.
- **대입 연산자(=, +=, -= 등)**: 오른쪽의 값을 왼쪽에 대입하거나 연산한 다음 대입한다.
- **삼항 연산자(`(조건식) ? A : B`)**: 조건이 true이면 A를 산출, false이면 B를 산출한다.

### 확인 문제 및 풀이

1. 해당 코드에서 컴파일 오류가 발생하는 위치와 그 이유에 대해서

```
byte b = 5;
b = -b; //컴파일 오류
int result = 10 / b;
System.out.println(result);
```

2번째 줄, 바이트 변수 b에 연산자를 붙이면 int 타입으로 변환되기 때문에

2.

```
int x = 10;
int y = 20;
int z = (++x) + (y--);
System.out.println(z);
```

해당 코드를 실행했을 때 출력 결과는 `31`이다.

3. "stop이 true일 때 반복을 멈추고 싶다." 이때 `while(조건식) {}`은 조건식이 true가 될 때 중괄호 {} 안의 실행문을 반복해서 실행한다.

```
boolean stop = ...;
while(!stop) {...}
```

4. "534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어줄 때 1인당 몇 개를 가질 수 있고, 몇 개가 남는지를 구하는 코드"

```
int pencils = 534;
int students = 30;

int pencilsPerStudent = (pencils / students);
System.out.println(pencilsPerStudent);

int pencilsLeft = (pencils % students);
System.out.println(pencilsLeft);
```

5. "다음 코드를 실행했더니 원하던 값 5가 아니라 4가 출력되었다. 어디서 잘못 되었을까?"

```
int var1 = 5;
int var2 = 2;
double var3 = var1 / var2;  //정수 연산
int var4 = (int) (var3 * var2);
System.out.println(var4);
```

3번째 줄의 내용이 정수 연산이라서 결과 또한 정수로 나온다. var3에는 2.0이 저장되고, var4로 `(int)(2.0 * 2) = 4`가 된다.

6. "10의 자리 이하를 버리는 코드, 변수 value의 값이 356이라면 300이 나올 수 있도록 하기."

```
int value = 356;
System.out.println(value / 100 * 100);
```

7. "출력 결과로 `10%입니다.`가 아니라 `10%가 아닙니다.`가 출력되었다. 어디서 잘못 되었을까?"

```
float var1 = 10f;
float var 2 = var1 / 100;
if (var2 == 0.1) {
  System.out.println("10%입니다.")
} else {
  System.out.println("10%가 아닙니다.")
}
```

float 0.1f는 정확히 0.1이 아니기 때문에

8. "사다리꼴의 넓이를 구하는 코드. 정확히 소수 자릿수가 나올 수 있도록 하기."

```
int lengthTop = 5;
int lengthBottom = 10;
int height = 7;
double area = ((lengthTop + lengthBottom) * height / 2.0);
System.out.println(area);
```

9. "키보드로 두 실수를 `Scanner`를 사용해서 다음과 같이 입력 받는다. 입력된 1번째 수에 2번째 수를 나눈 결과를 `결과:값`으로 출력하되, 2번째 수에 0 또는 0.0이 입력될 경우 `결과:무한대`가 출력되도록 코드를 작성하기. (`Scanner`의 `next()` 사용)"

```
첫 번째 수: 7.3
두 번째 수: 2.5
--------------
결과:2.92 (or 결과:무한대)
```

```
Scanner s = new Scanner(System.in);

System.out.print("첫 번째 수: ");
double x = Double.parseDouble(s.nextLine());
System.out.print("두 번째 수: ");
double y = Double.parseDouble(s.nextLine());
System.out.println("---------------");
if (y != 0.0) {
  System.out.println("결과: " + (x / y));
} else {
  System.out.println("결과: 무한대");
}
```

10. "반지름이 10인 원의 넓이를 구하는데 다음과 같이 var2, `.`, var3을 + 연산해서 원주율을 얻은 다음 계산하고자 한다. 올바른 결과가 나오도록 코드를 수정하기."

```
int var1 = 10;
int var2 = 3;
int var3 = 14;
double var4 = var1 * var1 * var2 + "." + var3 //double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
System.out.println("원의 넓이:" + var4);
```

11. "키보드로 아이디와 패스워드를 입력받는다. 입력 조건으로 이름은 문자열, 패스워드는 정수(int 타입으로 변환). 입력된 내용을 비교해서 아이디가 `java`이고 패스워드가 `12345`이면 `로그인 성공`을 출력하고, 그게 아니라면 `로그인 실패`를 출력하도록 알맞은 코드 작성하기."

```
Scanner scanner = new Scanner(System.in);

System.out.print("아이디:");
String name = scanner.nextLine();

System.out.print("패스워드:");
String strPassword = scanner.nextLine();
int password = Integer.parseInt(strPassword);

if(name.equals("java")) {
  if(password == 12345) {
    System.out.println("로그인 성공");
  } else {
    System.out.println("로그인 실패:패스워드가 틀림");
  }
} else {
  System.out.println("로그인 실패:아이디 존재하지 않음");
}
```

12. "비교 연산자와 논리 연산자의 복합 연산식이 포함된 코드로 연산식의 결과는 다음과 같다."

```
int x = 10;
int y = 5;
System.out.println( (x>7) && (y<=5) );  //true
System.out.println( (x%3 == 2) || (y%2 != 1) ); //false
```

13. "대입 연산자(=)와 산술 연산자(+, -, \*, /)로 구성된 실행문을 대입 연산자 하나로 구성된 실행문으로 변경하기."

```
int value = 0;

value = value + 10; //value += 10;
value = value - 10; //value -= 10;
value = value * 10; //value *= 10;
value = value / 10; //value /= 10;
```

14.

```
int score = 85;
String result = (!(score>90)) ? "가" : "나";
System.out.println(result);
```

해당 코드를 실행했을 때 출력되는 결과는 `가`.
