package com.haomenghe.day_05;

import java.util.Scanner;

//2、键盘录入两个数据，返回两个数的较大值

public class FuncationTest02 {

	public static void main(String[] args){
		//键盘录入
		Scanner sc =  new Scanner(System.in);
		System.out.println("请输入第一个数据： ");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据： ");
		int b = sc.nextInt();
		
		System.out.println("输入的两个数的最大值是： " + getMax(a, b));
		
		
		
	}
	//求两个数的最大值
	public static int getMax(int a, int b){
		return (a>b?a:b);
	}
}
