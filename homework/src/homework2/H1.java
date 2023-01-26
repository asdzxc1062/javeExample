package homework2;

import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        
        //String.length -> 문자열 길이
        //String.charAt(위치); -> 위치에 따른 문자 출력
        for(int i = str.length()-1; i>=0; i--) {
        	System.out.print(str.charAt(i));
        }
        
//        char[] arr = str.toCharArray();
//        char[] reversedArr = new char[arr.length];
//        for(int i=0; i<arr.length; i++){
//            reversedArr[arr.length-1-i] = arr[i];
//        }
//
//        String reversedStr = new String(reversedArr);
//        System.out.println(reversedStr);
}
}