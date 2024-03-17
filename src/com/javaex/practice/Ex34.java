package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 화씨 온도를 입력 받아 섭씨 온도로 변환하는 프로그램을 작성하세요. 
		Scanner scanner = new Scanner(System.in);
				
        // 사용자로부터 화씨 입력받기
        System.out.print("화씨: ");
        double F = scanner.nextDouble();
        
        // 화씨 -> 섭씨 계산
        double volume = (5.0 / 9 * (F -32));
        
        // 결과 출력
        System.out.println("화씨 " + F + " 의 섭씨온도는 " + volume + " 입니다.");
        
        scanner.close();

	}

}
