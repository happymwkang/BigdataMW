package jdbc.procedure;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	static Properties propertiesInfo = new Properties();
	static{ 
		try {
			propertiesInfo.load( new FileInputStream("db.properties") );
			Class.forName(propertiesInfo.getProperty("jdbc.driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(propertiesInfo.getProperty("jdbc.url"), 
											propertiesInfo.getProperty("jdbc.id"), 
											propertiesInfo.getProperty("jdbc.pw"));
	}
	
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try {
			if(con != null) {
				con.close();
				con = null;
			}
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
			if(rset != null) {
				rset.close();
				rset = null;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection con, Statement stmt) {
		try {
			if(con != null) {
				con.close();
				con = null;
			}
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
