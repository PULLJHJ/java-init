package p04;

import java.util.Scanner;

public class Cafe {

	public static String getCoffee(String order, int price) {
		int coffeePrice = 5000;
		if(coffeePrice>price) {
			return (coffeePrice-price) + "원이 부족합니다";
			
		} 
		if(coffeePrice<price){
			return (price-coffeePrice) +"원 더 주셨습니다.";
		}
		
		return "주문하신" + coffeePrice + "원 짜리" + order + "가 준비되었습니다.";
	}	
	public static void main(String[] args) {
		String coffee = getCoffee("아아",5000);
		System.out.println(coffee);

	}

}
