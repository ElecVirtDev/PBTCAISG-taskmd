## 14-1 입출력 스트림

- **입출력 스트림**: Java에서 데이터는 스트림(Stream)을 통해 입출력된다. 프로그램이 출발지인지 도착지인지에 따라서 사용하는 스트림의 종류가 결정된다. 프로그램이 도착지이면 흘러온 데이터를 입력받아야 하므로 입력 스트림을 사용한다. 반대로 프로그램이 출발지이면 데이터를 출력해야 하니 출력 스트림을 사용한다.
- **InputStream**: 바이트 기반 입력 스트림의 최상위 클래스로 추상 클래스이다. 모든 바이트 기반 입력 스트림은 InputStream 클래스를 상속받아 만들어진다. `InputStream` 클래스에는 바이트 기반 입력 스트림이 기본적으로 가져야할 메소드가 정의되어 있다.
- **OutputStream**: 바이트 기반 출력 스트림의 최상위 클래스로 추상 클래스이다. 모든 바이트 기반 출력 스트림 클래스는 OutputStream 클래스를 상속받아서 만들어진다. `OutputStream` 클래스에는 모든 바이트 기반 출력 스트림이 기본적으로 가져야할 메소드가 정의되어 있다.
- **Reader**: 문자 기반 입력 스트림의 최상위 클래스로 추상 클래스이다. 모든 문자 기반 입력 스트림은 `Reader` 클래스를 상속받아서 만들어진다. `Reader` 클래스에는 문자 기반 입력 스트림이 기본적으로 가져야할 메소드가 정의되어 있다.
- **Writer**: 문자 기반 출력 스트림의 최상위 클래스로 추상 클래스이다. 모든 문자 기반 출력 스트림 클래스는 `Writer` 클래스를 상속받아서 만들어진다. `Writer` 클래스는 모든 문자 기반 출력 스트림이 기본적으로 가져야할 메소드가 정의되어 있다.

### 확인 문제 및 풀이

1. 입출력 스트림에서, 프로그램을 기준으로 데이터가 들어오면 입력 스트림이며, 프로그램 기준으로 데이터가 나가면 출력 스트림이다. 파일에 데이터를 저장하려면 출력 스트림을 사용해야 한다.
   1-1. 하나의 스트림으로는 입력과 출력이 동시에 불가능하다.
2. `Reader`의 `read()` 메소드는 1문자를 읽고 리턴한다. `InputStream`의 `read()` 메소드는 1byte를 읽고 리턴한다. `InputStream`의 `read(byte[] b)` 메소드는 읽은 바이트 수를 리턴한다.
   2-1. 이미지 데이터는
3. `InputStream`의 `read(byte[] b, int off, int len)` 메소드의 리턴값은 읽은 바이트 수이며, 1번째 매개값 b에는 읽은 데이터가 저장된다. 2번째 매개값 off는 1번째 매개값 b에서 데이터가 저장될 시작 인덱스이다.
   3-4. 3번째 매개값 len은
4. 출력 스트림에서 데이터를 출력한 후 `flush()` 메소드를 호출하는 이유는 출력 스트림의 버퍼에 있는 데이터를 모두 출력하고 버퍼를 비우기 위함이다.
   4-2~4. 출력 스트림을 메모리에서 제거하거나, 버퍼에 있는 데이터를 모두 삭제하거나, 출력 스트림을 닫는 역할은 `close()`이다.

## 14-2 보조 스트림

- **보조 스트림**: 다른 스트림과 연결되어 여러가지 편리한 기능을 제공해주는 스트림. 보조 스트림은 입출력을 수행할 수 없으므로 입출력 소스와 바로 연결되는 `InputStream, OutputStream, Reader, Writer` 등에 연결해서 입출력을 수행한다. 보조 스트림은 문자 변환·입출력 성능 향상·기본 타입 입출력 등의 기능을 제공한다.
- **문자 변환**: 소스 스트림이 바이트 기반 스트림(`InputStream·OutputStream·FileInputStream·FileOutputStream`)이면서 입출력 데이터가 문자라면 `Reader`와 `Writer`로 변환해서 사용하는 것을 고려할 수 있다. 그 이유는 문자 입출력은 `Reader`와 `Writer`가 편리하기 때문이다. `OutputStreamWriter`는 `Writer`로 변환하는 보조 스트림이고, `InputStreamReader`는 `Reader`로 변환하는 보조 스트림이다.
- **성능 향상**: 기본적으로 출력 스트림은 내부에 작은 버퍼를 가지고 있다. 다만 이것만으로는 불충분하며, 보조 스트림 중에서는 메모리 버퍼를 추가로 제공하여 프로그램의 실행 성능을 향상시크는 것들이 있다. 바이트 기반 스트림에서는 `BufferedInputStream·BufferedOutputStream`이 있고, 문자 기반 스트림에는 `BufferedReader·BufferedWriter`가 있다.
- **기본 타입 입출력**: `DataInputStream`과 `DataOutputStream` 보조 스트림을 연결하면 기본 타입인 `boolean·char·short·int·long·float·double`을 입출력할 수 있다.
- **개행 출력**: `PrintStream·PrintWriter의 println()` 메소드는 출력할 데이터 끝에 개행 문자인 `\n`을 추가한다. 그래서 출력할 때 콘솔이나 파일에서 줄 바꿈이 일어난다.

### 확인 문제 및 풀이

1. `InputStreamReader`는 `InputStream`을 `Reader`로 변환하는 보조 스트림이며, `BufferedInputStream`은 데이터 읽기 성능을 향상시키는 보조 스트림이다. `PrintStream`은 라인 단위로 출력할 수 있는 보조 스트림이다.
   1-3. `DataInputStream`은 원시 데이터를 입력하는 보조 스트림이다. (객체의 경우 `ObjectInputStream·ObjectOutputStream`을 사용)
2.

```
FileReader frame = new FileReader(filePath);
BufferedReader br = new BufferedReader(fr);

int rowNum = 0;
String rowData;
while((rowData = br.readLine()) != null) {
	System.out.println(++rowNum + ": " + rowData);
}

br.close();
```

## 14-3 입출력 관련 API

- **System.in**: Java는 콘솔에서 키보드의 데이터를 입력받을 수 있도록 System 클래스의 in 정적 필드를 제공한다. `System.in`은 `InputStream` 타입의 필드이며, 주로 `InputStreamReader` 보조 스트림과 `BufferedReader` 보조 스트림을 연결해서 사용하거나, `Scanner`를 이용해서 입력된 문자열을 읽는다.
- **System.out**: 콘솔에서 키보드로 입력된 데이터를 `System.in`으로 읽었다면, 반대로 콘솔에서 모니터로 데이터를 출력하기 위해서는 System 클래스의 out 정적 필드를 사용한다.
- **Scanner**: 입출력 스트림도, 보조 스트림도 아니다. 문자 파일이나 바이트 기반 입출력 스트림에서 라인 단위 문자열을 쉽게 읽도록 하기 위해 `java.util` 패키지에서 제공하는 클래스이다.
- **File**: `java.io` 패키지에서 제공하는 File 클래스의 경우 파일 및 폴더(디렉터리) 정보를 제공하는 역할

1.

```

```
