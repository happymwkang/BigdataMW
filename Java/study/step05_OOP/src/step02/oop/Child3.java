package step02.oop;

class Parent3 extends Object{
	String name;
	int age;
	
	Parent3(){
		super();
	}
	
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Child3 extends Parent3{
	String job;
	
	public Child3() {
		super();
	}
	
	void printAll() {// virtual method invocation
		super.printAll();
		System.out.println(job);
	}
	
	//������ ����� �޼ҵ�
	static Object m() {
		return "string";
	}
	static Object m2() {
		return "string,int,double,boolean";
	}
	
	
	public static void main(String[] args) {
		Parent3 p = new Child3();
		p.printAll();
		System.out.println(((String)m()).charAt(5));
		
		//?m2() ��ȯ���� ,�� ��������(������) �ϳ��� �迭�� 4���� �����Ͱ� ����Ǵ� ������ ��ȯ
		/*�۾��ܰ�
		 * �޼ҵ��� ��ȯ�� ���� -> String ��ȯ -> �迭�� ��ȯ
		 * charAt()/length()/splint()
		 * ? split()�� ���е� ���ڿ����� char [] �����ؼ� ����
		 * ù��° index�� ����� string�̶�� ���ڿ��� char �迭 �����ؼ� �迭�� �����ϱ�
		 */
		String [] all = ((String)m2()).split(",");
		for(String v : all) {
			System.out.println(v);
		}
		
		System.out.println("** String[]�� ù��° �����ͷ� char[]�� ��ȯ�ϱ�**");
		String data = all[0];
		int size = data.length();
		System.out.println("���ڿ��� length : " + size);
		
		char [] cArray = new char[size];
		for(int i =0; i<cArray.length; i++) {
			cArray[i] = data.charAt(i);
		}
		
		System.out.println("** char[]�� ������ ����� ����**");
		for(char v : cArray) {
			System.out.print(v + "\t");
		}
		//������ 5��
		
	}

}
