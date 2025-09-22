## 04-1 조건문: if문, switch문

- **if문**: `if(조건식) {...}`. 조건식이 true가 되면 중괄호 내부를 실행
- **if-else문**: `if(조건식) {...} else {...}`. 조건식이 true가 되면 if 중괄호 내부를 실행, false가 되면 else 중괄호 내부를 실행
- **if-else if-else문**: `if(조건식 1) {...} else if(조건식 2) {...} else {...}`. 조건식 1이 true가 되면 if 중괄호 내부를 실행, 조건식 2가 true가 되면 else if 중괄호 내부를 실행, 조건식 1 및 조건식 2 모두 false가 되면 else 중괄호 내부를 실행
- **switch문**: `switch(변수) {case 값1: ... case 값2: ... default: ...}`. 변수의 값이 '값1'이라면 1번째 case 코드를 실행, '값2'이면 2번째 case 코드를 실행, '값1' 또는 '값2' 모두 아니라면 default 코드를 실행

### 확인 문제 및 풀이

1. 조건문: if문, switch문
2. if문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있으며, if문은 조건식이 true이면 블록을 실행하고, false이면 블록을 실행하지 않는다. if문의 블록 내부에는 또 다른 if문을 사용할 수 있다.

   2-4. switch문에서 사용할 수 있는 변수의 타입은 **int뿐만 아니라 다른 타입 또한 사용할 수 있다.**

3. `등급은 B입니다.`
4. `우수 회원 혜택을 받으실 수 있습니다.`

## 04-2 반복문: for문, while문, do-while문

- **for문**: `for(초기화식; 조건식; 증감식)`. 조건식이 true가 될 때까지만 중괄호 내부를 반복하며, 반복할 때마다 증감식이 실행된다. 초기화식은 조건식과 증감식에서 사용할 루프 카운터 변수를 초기화하며, 주로 지정된 횟수만큼 반복할 때 사용한다.
- **while문**: `while(조건식) {...}`. 조건식이 true가 될 때까지만 중괄호 내부를 반복 실행
- **do-while문**: `do {...} while(조건식);`. 먼저 do 중괄호 내부를 실행하고난 그 다음 조건식이 true가 되면 다시 중괄호 내부를 반복 실행
- **break문**: for문·while문·do-while문 내부에서 실행되면 반복을 취소
- **continue문**: for문·while문·do-while문 내부에서 실행되면 증감식 또는 조건식으로 돌아감

### 확인 문제 및 풀이

1. 반복문: for문·while문·do-while문
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
