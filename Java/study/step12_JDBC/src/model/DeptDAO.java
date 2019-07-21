package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptCopy;

public class DeptDAO {

	// oracle driver가 이 소스들이 실행되는 시스템에 인스톨(로딩)
	// 1단계
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 모든 부서정보 검색 메소드
	/*
	 * select * from dept_copy; ArrayList에 부서 수만큼 DeptCopy 객체 생성해서 저장후에 ArrayList 반환
	 */

	public static ArrayList<DeptCopy> getAllDept() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<DeptCopy> allData = null;

		try {
			
			//2단계
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			//3단계
			stmt = con.createStatement();
			
			//4단계
			rset = stmt.executeQuery("select * from dept_copy");
			/*
			 * 1. 검색된 데이터 존재 여부 확인 경우의 수 1 : 데이터들이 있다 경우의 수 2 : 데이터가 없다. 2. 경우의 수 1인 경우 검색된
			 * 모든 데이터값을 이미 ResultSet이 보유하고 있는 상태 - boolean next() - ? getXxx(int column순서 or
			 * 컬럼명)
			 */
			allData = new ArrayList<DeptCopy>();
			while (rset.next()) {
//				System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
				//5단계
				allData.add(new DeptCopy(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//자원반환
			try {
				if (rset != null) {
					rset.close();
					rset = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (con != null) {
					con.close();// 자원반환
					con = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return allData;
	}

	public static void main(String[] args) {
		ArrayList<DeptCopy> all = getAllDept();
		for(DeptCopy v : all) {
			System.out.println(v);
		}
	}

}
