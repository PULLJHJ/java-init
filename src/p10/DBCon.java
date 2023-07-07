package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	//전화기가 필요함,
	//유심칩 
	//전화번호
	//인증절차
	//
	
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
/*		Connection con;
		try {
			con = DriverManager.getConnection(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
*/