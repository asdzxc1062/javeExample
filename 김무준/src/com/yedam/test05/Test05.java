package com.yedam.test05;

import java.util.Scanner;


public class Test05 {
	public static void main(String[] args) {
		
		int dice = 0;
		int[] diceno = null;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.주사위 크기|2.주사위 굴리기|3.결과 보기|4.가장 많이 나온 수|5.종료");
			System.out.println("메뉴>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.println("주사위 크기>");
				
				dice = Integer.parseInt(sc.nextLine());
				
			} else if (selectNo == 2) {
				for(int i=0; i< diceno.length; i++) {	
				}
				System.out.println( "가 나올 때까지 주사위를" + "번 굴렸습니다.");
			} else if (selectNo == 3) {
				
			} else if (selectNo == 4) {
				int max = 0;
				
				System.out.println("가장 많이 나온 수는" + "입니다");
				
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
				
		}
	}
}