## 01-1
- **기계어**: 컴퓨터/운영체제가 이해하고 실행할 수 있는 0/1로 이루어진 코드
- **프로그래밍 언어**: 사람이 기계어를 이해한다는 것은 매우 어려운 일이기에 사람의 언어와 기계어의 다리 역할을 한다. (예시: Java, C, C++, Python 등)
- **소스 파일**: 프로그래밍 언어로 작성한 파일
- **컴파일**: 소스 파일을 기계어로 번역하기. 이를 담당하는 소프트웨어는 **컴파일러**라고 한다.
- **JDK**: 자바 개발 도구(Java Development Kit)의 줄임말. Java로 프로그램을 개발할 수 있는 실행 환경(JVM) 및 컴파일러와 같은 개발 도구 등을 제공한다.
- **환경 변수**: 운영체제가 실행하는데 필요한 정보를 제공해주는 변수를 말한다. JDK를 설치하고 명령 프롬프트 및 터미널과 같은 명령 라인에서 컴파일러(javac)와 실행(java) 명령어를 사용하기 위해서는, JAVA_HOME 환경 변수를 등록하고 Path 환경 변수를 수정해야 한다.

1. Java 언어로 프로그램을 개발하기 위해서는 JDK를 설치해야 하며, JDK가 설치되면 기본적으로 C:\Programs Files\Java 폴더가 생성된다. 자바 컴파일러와 실행 명령어는 JDK 설치 폴더/bin 폴더에 있다.
   1-1. 소스 파일은 기계어가 아닌 **프로그래밍 언어로 구성된 파일**이다.

2. JDK 설치 폴더 안의 bin 폴더를 Path 환경 변수에 등록하는 이유는 다른 경로에서 bin 폴더 안에 있는 명령어를 사용할 수 있도록 하기 위해

## 01-2
- **이클립스**: 무료로 사용 가능한 오픈소스 통합 개발 환경(IDE). IDE는 프로젝트 생성, 자동 코드 완성, 디버깅 등과 같이 개발에 필요한 여러 기능들을 통합적으로 제공하는 툴이다.
- **워크스페이스**: 이클립스 실행과 관련된 메타데이터 및 프로젝트 폴더가 저장되는 폴더
- **뷰**: 이클립스 내부에서 사용되는 작은 창
- **퍼스펙티브**: 프로젝트를 개발할 때 유용하게 사용할 수 있는 뷰들을 미리 묶어서 이름을 붙여놓은 것

1. 이클립스는 무료이며 통합 개발 환경(IDE)을 제공한다. 실행할 때에는 반드시 워크스페이스를 지정해야한다. 퍼스펙티브는 뷰들을 미리 묶어서 이름을 붙여놓은 것이다.
	1-3. 통합 개발 환경이라서 **자바 이외에도 다른 프로그래밍 언어를 사용한 프로그램 또한 개발할 수 있다.**

## 01-3
- **바이트 코드 파일**: 자바 소스 파일을 javac 명령어로 컴파일한 파일
- **JVM**: 자바 가상 기계는 바이트 코드 파일을 운영체제에 맞게 기계어로 번역하고 실행한다. JVM은 java 명령어로 구동된다.
- **클래스 선언**: 자바 소스 파일에서는 클래스 선언부와 클래스 블록으로 구성된다. 해당 부분을 작성하는 행위를 클래스 선언이라고 한다.
- **main() 메소드**: java 명령어로 바이트 코드 파일을 실행하면 제일 먼저 main() 메소드를 찾아서 블록 내부를 실행한다. main() 메소드는 프로그램 실행 진입점(Entry Point)으로도 불린다.
- **주석**: 프로그램 실행과는 상관없이, 코드에 대한 설명을 붙인 것. 컴파일 과정에서 무시되고 실행문만이 바이트 코드로 번역된다.
- **실행문**: 변수 선언, 값 저장, 메소드 호출에 해당하는 코드. 실행문 끝에는 세미콜론(;)을 붙여야한다.

