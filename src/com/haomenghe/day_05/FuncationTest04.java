package com.haomenghe.day_05;

import java.util.Scanner;

//4、键盘录入三个数据，返回较大值

public class FuncationTest04 {
	public static void main(String[] args){
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据： ");
		int b = sc.nextInt();
		System.out.println("请输入第三个数据： ");
		int c = sc.nextInt();
		
		System.out.println("三个数的最大值是 ： " + getMax(a, b, c));
	}
	
	//求三个数值的最大值
	
	public static int getMax(int a, int b, int c){
		
		int temp = ((a>b) ? a : b);
		int max = ((temp>c) ? temp : c);
		
		return max;
	}
}
