package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원화 입력받기
		// 달러환율
		// 원화 달러 변경식
		// 출력
		
		Scanner scanner = new Scanner(System.in);
		
		int won;
		final double dollor = 1230.95;
		System.out.print("환전할 원화를 입력하세요: ");
		won = scanner.nextInt();
		double exchange = won / dollor;
		
		System.out.println("받으실 달러는 " + exchange + "입니다.");
		
		scanner.close();
		

	}

}
