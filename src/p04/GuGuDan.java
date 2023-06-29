package p04;

import java.util.Scanner;

public class GuGuDan {
	
	public static void printGuGuDan(int dan, int dan2) {
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=dan2; j++) {
				System.out.println(i+ "x" + j + "=" + (i*j));
			}
		}

	}
	public static void main(String[] args) {
	printGuGuDan(8,10);
	
	}
	}
