package com.javaex.practice;

public class Ex15 {
	// 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요
	public static void main(String[] args) {
		
		System.out.println(12/5-3); // (12/5 = 2 - 3 = -1)
		System.out.println(5+19%3); // 19%3 = 1, 5 + 1 = 6
		System.out.println(2+2/2); // 2/2 = 1, 2 + 1 = 3
		System.out.println(29%3+29/3); // 29%3 = 2, 29/3 = 9, 2 + 9 = 11
		System.out.println(29%3+18.0/4); // 29%3은 2, 18.0/4는 4.5 (실수 나눗셈), 2+4.5는 6.5
		System.out.println((14+7/2)/4); // 7/2는 3 (정수 나눗셈), 14+3은 17, 17/4는 4 (정수 나눗셈).
		System.out.println((14+7/2.0)/5); // 7/2.0은 3.5 (실수 나눗셈), 14+3.5은 17.5, 17.5/5는 3.5입니다
				
	}

}
