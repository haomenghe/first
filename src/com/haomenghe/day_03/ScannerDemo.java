package com.haomenghe.day_03;

import java.util.Scanner;
/*
 * 	1、键盘录入两个数据，并对这两个数据求和，输出最后的结果
 *  2、键盘录入两个数据，获取两个数据中的最大值
 *  3、键盘录入三个数据，获取这三个数据中的最大值
 *  4、键盘录入两个数据，比较两个数值是否相等
 *  5、键盘录入月份的值，输出相应的季节
 * */
public class ScannerDemo {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("你输入的数据是：" + x );
	}
}