1. 소스 파일(.java)을 작성한다 → java 명령어로 실행한다. → 실행 결과를 확인한다. → javac 명령어로 컴파일한다.
2. 컴파일 하면 '(클래스 이름).class'라는 바이트 코드 파일이 생성된다. main() 메소드는 반드시 클래스 블록 내부에서 작성해야 하며, 컴파일 후 실행을 하려면 반드시 main() 메소드가 있어야 한다.
   2-3. **main() 메소드를 작성할 때 중괄호 {} 블록을 만들어야 한다.**

3. // 뒤의 라인 내용은 해당 라인 끝까지 주석이 된다. /_부터 시작해서 _/까지의 모든 내용이 모두 주석이 된다. 다만 문자열 안에는 주석을 만들 수 없다.
   3-3. **주석의 경우 컴파일 과정에서 무시되면서** 바이트 코드 파일에 포함되지 않으므로 컴파일되는 바이트 코드의 크기를 걱정하지 않아도 된다.

4. 기본적으로 소스 파일(src)과 바이트 코드 파일(bin)이 저장되는 폴더가 다르다. 자바 소스 파일이 작성되는 폴더는 src이며, 올바르게 작성된 소스 파일을 저장하면 자동으로 컴파일되고, 바이트 코드 파일이 생성된다.
   4-3. **선언되는 클래스 이름은 소스 파일 이름과 동일**해야 한다.

5. 이클립스에서 바이트 코드 파일을 실행하는 방법으로는 다음과 같다.
   - Package Explorer 뷰에서 소스 파일을 선택하고, 툴 바에서 Run 아이콘을 클릭한다.
   - Package Explorer 뷰에서 소스 파일을 선택하고, 마우스 오른쪽 아이콘을 클릭한 후 [Run As] → [Java Application]을 선택한다.
     5-1. **Pakcage Explorer 뷰에서 소스 파일을 더블 클릭하는 것만으로는 소스 코드 편집 창이 열릴 뿐**이다.
     5-2. **Package Explorer 뷰에서 바이트 코드 파일을 선택하고, 툴 바에서 Run 아이콘을 클릭하는 것으로는 제대로 실행되지 않는다.**

## 02-1
- **변수**: 값을 저장할 수 있는 메모리 번지에 붙인 이름. 이를 통해서 프로그램은 메모리 번지에 값을 저장하고 읽을 수 있다.
- **변수 선언**: 변수에 어떤 형식의 데이터를 저장할지, 변수 이름이 무엇인지를 결정하는 것.
- **변수 사용**: 변수의 값을 읽거나 변경하는 행위. 변수는 출력문이나 연산식 내부에서 사용되어 변수에 저장된 값을 출력하거나 연산에 사용한다.
- **변수 사용 범위**: 변수는 자신이 선언된 위치에서 자신이 속한 블록 내부까지만 사용이 가능하다. 그밖에서는 사용할 수 없다.

1. 변수는 하나의 값만 저장할 수 있고, 선언 시에 사용한 타입의 값만 저장할 수 있으며, 해당 변수가 선언된 중괄호 {} 안에서만 사용 가능하다.
   1-4. **변수는 초기값이 저장되지 않은 상태로는 읽을 수 없다.**

2. 변수 이름으로 사용할 수 있는 것으로는 "modelName, $value, \_age"가 있다. "**6**hour, **class**, **int**" 등은 사용할 수 없다.
3. 3-4: `sum = score1 + score2;`의 경우 score2는 **선언만 하고 초기화되지 않아서** 오류가 발생한다.
4. 10번 줄의 `v1 = v2 + v3;`에서 오류가 발생한다. int v3는 4번 줄의 **if(true) 내부에서만 허용되는 변수**여서 **블록이 끝나는** 10번 줄부터는 사용할 수 없다.

