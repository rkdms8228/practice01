package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		double cost = sc.nextDouble();
		
		System.out.print("받은돈: ");
		double extra = sc.nextDouble();
		
		System.out.println("==========================");
		
		System.out.println("받은돈: "+extra);
		System.out.println("상품가격: "+cost);
		System.out.println("부가세: "+cost/10);
		System.out.println("잔액: "+(extra-cost));
		
		sc.close();
	}


}
