package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 사용자로부터 구의 반지름을 입력 받아 구의 부피를 계산하는 프로그램을 작성하세요. 
		Scanner scanner = new Scanner(System.in);
        
        // 원주율 π의 값
        final double PI = 3.14;
        
        // 사용자로부터 구의 반지름 입력받기
        System.out.print("반지름: ");
        double radius = scanner.nextDouble();
        
        // 구의 부피 계산
        double volume = ((4.0 / 3) * PI * radius * radius * radius);
        
        // 결과 출력
        System.out.println("구의 부피는 " + volume + " 입니다.");
        
        scanner.close();

	}

}
