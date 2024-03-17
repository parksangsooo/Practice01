package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double f=80.0;
		System.out.println((float)5/9*(f-32.0));
		
		// 결과값이 0이 나오는 이유는 5/9 연산이 정수 나눗셈으로 수행되기 때문. 
		// 자바에서 두 정수 사이의 나눗셈은 결과도 정수로 반환되며, 이 경우 소수점 이하의 값은 버려집니다.
		// 따라서 5/9는 0으로 계산되고, 그 결과 어떤 수를 곱해도 결과는 0이 됩니다.
		
	}

}
