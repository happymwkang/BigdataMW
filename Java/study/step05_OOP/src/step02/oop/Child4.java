package step02.oop;

class Parent4{
	String id;
}

public class Child4 extends Parent4{
	String pw;
	//������ : ��ȯŸ�� �޼ҵ�� argument�� 100%
	 public String toString() {
		 return id;
	 }

	public static void main(String[] args) {
		String s = "���ڿ�";
		System.out.println(s);
		System.out.println(s.toString());
		
		Child4 c = new Child4();
		c.id = "��� id";
		System.out.println(c);
		System.out.println(c.toString());
	}

}
