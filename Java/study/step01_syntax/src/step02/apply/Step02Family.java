package step02.apply;

public class Step02Family {
	
	String Fr;
	String name;
	int age;

	Step02Family(){}
	/*
	void addAge(int addAge) {
		age = age + addAge;
	}
	
	String getFr() {
		return Fr;
	}
	

	String getName() {
		return name;
	}
	 */
	public static void main(String[] args) {
		Step02Family pet1 = new Step02Family();
		
		//System.out.println(Family);//step02.apply.step02Family@7852e922
		
		pet1.Fr = "�ݷ���";
		pet1.name = "�Ǵ�";
		pet1.age = 7;
		
		Step02Family pet2 = new Step02Family();
		
		pet2.Fr = "�ݷ���";
		pet2.name = "¡��";
		pet2.age = 7;
		
		Step02Family pet3 = new Step02Family();
		
		pet3.Fr = "�ݷ���";
		pet3.name = "����";
		pet3.age = 7;
		
		Step02Family children = new Step02Family();
		
		children.Fr = "�ڳ�";
		children.name = "������";
		children.age = 1;
		
		Step02Family wife = new Step02Family();
		
		wife.Fr = "����";
		wife.name = "������";
		wife.age = 34;
		
		System.out.println(pet1.Fr+"/"+pet1.name+"/"+pet1.age);
		System.out.println(pet2.Fr+"/"+pet2.name+"/"+pet2.age);
		System.out.println(pet3.Fr+"/"+pet3.name+"/"+pet3.age);
		System.out.println(children.Fr+"/"+children.name+"/"+children.age);
		System.out.println(wife.Fr+"/"+wife.name+"/"+wife.age);
	}
}
