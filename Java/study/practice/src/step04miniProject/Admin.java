package step04miniProject;


public class Admin {
	//������ �����ڰ� admin�̶�� id������ login�� ȣ��Ǵ� �޼ҵ�� ����
	//���� �����̶� ����
	static Log4J log = Log4J.getInstance();
	
	public static void login() {
		log.info();
	}
	//�����ڰ� �ƴԿ��� ���� ������ó�� �α��� �õ��� ����Ǵ� �޼ҵ�� ����
	public static void loginFail() {
		System.out.println(log.warn()); 
	}
	public static void WriteInfo() {
		System.out.println(log.writeLog()); 
	}
}
