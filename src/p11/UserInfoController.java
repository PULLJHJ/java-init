package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoController {
	public List<Map<String,String>> getUserInfoList(Map<String,String> param){
		UserInfoService uiService = new UserInfoService();
		return uiService.getUserInfoList(param);
	}
	
	public int insertUserInfo(Map<String,String> userInfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.insertUserInfo(userInfo);
	}
	
	public int deleteUserInfo (Map<String,String> userInfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.deleteUserInfo(userInfo);
	}
	
	public static void main(String[] args) {
		UserInfoController uiController = new UserInfoController();		
		Map<String,String> param = new HashMap<>();
		param.put("uiName", "이");
		param.put("uiNum", "7");
		List<Map<String,String>> userInfoList = uiController.getUserInfoList(param);
		System.out.println("번호\t이름\t아이디\t비밀번호");
		for(Map<String,String> userInfo : userInfoList) {
			System.out.println(userInfo.get("uiNum") + "\t" + userInfo.get("uiName") + "\t" + userInfo.get("uiId") + "\t" + userInfo.get("uiPwd"));
		}
//		param.put("uiName", "김영희");
//		param.put("uiId", "cs3");
//		param.put("uiPwd", "111111");
//		int result = uiController.insertUserInfo(param);
//		System.out.println("실행결과:" + result);
		
		param.put("uiNum", "7");
		int result = uiController.deleteUserInfo(param);
		System.out.println("실행결과:" + result);
		
		
	}

}
