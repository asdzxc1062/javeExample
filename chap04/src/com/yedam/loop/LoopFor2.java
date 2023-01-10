package com.yedam.loop;

public class LoopFor2 {
	public static void main(String[] args) {
		// 중첩 for문
		//for(){
		// for(){
		// }
		//}
		
		// 2단 ~ 9단 출력
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		// 별찍기
		// *****
		// *****
		// *****
		// *****
		// *****
		//한 줄, 한 줄 내려 갈 때 쓰는 반복문
		for(int i=1; i<=5; i++) {
			//별을 찍어주는 반복문
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=5; i>=0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=5; i>=0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