## 02-2
- **정수 타입**: 정수를 저장할 수 있는 타입. `byte, short, int, long` 타입들을 말한다.
- **char 타입**: 작은따옴표('')로 감싼 하나의 문자 리터럴을 저장할 수 있는 타입
- **String 타입**: 큰따옴표("")로 감싼 문자열을 저장할 수 있는 타입
- **실수 타입**: 실수를 저장할 수 있는 타입. `float, double` 타입들을 말한다.
- **boolean 타입**: 참(true)과 거짓(false)를 저장할 수 있는 타입

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
     - `String var = "나의 직업은 "개발자"입니다.";` → 문자열 안에서 큰따옴표를 쓰려면 역슬래시(\)를 사용해야한다: `\"개발자"\`로 수정
     - `boolean var = 0;` → true 또는 false로만 처리됨
     - `int v2 = 1e2;` → double 타입: `(int) 1e2`로 수정
     - `float = 1e2f;` → 변수 이름이 없음

3.

```
자바는
재미있는 "프로그래밍" 언어
입니다.
```

4. double 타입이 표현할 수 있는 최소값보다 작은 숫자를 할당하려고 해서 (최소 4.9e-324)
5. `출발합니다.`

### 02-2-CGPT
`java에서 다른 건 소문자로만 쓰는데 String 타입만 특이하게 쓰네?`

맞아요! Java에서 기본적으로 변수명이나 클래스명은 소문자나 카멜 케이스(예: `myVariable`, `someMethod`)로 쓰는 게 일반적인 규칙입니다. 하지만 `String` 타입처럼 첫 글자가 대문자인 경우는, Java의 **클래스명** 규칙 때문이에요.

Java에서는 **클래스명**은 대문자로 시작해야 한다는 규칙이 있어요. `String`은 Java에서 제공하는 기본 클래스 중 하나이기 때문에, 첫 글자가 대문자로 시작하는 거죠. 다른 예시로는 `Integer`, `Double`, `Boolean` 같은 클래스들도 모두 대문자로 시작해요.

따라서 `String`은 실제로 **클래스**이기 때문에 대문자로 시작하고, 변수명이나 다른 타입은 보통 소문자나 카멜 케이스로 작성하는 거죠.

이게 약간 특이하게 느껴질 수 있지만, 자바의 네이밍 규칙에 맞춰져 있어서 그런 거예요!


`int, byte, short, long, char, boolean 같은 건 죄다 소문자이거든? 근데 String만 string으로 안 쓰는 거야?`

그렇죠! `int`, `byte`, `short`, `long`, `char`, `boolean` 같은 건 모두 **기본 데이터 타입**(primitive types)인데, 이들은 전통적으로 소문자로 시작해요. 반면에 `String`은 **클래스**이기 때문에 대문자로 시작하는 거예요.

여기서 중요한 차이점은, **기본 타입**은 자바가 직접 제공하는 원시 타입이지만, `String`은 **클래스**로 구현된 객체입니다. 자바에서는 기본 데이터 타입을 사용할 때, 실제로는 객체처럼 다룰 수 없어요(예: 메서드를 호출할 수 없거나, 객체로서 다룰 수 없다). 하지만 `String`은 사실 **클래스**이기 때문에, 그 자체로 객체입니다.

자바에서 \*\*박싱(Boxing)\*\*을 사용할 때, 예를 들어 `int`를 `Integer`로 변환하거나, `boolean`을 `Boolean`으로 변환할 수 있어요. 이런 클래스를 \*\*래퍼 클래스(Wrapper Class)\*\*라고 부르죠. 그런데 `String`은 이러한 래퍼 클래스의 예외적인 존재라, `int`, `boolean`처럼 소문자로 사용되지 않고, 클래스 명명 규칙에 맞춰서 대문자로 시작합니다.

결론적으로, `String`만 유독 대문자로 시작하는 이유는 **기본 데이터 타입이 아니라 클래스**이기 때문이에요. 이게 자바의 네이밍 규칙에 따른 거죠!


`문자 리터럴이 뭐야`
문자 리터럴은 프로그래밍에서 **문자**를 나타내기 위한 값입니다. 일반적으로 따옴표(`'`)로 둘러싸여 있는 단일 문자를 의미해요. 예를 들어:

```python
'a'
'Z'
'1'
' '
```

이런 것들이 문자 리터럴이에요. 여기서 중요한 점은, **단일 문자**만을 표현할 수 있다는 것. 숫자나 여러 문자를 포함한 문자열은 **문자열 리터럴**로 다르게 분류됩니다. 예를 들어, `'abc'`는 문자 리터럴이 아닌 문자열 리터럴이죠.

