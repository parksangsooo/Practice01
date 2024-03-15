package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		// 다음 중 결과값이 다른 것을 선택하고 이유를 설명해 보세요.
		
		System.out.println(13/5); // 2
		System.out.println((double)13/5); 
		System.out.println(13/(double)5);
		System.out.println((double)13/(double)5);
		System.out.println(13.0/5);
		System.out.println(13/5.0);
		System.out.println((double)(13/5));// 2
//		
//		1번 항목(13/5)에서는 정수 나눗셈이 수행되어 소수점 이하는 버려지고 결과는 2가 됩니다.
//		8번 항목((double)(13/5))에서는 나눗셈 연산이 먼저 수행되어 2가 되고, 
//		이후에 이 결과가 double형으로 캐스팅되어 2.0이 됩니다. 
//		결과적으로, 나머지 실수 나눗셈을 수행한 경우와는 달리, 
//		이 경우에는 정수 나눗셈의 결과를 실수로 변환한 값이기 때문에 결과 형태가 다릅니다.
	}

}
