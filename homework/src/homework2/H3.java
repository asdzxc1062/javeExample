package homework2;

import java.util.Scanner;

public class H3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. 계산식(하드 코딩) -> 올해만 사용
		//1-1) 2000년 이후 2023년 이전 출생 -> (23-태어난 년도)+1
		//1-2) 1922년 이후 2000년 이전 출생 -> (123-태어난 년도)
		
		System.out.println("생년월일>");
		String birth = sc.nextLine();
		
		int birthNo = Integer.parseInt(birth.substring(0,2));
		
		if(birthNo <= 22) { //2000년 이후 2023년 이전 출생 -> (23-태어난 년도)+1
			System.out.println("나이 : " + (23-birthNo)+1);
		//1922~1999
		} else if(birthNo > 23) { //1922년 이후 2000년 이전 출생 -> (123-태어난 년도)
			System.out.println("나이 : " + (123-birthNo));
		}
		
				//Stringbuilder
				//String 단점 보완
				
				//메모리 5개 사용
				String a = "a";
				a += "a";
				a += "a";
				a += "a";
				a += "a";
				
				//메모리 1개 사용
				StringBuilder sb = new StringBuilder();
				sb.append("aaa"); //"aaa"
				sb.append(11);
				sb.append(false);
				
				System.out.println(sb);
				
				
				
		
//		String a = sc.nextLine();
//		int x= Integer.parseInt(a.substring(0,2));
//		if(x > 23) {
//			System.out.println(122 - x);
//		}else {
//			System.out.println(22 - x);
//		}
		

	}

}