#### 예시:

* **문자 리터럴**: `'a'`, `'z'`, `'%'`
* **문자열 리터럴**: `"hello"`, `'123'`, `"world!"`

따라서 문자 리터럴은 **하나의 문자**를 표현하는 데 사용된다는 점에서 구분이 돼요.


## 02-3
- **자동 타입 변환**: 자동으로 타입을 변환하는 것. 값의 허용 범위가 작은 타입이, 허용 범위가 큰 타입으로 저장될 때 발생한다.
- **강제 타입 변환**: 강제로 타입이 변환되는 것. 값의 허용 범위가 큰 타입을, 허용 범위가 작은 타입으로 쪼개어서 저장하는 것.
- **문자열 결합 연산**: 문자열과 + 연산을 하면 다른 피연산자 또한 문자열로 변환되어 문자열 결합이 발생한다.
- **Integer.parseInt()**: 문자열을 정수 int 타입으로 변환
- **Double.parseDouble()**: 문자열을 실수 double 타입으로 변환

1. `short shortValue = charValue;`에서 **char 타입은 shrot 타입으로 알아서 변환시킬 수 없다.**
2. `char var = (char)strValue;`의 경우 **char가 단일 문자만 취급**하며, String을 캐스팅할 수 없으므로
3. `byte result = byteValue + byteValue;`는 더하기 **연산에서 자동으로 int 타입으로 변환**되기 때문이다.
4. 5~6번 줄. 5번 줄의 경우 더하기 연산이 자동으로 int 타입으로 변환되어서다. 6번 줄의 경우 5번 줄에서 **이미 같은 이름의 변수가 사용되었기 때문**이다.
5. `char c2 = c1 + 1;`, 더하기 연산에서 자동으로 int 타입으로 변환되므로 `char c2 = (char)(c1 + 1);`으로 수정해야한다.
6. int, 결과는 "2". 나눗셈 연산에서 자동으로 int 타입으로 변환되므로 **계산된 소수점 이하는 버려지게 된다.**
7. "float", `(float) x / y;`
8. `(int)(var1 + var2)`
9. `(int)(var1 + var2 + var3 + (int)Double.parseDouble(var4))`
10.

```
5
23
23
```

11. `Byte.parseByte`, `Integer.parseInt`, `Float.parseFloat`, `Double.parseDouble`

## 02-4
- **System.out.println()**: 괄호에 주어진 매개값을 모니터로 출력하고 개행
- **System.out.print()**: 괄호에 주어진 매개값을 모니터로 출력하고 개행하지 않는다
- **System.out.printf()**: 괄호에 주어진 매개값을 주어진 형식대로 출력
- **System.in.read()**: 키보드에서 입력된 키코드를 읽는다
- **Scanner**: `System.in.read()`의 경우 키코드를 하나씩 읽으므로 2개 이상의 키가 조합된 한글을 읽지 못한다. 따라서 키보드로부터 입력된 내용을 통 문자열로 읽으려고 할 때 사용할 수 있다.

1. `"이름: " + name", ""나이: " + age + "\n"`, `"전화: "+  tel1 + "-" + tel2 + "-" + tel3`
2. `scanner.nextLine();`, `scanner.nextLine();`, `Integer.parseInt(strNum1);`, `Integer.parseInt(strNum2);`
3.

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

## 03-1
- **연산자**: 연산의 종류를 결정짓는 기호. 종류로는 산술(+, -, *, /, %), 증감(++, --), 비교(==, !=, ...), 논리(&&, ||, ...), 대입(=, +=, -=, ...) 등이 있다.
- **피연산자**: 연산식에서 연산되는 데이터 혹은 값. (예: 연산식 `3 + x`에서는 3과 변수 x가 피연산자)
- **연산 방향**: 연산식에서 같은 종류의 연산자가 여러 개 사용될 경우, 방향이 왼쪽에서 오른쪽이거나 오른쪽에서 왼쪽으로 연산된다. 대부분의 연산자는 왼쪽에서 오른쪽으로 연산하지만, 증감(++, --) 및 대입(=, +=, -=)은 오른쪽에서 왼쪽으로 연산한다.
- **연산 우선 순위**: 서로 다른 연산자들이 복합적으로 구성될 경우 우선적으로 연산되는 연산자가 있다. 이때 괄호()로 감싼 연산이 최우선순위를 가지게 된다.

