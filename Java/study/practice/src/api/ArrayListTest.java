package api;

import java.util.ArrayList;

import model.domain.Customer;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("string");
		a1.add(new Customer("tester", "77", "vvip"));
		a1.add("a");
		a1.add("b");
		a1.add("c");
		String s = (String)a1.get(0);
		System.out.println(s);
		
		String s1 = (String)a1.get(2);
		System.out.println(s1);
		a1.remove(2);
		String s2 = (String)a1.get(2);
		System.out.println(s2);
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(22);
		a2.add(32);
		a2.add(42);
		int i = a2.get(2);
		System.out.println(i);
	}
	
}
