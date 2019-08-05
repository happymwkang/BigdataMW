package jdbc.procedure;

public class JdbcTestDrive {

	public static void main(String[] args) {
		//DEPT01 신규 부서 INSERT
		JdbcDeptDTO deptInsert = new JdbcDeptDTO(50, "경영관리", "서울");
		JdbcEmpDeptDAO.dept_insert(deptInsert);
		
		//특정 사원 부서이동 (emp01 테이블 사원번호로 부서번호 변경 SMITH)
		JdbcEmpDeptDAO.dept_update(7369, 10);
		
		//특정 사원 퇴사 (CLARK)
		JdbcEmpDeptDAO.emp_delete(7782);
		
		
		//신입직원 등록(강민웅)
		JdbcEmpDTO emp = new JdbcEmpDTO(1111,"강민웅", "부사장", 0, 5000,0, 50);
		JdbcEmpDeptDAO.emp_insert(emp);
	}
}

