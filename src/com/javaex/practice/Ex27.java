package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반지름 입력받기
		// 원의 넓이 공식
		// 결과 산출
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		
		double rad, area;
		final double pi = 3.14;
		rad = scan.nextInt();
		area = rad*rad*pi;		
		
		System.out.println("원의 넓이는 " + area);
		
		scan.close();
		

	}

}
