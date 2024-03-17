package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 13;
		
		System.out.println((a>13)&&(a>=13)); // false && true = false
		System.out.println((a>13)||(a>=13)); // false || true = true
		System.out.println((a/3 == 4)&&(a%3 == 2)); // true && false = false
		System.out.println((a/3 == 4)||(a%3 == 2)); // true || false = true
		System.out.println((a/3 == 4)&&(a%3==2)||(a/3==4));	// true && false || true = true
		

	}

}
