/* �н�����
 * 1. ����
 * 	1-1. Ÿ��
 * 		1. �⺻
 * 			byte, short, int, long
 * 			float, double
 * 			char
 * 			boolean
 * 		2. ����
 * 			- �⺻�� ������ ��� Ÿ��
 * 	1-2. ���� ��ġ�� ���� ����
 * 		1. ���
 * 			-class {} ����
 * 		2. ����
 * 			- ������ �Ǵ� �޼ҵ��� parameter
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
		
			People.setName("���ο�");
			People.setAge(32);
			
			System.out.println(People.getName());
			System.out.println(People.getAge());
			
		}
	
		
			//People ��ü ���� - new People()
		
			//People�� "��¦ �̸�", -���� ����, SetXxx(��)
		
			//People�� getXxx() ȣ���ؼ� ���
	}

