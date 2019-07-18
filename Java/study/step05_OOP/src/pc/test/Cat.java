package pc.test;

 class Animal extends Object{
	String name; //µ¿¹°Á¾
	int hunger;	 //¹è°íÇÄ Áö¼ö
	String food; //¸ÔÀÌ
	
	public Animal() {
		super();
	}
	
	void eat () {
		System.out.print(food);
		System.out.println(" ³È³È³È");
	}
	
	void hungry () {
		if(hunger < 5) {
			eat();
		}
		else {
			System.out.println("¹èºÎ¸£´Ù¿Ë");
		}
		
	}
	
}
 
public class Cat extends Animal{
	String sound; //µ¿¹°¼Ò¸®
		
	public Cat() {}

	void eat() {
		super.eat();
		System.out.print(sound);
	}

	static Object ReturnRoam() {
		return "¾î½½··¾î½½··";
	}
			
	public static void main(String[] args) {
		String walk = (String)ReturnRoam();
		System.out.println(walk);
		
		Cat c = new Cat();
		
		c.name = "°í¾çÀÌ";
		c.hunger = 4;
		c.food = "»ı¼±";
		c.sound = "¾ß¿Ë~";
		
		c.hungry();
		
	}
	
}
