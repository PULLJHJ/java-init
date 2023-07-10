package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class UserInfoRepository {
	
	/*
	 * 디비 주소
	 * 커넥션
	 * 드라이버
	 * 아이디,비밀번호
	 */
	
	public List<Map<String,String>> getUserInfoList(String uiName){
		List<Map<String,String>> userInfoList = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM user_info";
			if(uiName != null) {
				sql += " WHERE UI_NAME LIKE '%" + uiName + "%'";
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> userInfo = new HashMap<>();
				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfo.put("uiName", rs.getString("UI_NAME"));
				userInfoList.add(userInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfoList;
	}

}
