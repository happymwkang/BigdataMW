//singleton design pattern
package step04miniProject;


public class OneInstance {
	private static OneInstance instance = new OneInstance();
	
	private OneInstance() {}
	
	public static OneInstance getInstance() {
		return instance;
	}
	}
