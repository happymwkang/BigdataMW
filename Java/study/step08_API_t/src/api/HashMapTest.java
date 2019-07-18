package api;

import java.util.ArrayList;
import java.util.HashMap;

import model.domain.Customer;

public class HashMapTest {
	public static ArrayList<String> get1() {
		ArrayList<String> al2 = new ArrayList<>();//String�� ���� ������ ArrayList
		al2.add("a");
		return al2;
	}
	public static ArrayList get2() {
		ArrayList<String> al2 = new ArrayList<>();//String�� ���� ������ ArrayList
		al2.add("a");
		return al2;
	}
	
	public static void main(String[] args) {
		ArrayList v11 = get2();
		String v21 = (String)v11.get(0);
		//String v211 = v11.get(0);  ����
		
		ArrayList<String> v31 = get2();
		String v41 = v31.get(0);
		
		ArrayList v1 = get1();
		String v2 = (String)v1.get(0);
		
		ArrayList<String> v3 = get1();
		String v4 = v3.get(0);
		
		
		//key�� StringŸ��, value�� String
		HashMap<String, String> m = new HashMap<>();
		//����
		m.put("a", "data1");
		m.put("b", "data2");
		m.put("a", "data3");
		System.out.println(m);
		
		System.out.println(m.get("a")); //data3
		m.remove("b"); //data2 ����
		System.out.println(m.get("b"));//null
		
		//key�� StringŸ��, value�� Customer
		//key�� Customer�� id�� �սô�
		HashMap<String, Customer> m2 = new HashMap<>();
		m2.put("k1", new Customer("tester", "11", "vvip"));
		System.out.println(m2.get("k1").getGrade());
		
		ArrayList<String> al2 = new ArrayList<>();//String�� ���� ������ ArrayList
		al2.add("a");
		al2.add("b");
		al2.add("c");
		al2.add("d");
		
		HashMap<String, ArrayList> m3 = new HashMap<>();
		m3.put("al2", al2);
		System.out.println(m3.get("al2").get(2));//c
		
		HashMap<String, HashMap> m4 = new HashMap<>();
		m4.put("m3", m3);
		System.out.println( ( (ArrayList) m4.get("m3").get("al2") ).get(2));
	}
}
/* 
 * 1. key value ���� ������ ������ �����ϴ� �ڷᱸ�� �н�
 * 2. java.util.Map interface�� �����ϴ� ��� Ŭ�������� key�� value ����
 */




