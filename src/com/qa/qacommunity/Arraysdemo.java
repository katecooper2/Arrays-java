package com.qa.qacommunity;

public class Arraysdemo {

	
	public static void main(String[] args) {
		int[] ageArray = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
		ageArray[2]= 24;
		
		
		for(int i =0; i<ageArray.length; i++) {
			ageArray[i]= i*10;
			System.out.println(ageArray[i]);
		}
//		for(int age : ageArray) {
//			System.out.println(age);
//		}
	}
}