1. 연산자는 피연산자의 수에 따라 단항, 이항, 삼항 연산자로 구분하며, 비교 연산자와 논리 연산자의 산출 타입은 boolean(true/false) 타입이다. 하나의 값이 올 수 있는 자리라면 연산식도 올 수 있다.
   1-3. 연산식은 **하나의 값만 산출**해낸다.

2. 산술 연산(+, -, \*, /)은 연산 방향이 왼쪽에서 오른쪽으로 수행되며, 대입 연산(=, +=)은 연산 방향이 오른쪽에서 왼쪽으로 수행된다. 우선 순위와 관계 없이 먼저 연산을 하고 싶다면 괄호 ()로 묶어준다.
   2-4. **논리 연산(&&, ||)은 산술 연산보다 나중에 수행**된다.

## 03-2
- **증감 연산자(++, --)**: 변수의 값을 1씩 증가/감소시킨다
- **비교 연산자(==, != 등)**: 값이 같거나 다른지를 비교하고 boolean 값을 산출해낸다.
- **논리 연산자(&&, ||, ! 등)**: 논리곱, 논리합, 논리 부정을 수행하고 boolean 값을 산출해낸다.
- **대입 연산자(=, +=, -= 등)**: 오른쪽의 값을 왼쪽에 대입하거나 연산한 다음 대입한다.
- **삼항 연산자(`(조건식) ? A : B`)**: 조건이 true이면 A를 산출, false이면 B를 산출한다.

1. 2번째 줄, 바이트 변수 b에 연산자를 붙이면 int 타입으로 변환되기 때문에
2. 31
3. !stop
4. /, %
5. 3번째 줄의 내용이 정수 연산이라서 결과 또한 정수로 나온다. var3에는 2.0이 저장되고, var4로 `(int)(2.0 * 2) = 4`가 된다.
6. `value / 100 * 100`
7. 0.1f는 정확히 0.1이 아니기 때문에
8. `(lengthTop + lengthBottom) * height / 2.0`
9.

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

10. `double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);`
11. `name.equals("java")`, `password == 12345`
12. true, false
13.

```
value += 10;
value -= 10;
value *= 10;
value /= 10;
```

14. 가

## 04-1

1. if문, switch문
2. if문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있으며, if문은 조건식이 true이면 블록을 실행하고, false이면 블록을 실행하지 않는다. if문의 블록 내부에는 또 다른 if문을 사용할 수 있다.
   2-4. switch문에서 사용할 수 있는 변수의 타입은 **int뿐만 아니라 다른 타입 또한 사용할 수 있다.**

3. `등급은 B입니다.`
4. `우수 회원 혜택을 받으실 수 있습니다.`

## 04-2

1. for문, while문, do-while문
2.

```
int sum = 0;
for (int i = 1; i <= 100; i++) {
  if (i % 3 == 0) {
	sum += i;
  }
}
System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총합: " + sum);
```

3.

```
while (true) {
  int x = (int) (Math.random() * 6) + 1;
  int y = (int) (Math.random() * 6) + 1;
  System.out.println("(" + x + ", " + y + ")");
  if ((x + y) == 5) {
	break;
  }
}
```

4.

```
for (int x = 1; x <= 10; x++) {
  for (int y = 1; y <= 10; y++) {
	if (4 * x + 5 * y == 60) {
	  System.out.println("(" + x + ", " + y + ")");
	}
  }
}
```

5.

```
	for (int i = 0; i < 5; i++) {
	  for (int j = 0; j < i; j++) {
		System.out.print("*");
	  }
	  System.out.println();
	}
```

6.

```
int x = 4;
for (int i = 1; i <= x; i++) {
  for (int j = 1; j <= x - i; j++) {
	System.out.print(" ");
  }
  for (int j = 1; j <= i; j++) {
	System.out.print("*");
  }
  System.out.println();
}
```

