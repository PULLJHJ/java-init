package p05;

public class FoodExec {
	
	public static void printFood(Food[]foods) {
		for(Food f:foods) {
			System.out.println("음식:"+f.name);
			System.out.println("가격:" + f.price);
			System.out.println("타입:" + f.type);
		}
		
	}
	public static void main(String[] args) {
		Food f = new Food();
		f.name = "삼겹살";
		f.price = 15000;
		f.type = "한식";
		
		Food f1 = new Food();
		f1.name = "치킨";
		f1.price = 25000;
		f1.type = "한식";
		
		Food f2= new Food();
		f2.name = "짜장면";
		f2.price = 8000;
		f2.type = "한식";
		
		Food f3 = new Food();
		f3.name = "과자";
		f3.price = 2000;
		f3.type = "한식";
		
		Food f4 = new Food();
		f4.name = "닭갈비";
		f4.price = 14000;
		f4.type = "한식";
		
		Food[] foods = new Food[5];
		foods[0] = f;
		foods[1] = f1;
		foods[2] = f2;
		foods[3] = f3;
		foods[4] = f4;
		
		printFood(foods);
		
	}
}	
