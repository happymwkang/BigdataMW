package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptCopy;

public class DeptDAO {

	// oracle driver�� �� �ҽ����� ����Ǵ� �ý��ۿ� �ν���(�ε�)
	// 1�ܰ�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��� �μ����� �˻� �޼ҵ�
	/*
	 * select * from dept_copy; ArrayList�� �μ� ����ŭ DeptCopy ��ü �����ؼ� �����Ŀ� ArrayList ��ȯ
	 */

	public static ArrayList<DeptCopy> getAllDept() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<DeptCopy> allData = null;

		try {
			
			//2�ܰ�
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			
			//3�ܰ�
			stmt = con.createStatement();
			
			//4�ܰ�
			rset = stmt.executeQuery("select * from dept_copy");
			/*
			 * 1. �˻��� ������ ���� ���� Ȯ�� ����� �� 1 : �����͵��� �ִ� ����� �� 2 : �����Ͱ� ����. 2. ����� �� 1�� ��� �˻���
			 * ��� �����Ͱ��� �̹� ResultSet�� �����ϰ� �ִ� ���� - boolean next() - ? getXxx(int column���� or
			 * �÷���)
			 */
			allData = new ArrayList<DeptCopy>();
			while (rset.next()) {
//				System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
				//5�ܰ�
				allData.add(new DeptCopy(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//�ڿ���ȯ
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
					con.close();// �ڿ���ȯ
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
