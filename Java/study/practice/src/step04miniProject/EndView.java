package step04miniProject;


public class EndView {
	public static void printAll(Sns [] all) {
		for(Sns v : all) {
			if(v != null) {				
				System.out.println(v.toString());
			}
		}
	}
	public static void printSuccess(String msg) {
		System.out.println(msg);
	}

	public static void printFail(String msg) {
		System.out.println(msg);
	}
	
}