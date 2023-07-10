package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {
	public List<Map<String,String>> getClassInfoList(Map<String,String> param){
		ClassInfoService ciService = new ClassInfoService();
		return ciService.getClassInfoList(param);
	}
	
	public int insertClassInfo(Map<String,String> classInfo) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.insertClassInfo(classInfo);
	}
	
	public int deleteClassInfo (Map<String,String> classInfo) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.deleteClassInfo(classInfo);
	}
	
	public static void main(String[] args) {
		ClassInfoController ciController = new ClassInfoController();
		Map<String,String> param = new HashMap<>();
		param.put("ciName", "수");
		param.put("ciNum", "3");
		List<Map<String,String>> classInfoList = ciController.getClassInfoList(param);
		System.out.println("번호\t이름\t설명");
		for(Map<String,String> classInfo : classInfoList) {
			System.out.println(classInfo.get("ciNum") + "\t" + classInfo.get("ciName") + "\t" + classInfo.get("ciDesc"));
		}
		
//		param.put("ciName","과학");
//		param.put("ciDesc", "졸라어려움");
//		int result = ciController.insertClassInfo(param);
//		System.out.println("실행결과: " + result);
		
		param.put("ciNum","3");
		int result = ciController.deleteClassInfo(param);
		System.out.println("실행결과:" + result);
		
	}

}
