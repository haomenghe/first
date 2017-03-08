package com.haomenghe.day_03;

import java.util.Scanner;

//4、键盘录入两个数据，比较两个数值是否相等

public class ScannerTest04 {
		public static void main(String[]  args){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("请输入第一个数据 ： ");
			int a = sc.nextInt();
			
			System.out.print("请输入第二个数据 ： ");
			int b = sc.nextInt();
			
			System.out.println( a==b ? "两个数相等" : "两个数不相等");
			
		}
}
