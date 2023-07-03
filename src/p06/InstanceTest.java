package p06;

class Car{
	public String name;
	public static String type;
	
}
public class InstanceTest {
	
	public static void main(String[] args) { 
		Car.type = "승용차";
		Car Sonata = new Car();
		System.out.println(Sonata.name);
		Sonata.name = "소나타";
		System.out.println(Sonata.name);
		
		Car car1 = new Car();
		System.out.println(car1.name); // null값 나옴.
	}
}
