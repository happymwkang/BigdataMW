package step04miniProject;

public class SnsModel {
	private static Sns [] admin = new Sns[2];
	private static Sns [] customer = new Sns[3];
	private static int index;
	
	static {
		admin [0] = new Sns("±èµ¿¹ü", 9638);
		admin [1] = new Sns("°­¹Î¿õ", 7276);
		index = 0;
	}
	
	public static boolean write(Sns v) {
		if(index < 3) {
			customer[index++]  =  v ;
			return true;
		}else {
			return false;
		}
	}
	
	public static Sns [] getAll() {
		return customer;	
	}
	
	public static char delete(String id, long pw) {
		Sns v = null;
		for(int i=0; i<customer.length; i++) {
				v = customer[i];
			if(v.getId().equals(id) && v.getPw() == pw) {
				customer[i] = null;
				return 'a';
			}else if(v.getId().equals(id) && v.getPw() != pw) {
				return 'b';
			}else if(!v.getId().equals(id) && v.getPw() == pw) {
				return 'c';
			}else if(!v.getId().equals(id) && v.getPw() != pw) {
				return 'd';
			}
		}
		return 0;
	}
	
	public static char modify(String id, long pw, String posts){
		Sns v = null;
		for(int i=0; i<customer.length; i++) {
				v = customer[i];
				if(v.getId().equals(id) && v.getPw() == pw) {
					customer[i] = new Sns(id, pw, posts);
					return 'a';
				}else if(v.getId().equals(id) && v.getPw() != pw) {
					return 'b';
				}else if(!v.getId().equals(id) && v.getPw() == pw) {
					return 'c';
				}else if(!v.getId().equals(id) && v.getPw() != pw) {
					return 'd';
				}
			}
		return 0;
}
}