## 02-1 변수

- **변수**: 값을 저장할 수 있는 메모리 번지에 붙인 이름. 이를 통해서 프로그램은 메모리 번지에 값을 저장하고 읽을 수 있다.
- **변수 선언**: 변수에 어떤 형식의 데이터를 저장할지, 변수 이름이 무엇인지를 결정하는 것.
- **변수 사용**: 변수의 값을 읽거나 변경하는 행위. 변수는 출력문이나 연산식 내부에서 사용되어 변수에 저장된 값을 출력하거나 연산에 사용한다.
- **변수 사용 범위**: 변수는 자신이 선언된 위치에서 자신이 속한 블록 내부까지만 사용이 가능하다. 그밖에서는 사용할 수 없다.

### 확인 문제 및 풀이

1. 변수는 하나의 값만 저장할 수 있고, 선언 시에 사용한 타입의 값만 저장할 수 있으며, 해당 변수가 선언된 중괄호 {} 안에서만 사용 가능하다.

   1-4. **변수는 초기값이 저장되지 않은 상태로는 읽을 수 없다.**

2. 변수 이름으로 사용할 수 있는 것으로는 `modelName, $value, \_age`가 있다. **`6hour, class, int`** 등은 사용할 수 없다.
3. 컴파일 에러가 발생하는 코드

   3-4. `sum = score1 + score2;`의 경우 score2는 **선언만 하고 초기화되지 않아서** 오류가 발생한다.

4. 변수 사용 범위에 대한 내용. 컴파일 에러가 발생하는 위치와 그 이유를 설명하기

```
int v1 = 0;
if(true) {
   int v2 = 0;
   if(true) {
      int v3 = 0;
      v1 = 1;
      v2 = 1;
      v3 = 1;
   }
   v1 = v2 + v3;  //컴파일 오류 발생
}
System.out.println(v1);
```

10번 줄의 `v1 = v2 + v3;`에서 오류가 발생한다. int v3는 4번 줄의 **`if(true)` 내부에서만 허용되는 변수**여서 **블록이 끝나는** 10번 줄부터는 사용할 수 없다.

## 02-2 기본 타입

- **정수 타입**: 정수를 저장할 수 있는 타입. `byte, short, int, long` 타입들을 말한다.
- **char 타입**: 작은따옴표('')로 감싼 하나의 문자 리터럴을 저장할 수 있는 타입
- **String 타입**: 큰따옴표("")로 감싼 문자열을 저장할 수 있는 타입
- **실수 타입**: 실수를 저장할 수 있는 타입. `float, double` 타입들을 말한다.
- **boolean 타입**: 참(true)과 거짓(false)를 저장할 수 있는 타입

### 확인 문제 및 풀이

1. | 구분      | 1byte   | 2byte | 4byte | 8byte  |
   | --------- | ------- | ----- | ----- | ------ |
   | 정수 타입 | byte    | short | int   | long   |
   | 실수 타입 | -       | -     | float | double |
   | 논리 타입 | boolean | -     | -     | -      |

