package exception;

public class NotAdminException extends Exception{
	
	public NotAdminException() {}
	
	public NotAdminException(String mess) { //���� �߻��� ���� ���� ��Ȳ �޼��� ������ ���� ������
		super(mess);
	}

}
