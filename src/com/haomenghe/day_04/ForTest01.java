package com.haomenghe.day_04;

//1、输出10次helloworld
//2、输出1-10
//3、求出1-10之间的数据之和

public class ForTest01 {
	public static void main(String[] args){
		
		//1、输出10次helloworld
		for (int i = 0; i < 10; i++) {
			System.out.println("HelloWorld");
		}
		
		System.out.println("----------------------");
		
		//2、输出1-10
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("----------------------");
		
		//3、求出1-10之间的数据之和
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
