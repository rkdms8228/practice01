package com.javaex.practice;

public class Ex07 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i%2; //postfix에서 prefix로 바뀜
		
		System.out.println(i); //11
		System.out.println(n); //1
	}


}
