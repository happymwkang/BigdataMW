package pc.test;

 class Animal extends Object{
	String name; //������
	int hunger;	 //����� ����
	String food; //����
	
	public Animal() {
		super();
	}
	
	void eat () {
		System.out.print(food);
		System.out.println(" �ȳȳ�");
	}
	
	void hungry () {
		if(hunger < 5) {
			eat();
		}
		else {
			System.out.println("��θ��ٿ�");
		}
		
	}
	
}
 
public class Cat extends Animal{
	String sound; //�����Ҹ�
		
	public Cat() {}

	void eat() {
		super.eat();
		System.out.print(sound);
	}

	static Object ReturnRoam() {
		return "������";
	}
			
	public static void main(String[] args) {
		String walk = (String)ReturnRoam();
		System.out.println(walk);
		
		Cat c = new Cat();
		
		c.name = "�����";
		c.hunger = 4;
		c.food = "����";
		c.sound = "�߿�~";
		
		c.hungry();
		
	}
	
}
