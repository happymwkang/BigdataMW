package jdbc.procedure;

public class JdbcTestDrive {

	public static void main(String[] args) {
		//DEPT01 �ű� �μ� INSERT
		JdbcDeptDTO deptInsert = new JdbcDeptDTO(50, "�濵����", "����");
		JdbcEmpDeptDAO.dept_insert(deptInsert);
		
		//Ư�� ��� �μ��̵� (emp01 ���̺� �����ȣ�� �μ���ȣ ���� SMITH)
		JdbcEmpDeptDAO.dept_update(7369, 10);
		
		//Ư�� ��� ��� (CLARK)
		JdbcEmpDeptDAO.emp_delete(7782);
		
		
		//�������� ���(���ο�)
		JdbcEmpDTO emp = new JdbcEmpDTO(1111,"���ο�", "�λ���", 0, 5000,0, 50);
		JdbcEmpDeptDAO.emp_insert(emp);
	}
}

