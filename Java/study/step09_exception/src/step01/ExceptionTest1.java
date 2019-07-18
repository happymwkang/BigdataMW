/* 학습내용
 * 1. 배열의 실제 메모리 사이즈보다 더 큰 index 영역의 데이터를 출력
 * 	- 논리적인 오류
 * 	- 컴파일 오류? 실행 오류?
 * 
 */
package step01;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int [] i = {1, 2, 3};
		System.out.println(i[1]);
		System.out.println(i[2]);//ArrayIndexOutOfBoundsException
		
		int i2 = 10/1;
		System.out.println(i2);//java.lang.ArithmeticException
		
//		String s = null;
//		System.out.println(s.length());//java.lang.NullPointerException
		
		String s2 = "3";
		int i3 = Integer.parseInt(s2);//? java.lang.NumberFormatException

		B b = new B();
		//B c = new C();//오류
		A a = new B();
		A a2 = new C();
		
		B bb = (B)a;
		//C cc = (C)a;//java.lang.ClassCastException
		
		
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);//false
		
		System.out.println(b instanceof B);
		//System.out.println(b instanceof C);// 오류		
		
		
		
		
	}
}

class A{}
class B extends A{}
class C extends A{}


