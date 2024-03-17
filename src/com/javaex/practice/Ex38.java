package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		// TODO 총 금액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성
		
		Scanner scanner = new Scanner(System.in);
		
		// 전체 금액 입력받기
		System.out.print("전체금액을 입력해주세요: ");
		int total = scanner.nextInt();
		
		
		// 백원 단위 이하 할인 적용 실제 지불금액 구하기
		int pay = (total / 1000) * 1000;
		
		// 출력
		System.out.println("실제 지불금액은 " + pay + " 입니다.");
		scanner.close();
	}

}