2. 변수에 값을 저장하는 코드로 올바른 것

   - `char var = 65;`
   - `dobule var = 100.0;`

   - 반대로 올바르지 않은 것
     - `byte var = 200;` → 정수 허용 범위: -128~127
     - `char var = 'ab';` → 단일 문자만 저장 가능
     - `long var = 50000000000;` → long이 아닌 int로 취급되어 범위 초과: `50000000000L`로 수정
     - `float var = 3.14;` → double 타입: `3.14f`로 수정
     - `String var = "나의 직업은 "개발자"입니다.";` → 문자열 안에서 큰따옴표를 쓰려면 역슬래시(\\)를 사용해야한다: `\"개발자"\`로 수정
     - `boolean var = 0;` → true 또는 false로만 처리됨
     - `int v2 = 1e2;` → double 타입: `(int) 1e2`로 수정
     - `float = 1e2f;` → 변수 이름이 없음

3.

```
System.out.println("자바는");
System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
System.out.println("입니다.");
```

해당 코드를 실행했을 때 콘솔에 출력되는 내용은 다음과 같다.

```
자바는
재미있는 "프로그래밍" 언어
입니다.
```

4. `double value = 2e-350;`에서 컴파일 오류가 발생하는 이유는 double 타입이 표현할 수 있는 최소값보다 작은 숫자를 할당하려고 해서 (최소 4.9e-324)

5.

```
boolean stop = false;
if(stop) {
   System.out.println("멈춥니다.");
} else {
   System.out.println("출발합니다.");
}
```

해당 코드를 실행했을 때 출력되는 내용은 다음과 같다.

`출발합니다.`

### 02-2-ChatGPT

#### java에서 다른 건 소문자로만 쓰는데 String 타입만 특이하게 쓰네?

맞아요! Java에서 기본적으로 변수명이나 클래스명은 소문자나 카멜 케이스(예: `myVariable`, `someMethod`)로 쓰는 게 일반적인 규칙입니다. 하지만 `String` 타입처럼 첫 글자가 대문자인 경우는, Java의 **클래스명** 규칙 때문이에요.

Java에서는 **클래스명**은 대문자로 시작해야 한다는 규칙이 있어요. `String`은 Java에서 제공하는 기본 클래스 중 하나이기 때문에, 첫 글자가 대문자로 시작하는 거죠. 다른 예시로는 `Integer`, `Double`, `Boolean` 같은 클래스들도 모두 대문자로 시작해요.

따라서 `String`은 실제로 **클래스**이기 때문에 대문자로 시작하고, 변수명이나 다른 타입은 보통 소문자나 카멜 케이스로 작성하는 거죠.

이게 약간 특이하게 느껴질 수 있지만, 자바의 네이밍 규칙에 맞춰져 있어서 그런 거예요!

#### int, byte, short, long, char, boolean 같은 건 죄다 소문자이거든? 근데 String만 string으로 안 쓰는 거야?

그렇죠! `int`, `byte`, `short`, `long`, `char`, `boolean` 같은 건 모두 **기본 데이터 타입**(primitive types)인데, 이들은 전통적으로 소문자로 시작해요. 반면에 `String`은 **클래스**이기 때문에 대문자로 시작하는 거예요.

여기서 중요한 차이점은, **기본 타입**은 자바가 직접 제공하는 원시 타입이지만, `String`은 **클래스**로 구현된 객체입니다. 자바에서는 기본 데이터 타입을 사용할 때, 실제로는 객체처럼 다룰 수 없어요(예: 메서드를 호출할 수 없거나, 객체로서 다룰 수 없다). 하지만 `String`은 사실 **클래스**이기 때문에, 그 자체로 객체입니다.

자바에서 \*\*박싱(Boxing)\*\*을 사용할 때, 예를 들어 `int`를 `Integer`로 변환하거나, `boolean`을 `Boolean`으로 변환할 수 있어요. 이런 클래스를 \*\*래퍼 클래스(Wrapper Class)\*\*라고 부르죠. 그런데 `String`은 이러한 래퍼 클래스의 예외적인 존재라, `int`, `boolean`처럼 소문자로 사용되지 않고, 클래스 명명 규칙에 맞춰서 대문자로 시작합니다.

결론적으로, `String`만 유독 대문자로 시작하는 이유는 **기본 데이터 타입이 아니라 클래스**이기 때문이에요. 이게 자바의 네이밍 규칙에 따른 거죠!

#### 문자 리터럴이 뭐야

문자 리터럴은 프로그래밍에서 **문자**를 나타내기 위한 값입니다. 일반적으로 따옴표(`'`)로 둘러싸여 있는 단일 문자를 의미해요. 예를 들어:

```python
'a'
'Z'
'1'
' '
```

이런 것들이 문자 리터럴이에요. 여기서 중요한 점은, **단일 문자**만을 표현할 수 있다는 것. 숫자나 여러 문자를 포함한 문자열은 **문자열 리터럴**로 다르게 분류됩니다. 예를 들어, `'abc'`는 문자 리터럴이 아닌 문자열 리터럴이죠.

##### 예시:

- **문자 리터럴**: `'a'`, `'z'`, `'%'`
- **문자열 리터럴**: `"hello"`, `'123'`, `"world!"`

따라서 문자 리터럴은 **하나의 문자**를 표현하는 데 사용된다는 점에서 구분이 돼요.

## 02-3 타입 변환

- **자동 타입 변환**: 자동으로 타입을 변환하는 것. 값의 허용 범위가 작은 타입이, 허용 범위가 큰 타입으로 저장될 때 발생한다.
- **강제 타입 변환**: 강제로 타입이 변환되는 것. 값의 허용 범위가 큰 타입을, 허용 범위가 작은 타입으로 쪼개어서 저장하는 것.
- **문자열 결합 연산**: 문자열과 + 연산을 하면 다른 피연산자 또한 문자열로 변환되어 문자열 결합이 발생한다.
- **`Integer.parseInt()`**: 문자열을 정수 int 타입으로 변환
- **`Double.parseDouble()`**: 문자열을 실수 double 타입으로 변환

### 확인 문제 및 풀이

1. 자동 타입 변환 도중에 컴파일 에러가 발생하는 `short shortValue = charValue;`에서 **char 타입은 shrot 타입으로 알아서 변환시킬 수 없다.**
2. 강제 타입 변환 도중에 컴파일 에러가 발생하는 `char var = (char)strValue;`의 경우 **char가 단일 문자만 취급**하며, String을 캐스팅할 수 없으므로
3. 연산식에서의 타입 변환 도중에 컴파일 에러가 발생하는 `byte result = byteValue + byteValue;`는 더하기 **연산에서 자동으로 int 타입으로 변환**되기 때문이다.
4.

