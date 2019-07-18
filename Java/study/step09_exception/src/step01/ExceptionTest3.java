package step01;

import exception.NotAdminException;

public class ExceptionTest3 {
	/* ID값 검증 단 admin이 아닌 경우 NotAdminException 발생
	 * 경우의 수 1 : 정상 - admin인 경우
	 * 경우의 수 2 : 비정상 - admin이 아닌 경우
	 * 			NotAdminException 발생(객체 생성해서 throw)
	 */
	public static void idCheck(String id) throws NotAdminException{
		if(!id.equals("admin")) {
			throw new NotAdminException("?");
		}
		System.out.println("안녕하세요 admin님");
	}
	
	public static void main(String[] args) {
		//admin 검즘 요청
		/* 실행 결과의 경우의 수 1 - 정상
		 * 		      경우의 수 2 - 비정상
		 * 					:NotAdminException 객체를 받음 - 예외 처리 문법 필수
		 */
		try {
		idCheck("admin");
		}catch(NotAdminException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------");
		try {
			idCheck("admin---------");
			}catch(NotAdminException e) {
				e.printStackTrace();
			}
		
	}

}
