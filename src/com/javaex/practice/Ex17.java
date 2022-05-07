package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		
		double r3 = radius*radius*radius;
		
		System.out.println("구의 부피는: "+(4.0/3.0*3.14*r3)+"입니다.");
		
		sc.close();
		
	}


}
