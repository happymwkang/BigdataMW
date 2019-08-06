package jdbc.procedure;

import java.sql.SQLException;

public class JdbcTestDrive {

	public static void main(String[] args) {
		//DEPT01 �ű� �μ� INSERT
		JdbcDeptDTO deptInsert = new JdbcDeptDTO(50, "�濵����", "����");
		try{
			JdbcEmpDeptDAO.deptInsert(deptInsert);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		//Ư�� ��� �μ��̵� (emp01 ���̺� �����ȣ�� �μ���ȣ ���� SMITH)
		try{
			JdbcEmpDeptDAO.deptUpdate(7369, 10);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//Ư�� ��� ��� (CLARK)
		try{
			JdbcEmpDeptDAO.empDelete(7782);
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		//�������� ���(���ο�)
		JdbcEmpDTO emp = new JdbcEmpDTO(1111,"���ο�", "�λ���", 0, 5000,0, 50);
		try{
			JdbcEmpDeptDAO.empInsert(emp);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}

