package com.yedam.object;

public class MethodTest {

	public static void main(String[] args) {
		//StringUtil su = new StringUtil();	//다른 거랑 연결
		StringUtil.greet();
		Integer.parseInt("50");
		
		StringUtil.greet("goodmorning");
		
		long l = StringUtil.greetLength("goodmorning");
		System.out.println(l);
	}

}
