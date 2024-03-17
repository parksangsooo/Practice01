package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// TODO 동전 별 개수를 입력받아 총금액을 계산하는 프로그램을 작성.
		
		Scanner scan = new Scanner(System.in);
		
		int a = 500;
		int b = 100;
		int c = 50;
		int d = 10;
		
		// 동전별 개수 입력받기
		System.out.print("500원 개수: ");
		int _500 = scan.nextInt();
		
		System.out.print("100원 개수: ");
		int _100 = scan.nextInt();
		
		System.out.print("50원 개수: ");
		int _50 = scan.nextInt();
		
		System.out.print("10원 개수: ");
		int _10 = scan.nextInt();
		
		int sum = (_500 * a) + (_100*b) + (_50*c) + (_10*d);
		
		System.out.println("동전의 총합은 " + sum + " 원 입니다.");
		scan.close();

	}

}
