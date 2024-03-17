package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// 월급 입력받기
		// 월급 공식
		// 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요 : ");
		int pay;
		pay = scan.nextInt();
		int i = (pay*12)*10; 
		
		System.out.println("10년동안 최대 저축액은 " + i + "원 입니다.");
		
		scan.close();		
		

	}

}
