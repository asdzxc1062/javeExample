package com.yedam.java.ch01_01;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return super.areaCircle(r);
	}
	
	
}
