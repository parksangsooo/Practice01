package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num01 = 40;
		int num02 = 50;
		int result = (num01++)+(++num02);
		
//		num01++는 후위 증가 연산자이므로, result 계산 시에는 num01의 원래 값인 40이 사용되고, 그 후에 num01의 값이 1 증가하여 41이 됩니다.
//		++num02는 전위 증가 연산자이므로, result 계산 전에 num02의 값이 1 증가하여 51이 되고, 그 값이 result 계산에 사용됩니다.
//		따라서, result = 40 + 51 = 91이 됩니다.
//		최종적으로 num01은 41, num02는 51이 됩니다.
		
		System.out.println(result);
		System.out.println(num01);
		System.out.println(num02);
	}

}
