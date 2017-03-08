package com.haomenghe.day_04;

import java.util.Scanner;

//1、键盘录入输入1-7，然后显示对应的星期

public class SwitchTest01 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数值（1-7）： ");
		
		int day = sc.nextInt();
		
		switch (day){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default :
				System.out.println("你输入的数据有误，请重新输入！");
				break;
		}
		
	}
}
