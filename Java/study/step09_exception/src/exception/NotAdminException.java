package exception;

public class NotAdminException extends Exception{
	
	public NotAdminException() {}
	
	public NotAdminException(String mess) { //예외 발생시 예외 관련 상황 메세지 적용을 위한 생성자
		super(mess);
	}

}
