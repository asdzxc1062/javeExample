package com.yedam.test04;

public class Test04 {
	public static void main(String[] args) {

		for (int i=1; i<=9; i++) {
			for (int j = 1; j<=9; j++) {
				if (j>i) {
					break;
				}
				System.out.println(i+ "X" +j+ "=" +i*j);
			}
			System.out.println();
		}
	}
}