```
short s1 =1;
short s2 = 2;
int i1 = 3;
int i2 = 4;
short result = s1 + s2; //해당 줄부터 컴파일 에러 발생
int result = i1 + i2;
```

해당 코드 중 5~6번 줄에서 컴파일 에러가 발생한다. 5번 줄의 경우 더하기 연산이 자동으로 int 타입으로 변환되어서다. 6번 줄의 경우 5번 줄에서 **이미 같은 이름의 변수가 사용되었기 때문**이다.

5. "알파벳 a의 유니코드는 97, b의 유니코드는 98. 따라서 a의 유니코드에 1을 더해서 b로 만들고 출력하는 코드를 작성했으나 컴파일 오류가 발생하였다."

```
char c1 = 'a';
char c2 = c1 + 1; //연산 시 자동으로 int로 변환
System.out.println(c2);
```

오류가 발생하는 코드는 `char c2 = c1 + 1;`, 더하기 연산에서 자동으로 int 타입으로 변환되므로 `char c2 = (char)(c1 + 1);`으로 수정해야한다.

6. "Java에서 '/'는 나눗셈 연산자이다. `x / y`는 x를 y로 나누는 연산을 한다. 다음 코드에서 출력되는 결과와 이유를 설명하기"

```
int x = 5;
int y = 2;
int result = x / y;
System.out.println(result);
```

결과는 "2". 나눗셈 연산에서 자동으로 int 타입으로 변환되므로 **계산된 소수점 이하는 버려지게 된다.**

7. "6번 문제의 내용을 토대로 출력되는 결과로 2.5가 나오게 하고 싶다."

```
int x = 5;
int y = 2;
float result = (float) x / y;
System.out.println(result);
```

8. "두 실수를 덧셈 연산하고 소수점 이하 자리를 버리고 싶다."

```
double var1 = 3.5;
double var2 = 2.7;
int result = (int)(var1 + var2);
```

9. "var1부터 var4까지 + 연산을 수행해서 int 타입 result 변수에 9가 저장되도록 하고 싶다."

```
long var1 = 2L;
float var2 = 1.8f;
double var3 = 2.5;
String var4 = "3.9";
int result = (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
System.out.println(result);
```

10.

```
String str1 = 2 + 3 + "";
String str2 = 2 + "" + 3;
String str3 = "" + 2 + 3;
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
```

해당 코드를 실행했을 때 출력 결과는 다음과 같다.

```
5
23
23
```

11. "문자열을 기본 타입으로 변환하려고 한다."

```
byte value = Byte.parseByte("10");
int value = Integer.parseInt("1000");
float value = Float.parseFloat("20.5");
double value = Double.parseDouble("3.14159");
```

## 02-4 변수와 시스템 입출력

- **`System.out.println()`**: 괄호에 주어진 매개값을 모니터로 출력하고 개행
- **`System.out.print()`**: 괄호에 주어진 매개값을 모니터로 출력하고 개행하지 않는다
- **`System.out.printf()`**: 괄호에 주어진 매개값을 주어진 형식대로 출력
- **`System.in.read()`**: 키보드에서 입력된 키코드를 읽는다
- **Scanner**: `System.in.read()`의 경우 키코드를 하나씩 읽으므로 2개 이상의 키가 조합된 한글을 읽지 못한다. 따라서 키보드로부터 입력된 내용을 통 문자열로 읽으려고 할 때 사용할 수 있다.

### 확인 문제 및 풀이

1. "다음과 같이 출력되도록 하고 싶다."

```
이름: 감자바
나이: 25
전화: 010-123-4567
```

```
String name = "감자바";
int age = 25;
String tel1 = "010", tel2 = "123", tel3 = "4567";
System.out.println("이름: " + name);
System.out.print("나이: " + age + "\n");
System.out.println("전화: " + tel1 + "-" + tel2 + "-" + tel3);
```

2. "`Scanner`를 이용해서 키보드로 입력한 두 수를 덧셈하여 결과를 출력하고자 한다."

```
Scanner scanner = new Scanner(System.in);

System.out.print("첫번째 수:");
String strNum1 = scanner.nextLine();

System.out.print("두번째 수:");
String strNum2 = scanner.nextLine();

int num1 = Integer.parseInt(strNum1);
int num2 = Integer.parseInt(strNum2);
int result = num1 + num2;
System.out.println("덧셈 결과:" + result);
```

3. "`Scanner`를 이용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드 작성하기."

```
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String str1 = scanner.nextLine();

		System.out.print("2. 주민번호 앞 6자리: ");
		String str2 = scanner.nextLine();

		System.out.print("3. 전화번호: ");
		String str3 = scanner.nextLine();

		System.out.println("\n[입력된 내용]\n1. 이름: " + str1);
		System.out.println("2. 주민번호 앞 6자리: " + str2);
		System.out.println("3. 전화번호: " + str3);
	}
}
```
