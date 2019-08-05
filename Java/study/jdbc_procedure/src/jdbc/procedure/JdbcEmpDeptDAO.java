package jdbc.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEmpDeptDAO {
	
	//신규 부서 등록
	public static boolean dept_insert(JdbcDeptDTO dept) {
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
				System.out.println("신규 부서가 등록 되었습니다.");
				System.out.println(dept_select(dept.getDeptno()));
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBUtil.close(conn, cstmt);
			}
		return false;
	}
	
	public static boolean emp_insert(JdbcEmpDTO emp) {
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
				System.out.println("\n 신규직원이 등록 되었습니다.");
				System.out.println(emp_select(emp.getEmpno()));
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, cstmt);
		}
		return false;
	}
	
	public static JdbcDeptDTO dept_select(int deptno) {
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
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rset);
		}
		return dept;
	}
	
	public static boolean dept_update(int empno, int deptno) {
		Connection conn = null;
		CallableStatement cstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			cstmt = conn.prepareCall("{call dept_update(?,?)}");
			
			cstmt.setInt(1, empno);
			cstmt.setInt(2, deptno);
			
			int result = cstmt.executeUpdate();
			
			if(result != 0) {
				System.out.println(empno + " 사원이 " + deptno + "번 부서로 이동 처리 되었습니다." );
//				JdbcEmpDTO emp = emp_select(empno);
				System.out.println(emp_select(empno));
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, cstmt);
		}
		return false;
	}
	
	public static boolean emp_delete(int empno) {
		Connection conn = null;
		CallableStatement cstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			cstmt = conn.prepareCall("{call emp_delete(?)}");
			
			cstmt.setInt(1, empno);
			int result = cstmt.executeUpdate();
			
			if(result != 0) {
				System.out.println(empno + " 직원이 퇴사 처리 되었습니다.");
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, cstmt);
		}
		return false;
	}
	
	//특정사원의 정보 변경 후 확인 로직
	public static JdbcEmpDTO emp_select(int empno) {
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
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rset);
		}
		return emp;
	}
	
	
}

