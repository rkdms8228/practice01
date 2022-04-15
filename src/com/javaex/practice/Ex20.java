package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		long fiveH = sc.nextLong();
		
		System.out.print("100원 개수: ");
		long oneH = sc.nextLong();
		
		System.out.print("50원 개수: ");
		long fifty = sc.nextLong();
		
		System.out.print("10원 개수: ");
		long ten = sc.nextLong();
		
		long fiveHW = fiveH*500;
		long oneHW = oneH*100;
		long fiftyW = fifty*50;
		long tenW = ten*10;
		long total = fiveHW+oneHW+fiftyW+tenW;
		
		System.out.println("동전의 총합은 "+total+"원 입니다.");

		sc.close();
	}


}
