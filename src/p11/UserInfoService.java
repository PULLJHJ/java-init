package p11;

import java.util.List;
import java.util.Map;

public class UserInfoService {
	
	public List<Map<String,String>> getUserInfoList(String uiName){
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.getUserInfoList(uiName);
	}

}


// controller -> serivce -> reopsitory -> db -> service -> controller 순임.