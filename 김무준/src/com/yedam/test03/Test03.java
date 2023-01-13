package com.yedam.test03;

public class Test03 {
	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		coinUnit[0] = 500;
		coinUnit[1] = 100;
		coinUnit[2] = 50;
		coinUnit[3] = 10;
		int money = 2680;
		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {
			
		    System.out.println(coinUnit[i]+"원: "+ money / coinUnit[i]);
	        money%= coinUnit[i];
		}

}
}
