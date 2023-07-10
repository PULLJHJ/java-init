package p11;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInfoController {
	public List<Map<String,String>> getUserInfoList(String uiName){
		UserInfoService uiService = new UserInfoService();
		return uiService.getUserInfoList(uiName);
	}
	
	public int insertUserInfo(Map<String,String> userInfo) {
		return 0;
	}
	
	public int deleteUserInfo (Map<String,String> userInfo) {
		return 0;
	}
	
	public static void main(String[] args) {
		UserInfoController uiController = new UserInfoController();		
		List<Map<String,String>> userInfoList = uiController.getUserInfoList("홍");
		for(Map<String,String> userInfo : userInfoList) {
			System.out.println(userInfo);
		}
	}

}
