package com.haomenghe.day_03;

import java.util.Scanner;

//2、键盘录入两个数据，获取两个数据中的最大值


public class ScannerTest02 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数据： ");
		int a = sc.nextInt();
		System.out.print("请输入第二个数据： ");
		int b = sc.nextInt();
		
		System.out.println("两个数的最大值是： " + (a>b?a:b) );
	}
}
