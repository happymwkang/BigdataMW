package jdbc.procedure;

import java.sql.SQLException;

public class JdbcTestDrive {

	public static void main(String[] args) {
		//DEPT01 신규 부서 INSERT
		JdbcDeptDTO deptInsert = new JdbcDeptDTO(50, "경영관리", "서울");
		try{
			JdbcEmpDeptDAO.deptInsert(deptInsert);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		//특정 사원 부서이동 (emp01 테이블 사원번호로 부서번호 변경 SMITH)
		try{
			JdbcEmpDeptDAO.deptUpdate(7369, 10);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//특정 사원 퇴사 (CLARK)
		try{
			JdbcEmpDeptDAO.empDelete(7782);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		//신입직원 등록(강민웅)
		JdbcEmpDTO emp = new JdbcEmpDTO(1111,"강민웅", "부사장", 0, 5000,0, 50);
		try{
			JdbcEmpDeptDAO.empInsert(emp);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}

