package jdbc.procedure;

public class JdbcEndView {
	
	//부서정보 등록 출력 
	public static void deptView(JdbcDeptDTO dept){
		JdbcDeptDTO deptResult = dept;
		//System.out.println(project);		
		System.out.println(deptResult);	
	}
	
	//사원정보 변경 확인 출력 
		public static void empView(JdbcEmpDTO emp){
			JdbcEmpDTO empResult = emp;
			//System.out.println(project);		
			System.out.println(empResult);	
		}
	
	//예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

}





