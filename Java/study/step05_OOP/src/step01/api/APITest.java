package step01.api;

public class APITest {

	//���ڿ��� ù��° ������ �����͸� ��ȯ - String
	//�ΰ��� ���ڸ� �����ϸ鼭 �ִ밪 ��ȯ - Math
	//���ڿ��� ���̸� ��ȯ - String
	/* String 
	 * ���̸� ��ȯ : ��ȯ - 
	 * 	public int length(){
	 *  	�� �޼ҵ带 ������ �ش� ��ü�� ���ڿ� ���̸� ��ȯ
	 *  }
	 */
	public static void main(String[] args) {
		//encore�� index�� 0~6
		String data = "encore";
		System.out.println(data.charAt(0));
		System.out.println(data.charAt(1));
		
		//Math ��ü �߿�? max() �޼ҵ� ����� �߿�?
		System.out.println(Math.max(10, 20));
		System.out.println(data.length());
		
		String v = "��";
	//	System.out.println(Integer.parseInt(v));
		
		
		/* "3" : String
		 *  -> int�� ��ȯ
		 *  �߻��Ǵ� ����� ��
		 *  	1. ����
		 *  		- �� ��ȯ
		 *  	2. ������
		 *  		- ��ȯ �Ұ����� �����͸� �޾Ƽ� ��ȯ �Ұ� 
		 *  Integer
		 *  public static int parseInt(String v){
		 *  	v->int-> ��ȯ
		 *  }
		 *  - static �޼ҵ�? non-static�޼ҵ�?
		 *  
		 *  Byte
		 *  public static byte parseByte(String v){
		 *  	v->byte-> ��ȯ
		 *  }
		 *  Float
		 *  public static float parseFloat(String v){
		 *  	v->float-> ��ȯ
		 *  }
		 *  Double
		 *  public static double parseDouble(String v){
		 *  	v->double-> ��ȯ
		 *  }
		 */
		
	}

}

/*
- �� �޼ҵ�� ��ȯŸ�԰� parameter�� ������ ��쿡 static���� �ϸ� ? 
public char charAt(int index){
	parameter �� ���Ե� index�� ��ġ�� �� ������ �ش� ��ü�� �����ؼ� ��ȯ
}
1. public static char charAt(int index){
	parameter �� ���Ե� index�� ��ġ�� �� ������ �ش� ��ü�� �����ؼ� ��ȯ
}
syso(String.charAt(9));


2. public char charAt(int index){
	parameter �� ���Ե� index�� ��ġ�� �� ������ �ش� ��ü�� �����ؼ� ��ȯ
}
String s = "adae";
syso(s.charAt(2));

 */
