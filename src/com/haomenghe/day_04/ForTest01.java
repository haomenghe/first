package com.haomenghe.day_04;

//1�����10��helloworld
//2�����1-10
//3�����1-10֮�������֮��

public class ForTest01 {
	public static void main(String[] args){
		
		//1�����10��helloworld
		for (int i = 0; i < 10; i++) {
			System.out.println("HelloWorld");
		}
		
		System.out.println("----------------------");
		
		//2�����1-10
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("----------------------");
		
		//3�����1-10֮�������֮��
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
