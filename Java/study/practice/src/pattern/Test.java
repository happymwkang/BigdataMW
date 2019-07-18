package pattern;


public class Test {
	
	public static void main(String[] args) {
		//고객인데 admin인양 로그인 상황이라 가정
		//코드로 filtering
		String admin = "admin";
		String customer = "customer";
		if(!customer.equals("admin")) {
			Admin.loginFail();
			
		
		}
	}
}
