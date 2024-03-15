package com.javaex.practice;

public class Ex14 {

	public static void main(String[] args) {
		// 아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요
		int a = 5;
		
		System.out.println(a); // a의 현재 값인 5가 출력됩니다.
		System.out.println(++a); // a의 값을 먼저 1 증가시킨 후 (a가 6이 됨), a의 값을 출력합니다. 결과는 6입니다. 
		System.out.println(a); // a의 현재 값인 6이 출력됩니다.
		System.out.println(a++); // a의 현재 값을 출력한 후 (6 출력), a의 값을 1 증가시킵니다 (a가 7이 됨). 출력 결과는 증가 전의 6입니다.
		System.out.println(a); // a의 현재 값인 7이 출력됩니다.
		System.out.println(--a); // a의 값을 먼저 1 감소시킨 후 (a가 6이 됨), a의 값을 출력합니다. 결과는 6입니다.
		System.out.println(a); // a의 현재 값인 6이 출력됩니다.
		System.out.println(a--); // a의 현재 값을 출력한 후 (6 출력), a의 값을 1 감소시킵니다 (a가 5가 됨). 출력 결과는 감소 전의 6입니다.
		System.out.println(a); //  a의 현재 값인 5가 출력됩니다.
		

	}

}
