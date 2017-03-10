package com.haomenghe.day_05;

import java.util.Scanner;

//3、键盘录入两个数据，比较两个数是否相等

public class FuncationTest03 {
	public static void main(String[] args){
		//键盘录入两个数据
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据： ");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据： ");
		int b = sc.nextInt();
		boolean flag = getEqual(a, b);
		if(flag){
			System.out.println("你输入的两个数据相等" );
		}else{
			System.out.println("你输入的两个数据不相等");
		}
	}
	
	
	//比较两个数是否相等
	public static boolean getEqual(int a, int b){
		
		return a==b;
	}
}
