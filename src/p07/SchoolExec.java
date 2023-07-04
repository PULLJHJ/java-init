package p07;

public class SchoolExec {
	
	public static void main(String[] args) {
	//	Object obj = new MiddleSchool();
		//MiddleSchool ms = (MiddleSchool)obj;
		//System.out.println(ms.studentType);
		
		School middleSchool = new MiddleSchool();
		middleSchool.name = "양주";
		middleSchool.address ="경기도 양주시 삼숭로";
		School highSchool = new HighSchool();
		highSchool.name = "양주";
		middleSchool.address = "경기도 양주시 고읍동";
		School school = new School();
		school.name = "학교";
		
		School[] schools = new School[3];
		schools[0] = middleSchool;
		schools[1] = highSchool;
		schools[2] = school;
		
		for(int i=0; i<schools.length; i++) {
			System.out.print(schools[i].name);
			System.out.println(schools[i].address);
			if(schools[i] instanceof MiddleSchool) {
				MiddleSchool ms = (MiddleSchool)schools[i];
				ms.studentType = "중학교";
				System.out.println(ms.studentType);
			}else if(schools[i] instanceof HighSchool) {
				HighSchool hs = (HighSchool)schools[i];
				hs.studentType = "고등학교";
				System.out.println(hs.studentType);
			}else {
				System.out.println();
			}
		}
	}

}
