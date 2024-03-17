package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {
		// long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요. 
		// (단 빛의 속도는 300000 km/s 로 계산한다) 
		
		 // 빛의 속도 km/s
		long lightSpeed = 300000;
		
		 // 1년의 초
        long secondsPerYear = 365 * 24 * 60 * 60;
                        
        long distance = lightSpeed * secondsPerYear;
        
        System.out.println("빛이 1년 동안 가는 거리는 " + distance + " km 입니다.");

	}

}
