/* 학습내용
 * 1. 기초문법습득
 * 2. 데이터
 * 	- 오늘 식사한 한 친구의 이름(name)과 나이(age)로 프로그램 만들기
 * 3. 기능
 * 	- 데이터 저장 기능, 나이값을 동적으로 증가 기능, 데이터 제공 기능
 * 4. 설계
 * 	1. 각 기능별 메소드를 개별로 개발
 * 	2. 실제 사용 가능한 메모리를 시스템 내부적으로 생성, 활용
 * 5. 개발 설계
 * 	1. 데이터를 저장하고자 하는 메모리는 총 몇개? 이름과 나이 두개
 * 	2. 문법으로 실행하면서 내부적으로 그러한 동작처럼 실행
 * 		- 제시된 방법 : 객체 생성
 * 	3. 주의사항
 * 		-클래스 개발 자체가 객체 생성 의미하는게 절대 아님
 * 
 */
package step01;

public class Ex02Team {
       //문자열
	   String name;
	   //int
	   int age;
	   
	   //생성자 - 클래스명과 동일, 반환자체가 없음
	   Ex02Team(){}
	   
	   //메소드 - 리턴 (){} 필수
	   void addAge(int addAge) {
		   age = age + addAge;
	   }
	   //age 변수값 제공하는 메소드
	   /*고려사항
	    * 1. 메소드명? getAge 
	    * 2. 해당 변수값 반환 따라서 변수 타입을 명확히 파악후에 메소드 반환타입으로 설정 : int
	    */
	   int getAge() {
		   return age;
	   }
	   //? 이름을 반환하는 기능의 메소드 직접 구현
	   String getName() {
		   return name;
	   }
	   
	public static void main(String[] args) {
			//실제 사용 가능하게 메모리에 생성하기 - 객체 생성
			//new 생성자 호출로 사용자 정의 데이터 표현, 단 변수 타입도 사용자 정의 타입
			Ex02Team team = new Ex02Team();
		
			//객체가 저장된 단순 주소값 출력
			System.out.println(team);//step01.Ex02Team@7852e922
		
			//메모리에 원하는 데이터로 저장하기
			team.name = "강민웅";
			
			team.age = 32;
			//메모리에 저장된 데이터 가져와서 출력하기 - 데이터 획득 및 활용
	}

}
