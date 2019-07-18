//�ڵ�� ���� �ڹ��� ��� ����
/* �ʼ� �ϱ� ����
 * 1. ��ü ���� - instance
 * 	: heap�̶�� �޸𸮿� ��� �����ϰ� ��� ������ ����
 * 2. Parent ������ ���� �Ϸ�
 * 	: Parent ��ü ����, name��  age������ ��� �����ϰ� ���� 
 * 3. Child�� Parent ���
 * 
 */

package step02.oop;

class Parent extends Object{
	String name;
	int age;
	
	Parent(){
		super() ;
		System.out.println("�θ�");
	}
	void printAll() {
		System.out.println(name.toString());
		System.out.println(age);
	}
}
public class Child extends Parent{
	String job;
	public Child() {
		super();
		System.out.println("�ڽ�");
	}
	
	//������ overriding/override
	void printAll() { 
		super.printAll();
		System.out.println(job);
	}
	
	static Object returnString() {//Object o = "string"; ��ü Ÿ�԰��� �ڵ� ����ȯ
		return "string";
	}
	
	public static void main(String[] args) {
		String data = (String)returnString();
		
		Child c = new Child();
		c.name = "������";
		c.age = 25;
		c.job = "���� �Ŀ� it man";
		c.printAll();
		
		//���� Ÿ���� ���� Ÿ�� ���� - ������
		Parent p = new Child();
		p.name = "�ڽĸ�";
		p.age = 10;
		//p.job = "it";
		Child c2 = (Child)p;//��ü Ÿ�԰��� ����ȯ(������� ����ȯ)
		c2.job = "it";
				//new ���̵� ��ü ���� : ""/{��1, ��2,..}
		
		
		Object p22 = new Child();
		Parent p2 = (Parent)p22;
		p2.name = "�ڽĸ�";
		p2.age = 10;
		//p.job = "it";
		Child c22 = (Child)p;
		c22.job = "it";
		
		
	}
}




