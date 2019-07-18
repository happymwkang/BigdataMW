//singleton design pattern
package pattern;


public class OneInstance {
	private static OneInstance instance = new OneInstance();
	
	private OneInstance() {}
	
	public static OneInstance getInstance() {
		return instance;
	}
	}
