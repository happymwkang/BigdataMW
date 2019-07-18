/* �н�����
 * 1. ����
 * 	1. ����
 * 		1. �ּҰ�
 * 			-������ ��ü
 * 			- ==
 * 		2. ��ü ���� ���밪
 * 			- Ÿ�Ը� ������ ��� �ٸ� ��ü�� �ϴ��� �����ϰ� �ִ� �����Ͱ� ���������� ��
 * 			- equals()
 * 
 * 	2. �⺻ Ÿ�� ������
 * 		- ==
 * 	3. String�� equals()
 * 		- Object Ŭ������ �ּҰ� �� ������ �����Ǹ� �ؼ� ���� �ٸ� ��ü�̱� �ϳ� ���븸 �����ϴٸ� True
 * 	4. java.lang.Object�� equals()
 * 		- public boolean equals(Objedct o){
 * 			��ü�� �ּҰ� ��
 * 		}
 * 
 * 5. java.lang.String �Ǵ� �ټ��� ���� Ŭ�������� equals()
 * 		- ������
 * 		- public boolean equals(Objedct o){
 * 			������ Ÿ���� ��� ���� �ٸ� ��ü�� �ϴ��� ��ü�� ���������(������) �񱳽� true or false
 * 		}
 */
package step04.override;


public class EqualsTest extends Person{
	
	public EqualsTest(String name, int age){
		super(name, age);
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("����", 25);
		Person p2 = new Person("����", 25);
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
	/* equals() ������
	 * 1. Person Ÿ�Կ� ���ؼ� - instanceof
	 * 2. ������ Ÿ���� ��� - instanceof
	 * 3. ��� �����鰪 �� - ����Ÿ�� equals() / �⺻Ÿ�� ==, ��ӹ��� ���� ��� ȣ��� �ݵ�� ����ȯ �ʼ�
	 * 4. �� �����ϴٸ�? True
	 * 5. �ϳ��� �ٸ��ٸ�? false
	 * 
	 */
	
}
