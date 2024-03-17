package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =10;
		int n = ++i %2;
		
		System.out.println(i);
		System.out.println(n);
		
		// 전위 연산자로 연산 전에 1이 증가하여 먼저 적용되고, 나머지가 1
        // Ex20 의 경우 후위 연산으로 연산 후에 1이 증가하기 때문에 결과값은 0. 이지만 최종 i의 값은 11.
	}

}
