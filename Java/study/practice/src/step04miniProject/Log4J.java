package step04miniProject;

public class Log4J {
	private static Log4J instance = new Log4J();
	private Log4J() {}
	public static Log4J getInstance() {
			return instance;
	}
	
	public String info() {
		return "�ȳ��ϼ���";
	}
	public String warn() {
		return "������ ����";
	}
	public String  writeLog() {
		return "�Խñ��� ��� �Ǿ����ϴ�";
	}
}
