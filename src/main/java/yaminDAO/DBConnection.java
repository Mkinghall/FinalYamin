package yaminDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	


		static final String USERNAME = "Master";
		static final String PASSWORD = "Y@min123!";
		static final String DB_URL= "jdbc:mysql://localhost:3306/zumba2";
		static final String JDBC_DRIVER= "com.mysql.jdbc.Driver";
		
		public static Connection initConnection() {
			Connection conn = null;
			try {
				System.out.println("create DB Connection?");
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			return conn;
			}
		}



