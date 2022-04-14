package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		long five = sc.nextLong();
		
		System.out.print("100원 개수: ");
		long one = sc.nextLong();
		
		System.out.print("50원 개수: ");
		long fifty = sc.nextLong();
		
		System.out.print("10원 개수: ");
		long ten = sc.nextLong();
		
		System.out.println("동전의 총합은 "+(five*500+one*100+fifty*50+ten*10)+"원 입니다.");

		sc.close();
	}


}
