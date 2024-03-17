package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//너비, 높이 입력받기
		//둘레 공식, 넓이 공식
		// 출력
		
		Scanner scan = new Scanner(System.in);
		double width, high, area, per;
		System.out.print("너비를 입력하세요: ");
		width = scan.nextDouble();
		System.out.print("높이를 입력하세요: ");
		high = scan.nextDouble();
		area = width * high;
		per = (width + high)*2;
		System.out.println("사각형의 둘레는 " + area + "\n사각형의 넓이는 " + per);
		scan.close();

	}

}
