package p06;

public class HumanExec {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.name = "홍길동";
		h1.age = 33;
		
		Human h2 = new Human();
		h2.name = "김영희";
		h2.age = 34;
		
		Human h3 = new Human();
		h3.name = "김복희";
		h3.age = 35;
		
		Human h4 = new Human();
		h4.name = "엄북동";
		h4.age = 36;
		
		Human h5 = new Human();
		h5.name = "정해준";
		h5.age = 37;
		
		Human[] people = new Human[5];
		people[0] = h1;
		people[1] = h2;
		people[2] = h3;
		people[3] = h4;
		people[4] = h5;
		
		Human firstHuman = people[0];
		Human lastHuman = people[0];
		int ageTotal = 0;
		int average = 0;
		
		for(int i=1; i<people.length; i++) {
			Human human = people[i];
			ageTotal += human.age;
			average = ageTotal/people.length;
			if(firstHuman.age>human.age) {
				firstHuman = human;
			}
			if(lastHuman.age < human.age) {
				lastHuman = human;
			}
		}
		
		System.out.println("최고령" + lastHuman.name + lastHuman.age);
		System.out.println("최연소" + firstHuman.name + firstHuman.age);
		System.out.println("나이 총합" + ageTotal);
		System.out.println("나이 평균" + average);

		}
}

