package com.haomenghe.day_03;

import java.util.Scanner;

//  3、键盘录入三个数据，获取这三个数据中的最大值


public class ScannerTest03 {
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("请输入第一个数据 ： ");
			int a = sc.nextInt();
			
			System.out.print("请输入第二个数据 ： ");
			int b = sc.nextInt();
			
			System.out.print("请输入第三个数据 ： ");
			int c = sc.nextInt();
			//int max = ((a>b?a:b)>c?(a>b?a:b):c);
			System.out.println("这三个数中的最大值是 ：" + ((a>b?a:b)>c?(a>b?a:b):c) );
			
			
		}
}
