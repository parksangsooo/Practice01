package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO 상품을 구매하면 정가의 10%를 부가세로 부여.
		// 상품가격, 받은돈 입력받기
		// 부가세 계산
		// 잔액까지 출력
		
		Scanner scan = new Scanner(System.in);
		
		double price, money;
		System.out.print("상품가격: ");
		price = scan.nextDouble();
		System.out.print("받은돈: ");
		money = scan.nextDouble();
		
		double tax = price / 10;
		double bal = money - price;
		
		System.out.println("=========================");
		System.out.println("받은돈: " + " " + money);
		System.out.println("상품가격: " + " " + price);
		System.out.println("부가세: " + " " + tax);
		System.out.println("잔액: " + " " + bal);
		
		scan.close();
		
	}

}
