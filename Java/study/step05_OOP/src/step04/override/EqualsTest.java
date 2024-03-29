/* 학습내용
 * 1. 값비교
 * 	1. 참조
 * 		1. 주소값
 * 			-동일한 객체
 * 			- ==
 * 		2. 객체 보유 내용값
 * 			- 타입만 동일한 경우 다른 객체라 하더라도 보유하고 있는 데이터가 동일한지를 비교
 * 			- equals()
 * 
 * 	2. 기본 타입 데이터
 * 		- ==
 * 	3. String의 equals()
 * 		- Object 클래스의 주소값 비교 로직을 재정의를 해서 서로 다른 객체이긴 하나 내용만 동일하다면 True
 * 	4. java.lang.Object의 equals()
 * 		- public boolean equals(Objedct o){
 * 			객체의 주소값 비교
 * 		}
 * 
 * 5. java.lang.String 또는 다수의 하위 클래스들의 equals()
 * 		- 재정의
 * 		- public boolean equals(Objedct o){
 * 			동일한 타입인 경우 서로 다른 객체라 하더라도 객체의 멤버변수들(데이터) 비교시 true or false
 * 		}
 */
package step04.override;


public class EqualsTest extends Person{
	
	public EqualsTest(String name, int age){
		super(name, age);
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("동범", 25);
		Person p2 = new Person("동범", 25);
		System.out.println(p1.equals(p2));
	}

}

class Person extends Object{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object o) {
		
		if(o instanceof Person ) {
			Person p = (Person) o;
			if(name.equals(p.name) && age == p.age) {
				return true;
			}
		}
			return false;
	}
	/* equals() 재정의
	 * 1. Person 타입에 한해서 - instanceof
	 * 2. 동일한 타입인 경우 - instanceof
	 * 3. 멤버 변수들값 비교 - 참조타입 equals() / 기본타입 ==, 상속받지 않은 멤버 호출시 반드시 형변환 필수
	 * 4. 다 동일하다면? True
	 * 5. 하나라도 다르다면? false
	 * 
	 */
	
}