7.

```
boolean run = true;
int balance = 0;
Scanner scanner = new Scanner(System.in);

while (run) {
  System.out.println("---------------------------------------------");
  System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
  System.out.println("---------------------------------------------");
  System.out.print("선택> ");
  int x = Integer.parseInt(scanner.nextLine());

  switch (x) {
	case 1:
	  System.out.print("예금액> ");
	  balance += Integer.parseInt(scanner.nextLine());
	  break;
	case 2:
	  System.out.print("출금액> ");
	  balance -= Integer.parseInt(scanner.nextLine());
	  break;
	case 3:
	  System.out.print("잔고액> " + balance + "\n");
	  break;
	case 4:
	  run = false;
	  break;
	default:
	  throw new AssertionError();
  }
  System.out.println();
}
System.out.println("프로그램 종료");
```

## 05-1

1. 참조 타입에는 배열, 열거, 클래스, 인터페이스가 있다. 참조 변수의 메모리 생성 위치는 스택이며, 참조 타입에서 ==, != 연산자는 객체 번지를 비교한다.
   1-4. 참조 변수는 **null 값으로 초기화할 수 있다.**

2. 로컬 변수는 스택 영역에 생성되며 실행 블록이 끝나면 소멸된다. 상수, 메소드 코드, 생성자 코드는 메소드 영역에 생성되며, 배열 및 객체는 힙 영역에 생성된다.
   2-3. 참조되지 않은 객체는 **JVM이 쓰레기 수집기를 실행시켜서 자동으로 제거**한다.

3. String은 클래스이므로 참조 타입이다. 동일한 문자열 리터럴을 저장하는 변수는 동일한 String 객체를 참조하며, new String("문자열")은 무조건 새로운 String 객체를 생성한다.
   3-2. String의 문자열 비교를 위해서는 **equals() 메소드를 사용**해야 한다.

4. 참조 변수에 저장되는 것은 객체의 번지이며, null을 저장해서 변수를 초기화시킬 수 있다. 참조 변수에 null이 저장된 상태에서는 객체를 사용할 수 없다.
   4-4. NullPointerException은 **변수에서 존재하지 않는 객체의 필드나 메소드를 사용하려고할 때 발생**한다.

5. true, false, true, true, true

## 05-2

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

## 05-3

1. 열거 타입은 한정된 값을 갖는 타입이다. 열거 타입 변수에는 열거 타입에 정의된 상수를 대입할 수 있다. 열거 상수는 관례적으로 대문자로 작성한다.
   1-3. 열거 타입 변수에 **null을 대입할 수도 있다.**

2. `public enum LoginResult { SUCCESS, FAIL_ID, FAIL_PASSWORD }`

## 06-1

1. 클래스는 객체를 생성하기 위한 설계도와 같은 것이다. new 연산자로 클래스의 생성자를 호출함으로써 객체가 생성되며, 객체는 클래스의 인스턴스이다.
   1-3. **하나의 클래스로 여러 객체를 생성**할 수 있다.

2. - 메소드: 객체의 동작 부분으로, 실행 코드를 가지고 있는 블록이다.
   - 필드: 객체의 데이터를 저장한다.
   - 생성자: 객체의 초기화를 담당한다.
3. - `String name;`: 필드
   - `Member(String name) {}`: 생성자
   - `void setName(String name) {}`: 메소드

## 06-2

1. 필드는 메소드에서 사용할 수 있다. 필드는 클래스 블록 어디서든 선언할 수 있다. (생성자, 메소드 내부 제외) 그리고 필드는 초기값을 주지 않더라도 기본값으로 자동 초기화된다.
   1-3. 필드는 **객체 외부에서 접근할 수 있다.**

2.

```
public class Member {
	String name;
	String id;
	String password;
	int age;
}
```

3. `new Member()`, `member.name`, `member.age`

## 06-3

1. 생성자는 다른 생성자를 호출하기 위해 this()를 사용할 수 있다. 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다. 매개 변수의 수, 타입, 순서가 다른 생성자를 여러 개 선언할 수 있다.
   1-1. 객체를 생성하려면 **생성자 호출이 반드시 필요하다.**

