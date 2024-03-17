package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 연필의 개수와 인원수를 입력받아 모든 인원에게 같은 수의 연필을 나눠주기
		// 1인당 연필의 받을 수 있는 연필 개수와 나머지를 구하시오.
		
		Scanner scan = new Scanner(System.in);
				
			// 연필갯수 / 인원수 입력받기
			System.out.print("전체 연필갯수를 입력해주세요.: ");
			int pen = scan.nextInt();
			
			System.out.print("전체 인원수를 입력해 주세요.: ");
			int people = scan.nextInt();
			
			// 인당 연필갯수 / 나머지 연필갯수 구하기				
			int sum = pen / people;
			int bal = pen % people;
			
			// 출력
			System.out.println("1인당 연필의 갯수는 " + sum + " 입니다.");
			System.out.println("연필의 나머지 갯수는 " + bal + " 입니다.");
			scan.close();

	}

}
