package step04miniProject;

public class Log4J {
	private static Log4J instance = new Log4J();
	private Log4J() {}
	public static Log4J getInstance() {
			return instance;
	}
	
	public String info() {
		return "안녕하세요";
	}
	public String warn() {
		return "권한이 없음";
	}
	public String  writeLog() {
		return "게시글이 등록 되었습니다";
	}
}
