# Java 문법

## Java 특징

- 먼저 자바는 변수를 만들때 공간을 설정해줘야합니다


## 연산

- 기본적인 연산 사용법

```Java
		int a = 12;
		int b = 13;
		float c = 0f;
```
- 이런식으로 앞에 string(문자), int(숫자), float,double(소숫점을 가진 실수를 표현할 때 사용)
- 등을 사용하여 형을 먼저 지정합니다.

- 자바에서는 정수와 정수를 나누면 결과는 무조건 정수가 나오는 형질이 잇는데

- 이때 float이나 double 사용하여 실수가 나오게 할 수 있습니다

```Java
c=(a+b)/2; // 정수가 나옴
c =(a+b)/2.0f // float 은 뒤에 f를 붙여줘야합니다
// c의 형태를 double로 지정했다면 그냥 소숫점만 적어도됩니다.
```

## 조건문

조건문을 시
a




## Static

- 정적(static)은 고정된이란 의미를 가지고 있습니다. Static이라는 키워드를 사용하여 Static변수와 Static메소드를 만들 수 있는데 다른말로 정적필드와 정적 메소드라고도 하며 이 둘을 합쳐 정적 멤버라고 합니다. (클래스 멤버라고도 합니다.) 정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버입니다. 그렇기에 클래스 로더가 클래스를 로딩해서 메소드 메모리 영역에 적재할때 클래스별로 관리됩니다. 따라서 클래스의 로딩이 끝나는 즉시 바로 사용할 수 있습니다.

![image](https://github.com/ijd1236/Java/assets/130967884/113c8c42-71bc-49db-90e4-1686d9cd4e8c)

- Static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당됩니다. Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있는 장점을 가지지만 Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재하게 됩니다. 그렇기에 Static을 너무 남발하게 되면 만들고자 하는 시스템 성능에 악영향을 줄 수 있습니다.

```Java
public class StaticVar {
	
	
	String name;
	int score;
	static int count = 0;

}
```

- 스태틱 변수는 다음과 같이 지정합니다
- StaticVar 클래스의 count는 이제 StaticVar 클래스를 사용하는 모든 함수에서 공유됩니다. ( 0으로 지정했으니 count 는 0부터 시작합니다.)

```Java

StaticVar sv1 = new StaticVar();

sv1.name = "홍길동";
sv1.score = 90;
StaticVar.count++;  // static 을 사용한 변수는 공유되기 때문에 굳이 sv1 이라고 지정할 필요가 없습니다

StaticVar sv2 = new StaticVar();

sv2.name = "김나나";
sv2.score = 70;
StaticVar.count++;  



StaticVar sv3 = new StaticVar();

sv3.name = "철수";
sv3.score = 50;
StaticVar.count++;

System.out.println("지금까지 학생수는" + StaticVar.count);

```


- 이런 코드를 생성했을때 StaticVar의 count 변수에 숫자를 하나씩 더해서 추가합니다.
- 총 3번의 count++ 가 있었으니 출력값은 "지금까지 학생수는 3" 이 됩니다.





## Method Overloding

- Method Overloding 이란 하나의 클래스에 같은 이름의 메서드를 여러 개 정의하는 것을 말합니다.

### 오버로딩의 조건

- 메서드의 이름이 같아야합니다
- 매개변수의 개수 또는 타입이 달라야합니다.
- 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않습니다.

```Java
public class Add {

	int add(int a, int b){
		int result = a + b;
		return result;
	}
	
	double addDouble(double a , double b){
		 double result =a + b;
		 return result;
	}
	
	
	double addIntDouble(int a , double b){
		double result = a + b;
		return result;

```

- 예를 들어 각 타입의 계산을 할 수 있는 여러개의 함수(메서드)들을 만들었을때


```Java
public class Add {

	int add(int a, int b){
		int result = a + b;
		return result;
	}
	
	double add(double a , double b){
		 double result =a + b;
		 return result;
	}
	
	
	double add(int a , double b){
		double result = a + b;
		return result;

```

- 이렇게 여러개의 함수 명을 사용하지 않고 하나의 메소드명으로 통일하여 하나의 메소드가 여러 작업을 하게 하는 것을 오버로딩이라고 합니다

```Java
		
		Add a =new Add();	
		System.out.println(a.add(2,3));
		System.out.println(a.add(2.3,3.541))
		System.out.println(a.add(3, 1.56));		
```

![image](https://github.com/ijd1236/Java/assets/130967884/226f93a1-131d-4a56-8999-8f357bbea558)


- 메소드 오버로딩으로 함수를 통일하면 이렇게 하나의 메서드 명으로 여러가지 결과를 출력할 수 있습니다.




