/* 학습내용
 * 1. 변수
 * 	1-1. 타입
 * 		1. 기본
 * 			byte, short, int, long
 * 			float, double
 * 			char
 * 			boolean
 * 		2. 참조
 * 			- 기본을 제외한 모든 타입
 * 	1-2. 선언 위치에 따른 구분
 * 		1. 멤버
 * 			-class {} 하위
 * 		2. 로컬
 * 			- 생성자 또는 메소드의 parameter
 */
package step01;

public class Ex03Variable {
	
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {

			Ex03Variable People = new Ex03Variable();
		
			People.setName("강민웅");
			People.setAge(32);
			
			System.out.println(People.getName());
			System.out.println(People.getAge());
			
		}
	
		
			//People 객체 생성 - new People()
		
			//People에 "내짝 이름", -나이 대입, SetXxx(값)
		
			//People의 getXxx() 호출해서 출력
	}

