package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		double b, h, area;
		System.out.print("가로: ");
		b = scan.nextDouble();
		System.out.print("세로: ");
		h = scan.nextDouble();
		area = (b*h)/2;
		System.out.println("삼각형의 넓이는 " + area + " 입니다.");
		scan.close();

	}

}
