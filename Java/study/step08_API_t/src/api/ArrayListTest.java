package api;

import java.util.ArrayList;

import model.domain.Customer;

public class ArrayListTest {

	public static void main(String[] args) {
		//String : ���ڿ� -> Customer : id/pw/grade
		ArrayList al = new ArrayList();
		al.add("string");//index 0��° �ڵ�����
		al.add(new Customer("tester", "77", "vvip"));//index 1
		al.add("a");
		al.add("b");
		al.add("c");
		String s = (String)al.get(0);   
		System.out.println(s);
		
		
		System.out.println(al.size());//����� ���� ������ ���� Ȯ�� ����ȯ �޼ҵ�
		System.out.println(al.get(0));//string
		al.remove(0);
		System.out.println(al.get(0));//Customer(id=tester, pw=77, grade=vvip)
		
		System.out.println("---------------------");
		//���׸� �ݿ��ؼ� ArrayList ���� ������ Ÿ�� ����
		ArrayList<String> al2 = new ArrayList<>();//String�� ���� ������ ArrayList
		al2.add("an");
		al2.add("b");
		al2.add("c");
		al2.add("d");
	//	al2.add(new Customer()); ����
		String v = al2.get(0);
			
		
		//wrapper class[autoboxing, unboxing]
		//�⺻���� �����ؼ� ��üȭ �ϴ� �����̱� ������ wrapper
		/* �⺻ 8������ ����� Ŭ���� : java.lang package�� ����� Ŭ������
		 * int : Integer
		 * byte : Byte */
		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(3);//al3.add(new Integer(3)); 
		al3.add(new Integer(10));
		
		/* = ( (Integer)al3.get(1) ).intValue(); */
		int i3 = al3.get(1);
		System.out.println(i3);
	}
}
/* ����
 * 1. ArrayList ��ü ���� - �޸� ����
 * 2. public boolean add(Object o){} 
 * 	- ���� �޼ҵ�
 *  - index 0���� ���������� ����, �������� ���� ���� �迭ó�� index
 * 3. public Object get(int index){}   
 * 	 - ��ȯ �޼ҵ�
 * 4. public boolean remove(Object o){}
 *    public Object remove(int index){}
 * 	- ����
 * 
 */


