package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpDate {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID: ");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();
		System.out.println("NAME:");
		String uiName = scan.nextLine();	
		
		try {
			Connection con = DBCon.getCon();
			String sql = "UPDATE USER_INFO SET UI_NAME =  WHERE UI_NUM = 5";
			Statement stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);
			while(rs.next()) {
				String uiId = rs
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	}
