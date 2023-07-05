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

## 생성자 constructor

- 생성자란 인스턴스(클래스로부터 생성된 객체)가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'를 말합니다.
- 인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용합니다.
- 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 합니다
- 기본적으로 클래스를 지정하면 생성자가 만들어져 있지만 보이지 않습니다.(Member 클래스면 Member()이런식으로)
```Java
Member a = new Member()
```
- 해당 코드는
- 연산자 new 에 의해서 메모리(heap)에 클래스의 인스턴스가 생성되고
- 생성자 가 호출되서 수행합니다
- 연산자 new 의 결과로, 생성된 Member인스턴스의 주소가 반환되어 참조변수 a에 저장되는 형식입니다.

###  생성자의 조건

- 생성자의 이름은 클래스의 이름과 같아야합니다.
- 생성자는 리턴값이 없습니다.

```Java

public class Member {
	
	String name;
	String tel;
	String address;
```

- 이름, 전화번호, 주소 세개의 멤버변수를 받는 클래스가 있습니다
- 이걸 다른 클래스에서 인스턴스에 멤버변수 값을 작성하고자 합니다.

```Java
Member m2 = new Member();

m2.name = "김나나";
m2.tel = "010-2222-3333";
m2.address = "인천시 연수구";

```
- 그럼 보통 이렇게 new 클래스를 호출, 메모리 공간을 확보하고 인스턴스 멤버변수에 데이터를 저장하는 작업을거치는데
- 위에서도 말했듯이 생략된 Member() 생성자를 호출하여 멤버변수 값을 지정하고 그 값을 m2 참조변수에 저장합니다.
- 그런데 이걸
```Java
Member m3 = new Member("철수", "010-5213-5135", "인천시 남동구");
```
- 이런식으로 메모리 공간확보와 멤버변수에 값 저장을 한번에 하려고 합니다.
- 이렇게 하기 위해서는 생성자를 추가 해야합니다.(추가할시 기존에 생략된 생성자는 추가되는 생성자로 초기화되므로 Member() 생성자를 다시 입력해 줘야 기존 Member() 생성자를 호출한 m2 참조변수도 사용할 수 있습니다.

- Member 클래스에서
```Java
Member(String name, String tel, String address){
	this.name =name;      // this는 멤버변수를 지정할때 사용합니다.
	this.tel = tel;
	this.address= address;
}
```
- 다음과 같은 생성자를 만들어 줘서 m3 참조 변수에 메모리 공간 확보와 , 데이터 저장을 한번에 할 수 있습니다.




## Access

- 접근 제어란, 다른 클래스에서 이 클래스의 멤버 변수나 메소드를 이용할 수 있도록 열어주거나 닫아주는 역할을 하는것을 말합니다.
- 접근 제어는 총 4개의 키워드가 있습니다
- 1. default : 아무 키워드도 적지 않으면 적용됩니다 같은 패키지 안에서만 접근 가능합니다.
  2. public : 다른 클래스 어디서건 클래스의 멤버 변수와 메소드에 접근할 수 있게합니다.
  3. 


## 상속(inheritnace)

- 상속이란 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것입니다
- 두 클래스를 부모와 자식으로 관계를 맺어줍니다.
- 자식은 부모의 모든 멤버를 상속 받습니다.(생성자, 초기블럭 제외)
- 자식의 멤버 개수는 조상보다 적을 수 없습니다.

```Java
public class Parent {

	
	public String name;
	public int age;
	public int money;
}
```

- 예시를 위해 부모 클래스 코드를 만들어줍니다.

```Java
public class Child extends Parent {
	
	public String hobby;
	}

```


- 그리고 자식 클래스를 만들어 줍니다
- 이때 자식 클래스는 extends Parent(부모 클래스이름) 을 입력해서 부모 클래스를 상속받습니다

```Java
public class Child extends Parent {
	public void printChild() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(money);
		System.out.println(hobby);
	}

}
```

- 그럼 자식 클래스에서는 부모 클래스를 상속 받았기 때문에
- 부모 클래스가 가지고 있는 name, age, money 의 멤버변수를 별도로 입력하지 않아도 사용할 수 있습니다.

### Method overriding 

- 부모클래스(super) 한테 물려받은 함수 이름을 그대로 사용하되
- 자식 클래서에 맞는 코드로 수정하는 방식을 Method overriding 이라고 합니다

- 부모 클래스의 멤버변수 값을 출력하는 pint() 함수를 상속하는 예시를 들어보겠습니다.

![image](https://github.com/ijd1236/Java/assets/130967884/ce081fd4-45d4-441c-9dec-7196834efdeb)
![image](https://github.com/ijd1236/Java/assets/130967884/f8326eab-07f0-4df9-9b94-809b8662c3b2)

```Java
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}

```

- 다음과 같은 방법으로 쉽게 부모함수를 상속 받을 수 있습니다
- 여기서 super.pint();는 부모함수의 print() 합수 내용을 뜻합니다. 따로 입력하지 않아도 부모 함수에서 설정한 코드 들이 저기에 포함됩니다.
- 이제 저 코드를 수정해서 사용하면 됩니다.
- 상속받을때 private 제한됩니다




## 추상 클래스(Abstract class)

- 추상 클래스는 추상 메서드(미완성 메서드)를 포함하고 있는 클래스를 말합니다
- 추상 메서드는 선언부만 있고 구현부(몸통) 가 없는 메서드를 말합니다
```Java
public abstract class GrandParent {

	public abstract void print();

}

```
- 추상 클래스는 이런 형태로 만듭니다 추상 메서드를 사용하면 클래스와 메서드에 abstarct 를 붙여줘야합니다
- 추상 클래스는 상속 받는 클래스에게 메서드를 완성하도록 유도하기 위해 만듭니다.
```java
public class Parent extends GrandParent{

	String job;
	
	
	@Override
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);

```



- 이런식으로 상속받은 클래스에서 Override로 추상 메서드를 완성시킵니다.

## 인터페이스(interface)

- 일종의 추상클래스, 추상클래스(미완성 설계도) 보다 추상화 정도가 높습니다.
- 실제 구현된것이 전혀 없는 기본설계도 입니다
- 추상 메서드와 상수만을 멤버로 가질 수 있습니다
- 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용됩니다.
- 미리 정해진 규칙에 맞게 구현하도록 표준을 제시할 때 사용합니다.
- 
![image](https://github.com/ijd1236/Java/assets/130967884/fb8e0bf2-5770-4de7-a318-fd13fbf48248)

- 생성시 class 가 아닌 interface로 생성합니다

```Java
public interface Card {
}
```

- 그럼 코드가 다음과 같이 class 가 아닌 interface로 작성됩니다
```Java
	static final int CLOVER = 1;
	static final int HEART = 2;
	static final int DIAMOND = 3;
	static final int SPADE = 4;
	public void print();
	public String getCardNumber();
```
- 다음과 같이 상수와 추상 메서드를 입력합니다
- 상수란 변수에 한번 데이터를 저장한 후에 값을 바꿀 수 없는 변수 입니다
- 상수는 대문자로 입력합니다
```Java
public interface Player {
	
	
	public void play(String name);
	
	public void end();

}
```

- 다른 인터페이스도 만들어줍니다
  
```Java
public class MyCard implements Card, Player  {
}

```
- 상속받을 클래스를 만들어줍니다 이때 클래스와 인터페이스가 다른 점은
- '여러개를 상속 받을 수 있는' 점입니다 Card,와 Player 해당 클래스는 인터페이스를 상속받았습니다.
```Java
	@Override
	public void play(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCardNumber() {
		// TODO Auto-generated method stub
		return null;
	}
```
-  상속 받은 인터페이스의 메서드들을 전부 Override할 수 있습니다

## 문자 정리

- 데이더 넣기
```Java
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		
		int num1 =3;
		Integer num2 = 3;
		
		System.out.println(num1);
		System.out.println(num2);
		
		double num3 = 3.5;
		Double num4 = 3.5;

```

- 문자열 붙이기

```Java
		String str3 = "Bye";
		System.out.println(str1 + str3);
		System.out.println(str1 +" "+ str3);
```
- 문자열을 숫자로 바꾸기
- 
```Java	
		String str4 = "317";
		// 첫번째 방법
		int a = Integer.valueOf(str4).intValue();
		System.out.println(str4 + 100); // 이상하게 나옴 , *는 에러남
		System.out.println(a + 100);
		
		// 두번째 방법
		a = Integer.parseInt(str4);
		System.out.println(a + 100);
		String str5 = "3.14";
		
		double b = Double.valueOf(str5).doubleValue();
		System.out.println(b+100);
		
		b = Double.parseDouble(str5);
		System.out.println(b+100);
```
- 숫자를 문자열로 만들기
  
```Java
		
		// 첫번째 방법
		int k = 365;
		System.out.println("" + k);
		System.out.println(k + "");
		
		// 두번째 방법
		String data = String.valueOf(k);
		
		//세번째 방법
		data = Integer.toString(k);
		
		// 문자열 붙여주는 함수
		str1 = "hello";
		str2 = "bye";
		
		String result =str1.concat(str2);
		System.out.println(result);
```
- 문자열 갯수 구하기
- 
```Java
		System.out.println(str1.length());
```

- 공백 단위로 표기하기
```Java
		str3 = "안녕하세요 반갑습니다. 식사하셨어요?";
		String[] dataArr = str3.split(" ");
		for(int i =0; i < dataArr.length; i++) {
			System.out.println(dataArr[i]);
		}  // 출력결과 = 안녕하세요
  				 반갑습니다
  				 식사하셨어요
```

- 문자 가져오기 및 변환

```Java
  
		// 처음부터 끝까지
		System.out.println(str3.substring(0));

		// 5번째 글짜부터 끝까지
		System.out.println(str3.substring(4));

		// 2번째 글짜부터 5번째 글자까지
		System.out.println(str3.substring(1,4+1));

		String email1 = " abc@naver.com ";
		String email2 = "abc@naver.com";
		// 두 문자열이 같은지를 확인할 때는 == 사용하면 안된다.
		System.out.println(email1.equals(email2));
		// 공백 제거하는 함수
		System.out.println(email1.strip());
		System.out.println(email1.strip().equals(email2));

		// 대소문자로 변환
		System.out.println(email2.toUpperCase());
		System.out.println(email2.toLowerCase());
		// 문자열이 같은거 ? = equls 함수
		// 문자열의 대소관계 파악 compareTo 함수
```

```Java
- 문자 대소 파악하기 및 문자 확인

		str1 = "apple";
		str2 = "banana";
		str3 = "candy";
		str4 = "Apple";
		
		// compareTo 함수는
		// 0이면, 두 문자열은 같다
		// 음수면, 작다
		// 양수면 크다
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareTo(str4.toLowerCase()));

  	
		// email 안에. @가 있는지 확인
		
		System.out.println(email2.contains("@"));
		System.out.println(email2.contains("ddd"));
		
		//email2 안에 @가 어디에 있는지 인덱스를 알고 싶을 때
		System.out.println(email2.indexOf("@"));
		
		// 공백제거
		System.out.println(email1.trim());
		String str6 = "    Hello  world~";

		System.out.println(str6.trim());
		//가운데 공백은 안날아감
```

## ArrayList
```Java
String[] nameArr = new String[5];
```
- 다음과 같이 Array(배열)은 생성할 때 무조건 갯수를 정해놓고 생성해야 하는데
- 이렇게 되면 정해진 갯수 이상으론 데이터 추가가 불가능합니다
- 따라서 갯수 제한 없이 데이터를 마음대로 추가할 수도 , 삭제할 수도 있는 ArrayList 를 이용합니다
```Java
			ArrayList<String> nameList = new ArrayList<>();  // 클랙스 개체라 new 키워드를 사용하여 객체를 생성해야합니다
			
			// 데이터 넣기 c
			nameList.add("홍길동");
			nameList.add("김나나");
			nameList.add("철수");
			
			// 데이터 가져오기 R
			
			System.out.println(nameList.get(1));	 // "김나나"를 가져옵니다	
			
			// 데이터 변경 U
			
			nameList.set(1, "Mike"); // 김나나가 Mike로 수정됩니다
			
			System.out.println(nameList.get(1));
			
			// 데이터 삭제 D
			
			nameList.remove(0);  // "홍길동"이 사라집니다

			// 전체 데이터를 루프 도는 방법
			// for each 반복문 
			for ( int i = 0; i< nameList.size(); i++) {
				System.out.println(nameList.get(i));
			}
			
			// for each 반복문
			// 파이썬의 for 같은 반복분
			
			for ( String name : nameList) {
				System.out.println(name);
			}
			
			// ArrayList 에 데이터가 몇개 있는지 확인하는 방법
			System.out.println(nameList.size());
			// 데이터가 비어잇는지 확인하는 방법



			System.out.println(nameList.isEmpty());
			// 데이터를 모두 삭제하는 함수
			nameList.clear();
			System.out.println(nameList.isEmpty());
```

## HashMap

- Map 은 파이썬의 딕셔너리와 비슷한 데이터 스트럭쳐로서,
- key, value 의 쌍으로 저장합니다.

- 객체 생성
```Java
HashMap<String, String> phoneMap = new HashMap<>();
```