2.

```
public class Member {
	String name;
	String id;
	String password;
	int age;
}
```

3.

```
Board(String title, String content) {
	this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
}

Board(String title, String content, String writer) {
	this(title, content, writer, "현재 컴퓨터 날짜", 0);
}

Board(String title, String content, String writer, String date) {
	this(title, content, writer, date, 0);
}
```

4.

```
Board board1 = new Board("제목", "내용");
Board board2 = new Board("제목", "내용", "홍길동");
Board board3 = new Board("제목", "내용", "홍길동", "2025-12-31");
Board board4 = new Board("제목", "내용", "홍길동", "2025-12-31", 0);
```

## 06-4

1.
	1-1. 리턴 값이 없는 메소드는 리턴 타입을 **void**로 해야 한다.
	1-2. 리턴 타입이 있는 메소드는 리턴 값을 지정하기 위해 반드시 **return문**이 있어야 한다.
	1-3. 매개값의 개수를 모를 경우 **...**를 이용해서 매개 변수를 선언할 수 있다.
	1-4. 같은 이름의 메소드를 여러 개 선언하는 것을 **메소드 오버로딩**이라고 한다.

2. 메소드 오버로딩이란 동일한 이름의 메소드를 여러 개 선언하는 것을 말하며, 매개 변수의 타입, 개수, 순서를 다르게 선언해야 한다. 매개값의 타입 및 개수에 따라 호출될 메소드가 선택된다.
	2-2. 반드시 리턴 타입이 다를 필요는 없다.

3.
```
public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
```

4.
```
public class Printer {
	static void println(int value) {
		System.out.println(value);
	}
	
	static void println(boolean value) {
		System.out.println(value);
	}
	
	static void println(double value) {
		System.out.println(value);
	}
	
	static void println(String value) {
		System.out.println(value);
	}
}
```

## 06-5

1. 정적 멤버는 static으로 선언된 필드와 메소드를 말한다. 정적 필드와 메소드는 객체 생성 없이 클래스를 통해 접근할 수 있으며, 인스턴스 필드와 메소드는 객체를 생성하고 사용해야 한다.
	1-2. 인스턴스 필드는 생성자에서 초기화할 수 있다.

2. final 필드와 상수는 초기값이 저장되면 값을 변경할 수 없으며, 상수의 이름은 대문자로 작성하는 것이 관례이다. 상수는 객체 생성 없이 클래스를 통해 사용할 수 있다.
	2-2. final 필드와 상수는 생성자에서 초기화할 수 있다.

3.
```
public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
}
```

## 06-6

1. 접근 제한자는 클래스, 필드, 생성자, 메소드의 사용을 제한한다. public 접근 제한은 아무런 제한 없이 해당 요소를 사용할 수 있게 한다. 외부에서 접근하지 못하도록 하려면 private 접근 제한을 해야 한다.
	1-3. default 접근 제한은 **같은 패키지에서만 사용을 허가**한다.

//
## 07-1

1. 부모의 메소드를 자식 클래스에서 재정의(오버라이딩)할 수 있다. 부모의 private 접근 제한을 갖는 필드와 메소드는 상속의 대상이 아니며, protected 멤버는 같은 패키지의 모든 클래스와 다른 패키지의 자식 클래스만 접근할 수 있다.
	1-1. 자바는 **다중 상속을 허용하지 않는다.**

2. 부모의 메소드는 숨김 효과가 나타난다. @Override를 붙이면 컴파일러가 재정의를 확인하며, 부모 메소드를 호출하고 싶다면 super 키워드를 사용할 수 있다.
	2-2. 재정의 시 **접근 제한을 더 강하게 할 수 없다.**

3. final 메소드는 재정의를 할 수 없다.
	3-1. final 클래스/필드/메소드는 모두 상속과 관련이
	3-2. final 메소드를 가진 클래스는 부모 클래스가 될 수 있다.
	3-4. final 클래스는 final 필드가 반드시

4.
5.
```
```

## 07-2

1.