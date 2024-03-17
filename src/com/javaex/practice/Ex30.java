package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 마일을 km로 변환
		// 1 마일 = 1.609km 상수로 지정
		Scanner scanner = new Scanner(System.in);
		
		double m;
		final double m1 = 1.609;
				System.out.print("마일을 입력하세요: ");
		m = scanner.nextInt();
		double km = m * m1;
		
		System.out.println(m + " 마일은 " + km + " 킬로미터 입니다.");
		
		scanner.close();
		

	}

}
