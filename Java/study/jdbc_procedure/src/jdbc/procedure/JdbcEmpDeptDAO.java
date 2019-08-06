package jdbc.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEmpDeptDAO {
	
	//�ű� �μ� ���
	public static boolean deptInsert(JdbcDeptDTO dept) throws SQLException{
		Connection conn = null;
		CallableStatement cstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			cstmt = conn.prepareCall("{call dept_insert(?, ?, ?)}");
			
			cstmt.setInt(1, dept.getDeptno());
			cstmt.setString(2, dept.getDname());
			cstmt.setString(3, dept.getLoc());
			
			int result = cstmt.executeUpdate();
			if(result != 0) {
				JdbcEndView.messageView("�ű� �μ��� ��� �Ǿ����ϴ�.");
				JdbcEndView.deptView(deptSelect(dept.getDeptno()));
				return true;
			}
		}finally {
			DBUtil.close(conn, cstmt);
			}
		return false;
	}
	
	public static boolean empInsert(JdbcEmpDTO emp) throws SQLException{
		Connection conn = null;
		CallableStatement cstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			cstmt = conn.prepareCall("{call emp_insert(?,?,?,?,?,?,?)}");
			
			cstmt.setInt(1, emp.getEmpno());
			cstmt.setString(2, emp.getEname());
			cstmt.setString(3, emp.getJob());
			cstmt.setInt(4, emp.getMgr());
			cstmt.setInt(5, emp.getSal());
			cstmt.setInt(6, emp.getComm());
			cstmt.setInt(7, emp.getDeptno());
			
			int result = cstmt.executeUpdate();
			if(result != 0) {
				JdbcEndView.messageView("\n �ű������� ��� �Ǿ����ϴ�.");
				JdbcEndView.empView(empSelect(emp.getEmpno()));
				return true;
			}
		}finally {
			DBUtil.close(conn, cstmt);
		}
		return false;
	}
	
	public static JdbcDeptDTO deptSelect(int deptno) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		JdbcDeptDTO dept = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from dept01 where deptno = ?");
			
			pstmt.setInt(1, deptno);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				dept = new JdbcDeptDTO(rset.getInt(1), rset.getString(2), rset.getString(3));
			}
		}finally {
			DBUtil.close(conn, pstmt, rset);
		}
		return dept;
	}
	
	public static boolean deptUpdate(int empno, int deptno) throws SQLException{
		Connection conn = null;
		CallableStatement cstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			cstmt = conn.prepareCall("{call dept_update(?,?)}");
			
			cstmt.setInt(1, empno);
			cstmt.setInt(2, deptno);
			
			int result = cstmt.executeUpdate();
			
			if(result != 0) {
				JdbcEndView.messageView(empno + " ����� " + deptno + "�� �μ��� �̵� ó�� �Ǿ����ϴ�." );
//				JdbcEmpDTO emp = emp_select(empno);
				JdbcEndView.empView(empSelect(empno));
				return true;
			}
		}finally{
			DBUtil.close(conn, cstmt);
		}
		return false;
	}
	
	public static boolean empDelete(int empno) throws SQLException{
		Connection conn = null;
		CallableStatement cstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			cstmt = conn.prepareCall("{call emp_delete(?)}");
			
			cstmt.setInt(1, empno);
			int result = cstmt.executeUpdate();
			
			if(result != 0) {
				JdbcEndView.messageView(empno + " ������ ��� ó�� �Ǿ����ϴ�.");
				return true;
			}
		}finally {
			DBUtil.close(conn, cstmt);
		}
		return false;
	}
	
	//Ư������� ���� ���� �� Ȯ�� ����
	public static JdbcEmpDTO empSelect(int empno) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		JdbcEmpDTO emp = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from emp01 where empno=?");
			
			pstmt.setInt(1, empno);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				emp = new JdbcEmpDTO(rset.getInt(1),rset.getString(2), rset.getString(3), rset.getInt(4), 
									 rset.getString(5), rset.getInt(6), rset.getInt(7), rset.getInt(8));
			}
			
		}finally {
			DBUtil.close(conn, pstmt, rset);
		}
		return emp;
	}
	
	
}

