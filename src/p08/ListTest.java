package p08;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		String str1 = "안녕 ";
		String str2 = "내 소개를";
		String str3 = " 하지 ";
		String str4 = " 내 직업은";
		String str5 = " 개발자 ";
		
		String[] strs = new String[5];
		strs[0] = str1;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = str5;

		
		ArrayList<String> strList = new ArrayList<String>();  //무조건 0부터 시작함  ArrayList<String>이 데이터 타입임.
		strList.add(str1);                                     //ArrayList는 배열이 차레대로 출력됨.
		strList.add(str2);
		strList.add(str3);
		strList.add(str4);
		strList.add(str5);
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
} 
