package com.haomenghe.day_03;

import java.util.Scanner;


//1、键盘录入两个数据，并对这两个数据求和，输出最后的结果



public class ScannerTest01 {
		public static void main(String[] args){
			
			Scanner scanner = new  Scanner(System.in);
			System.out.print("请输入第一个数据： ");
			int a = scanner.nextInt();
			System.out.print("请输入第二个数据： ");
			int b = scanner.nextInt();
			System.out.println("你输入的第一个数据是：" + a);
			System.out.println("你输入的第二个数据是：" + b);
			
			System.out.println("两个数据的和为： " + (a+b) );
		}
}
