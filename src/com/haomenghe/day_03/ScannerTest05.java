package com.haomenghe.day_03;

import java.util.Scanner;

//5、键盘录入月份的值，输出相应的季节  用if。。esle完成
/*
 * 12-2月为冬季，3-5月为春季，6-8月为夏季，9-11月为秋季。       
 * 
 * */
public class ScannerTest05 {
		public static void  main(String[]  args){
			
			Scanner sc =  new Scanner(System.in);
			System.out.print("请输入要查询的月份（1-12月） ：" );
			
			int month = sc.nextInt();
			
			if(month <=2 || month==12){
				System.out.println("冬季！");
			}else if(month >=3 && month <=5){
				System.out.println("春季！");
			}else if(month >=6 && month <=8){
				System.out.println("夏季！");
			}else if(month >=9 && month <=11){
				System.out.println("秋季！");
			}else {
				System.out.println("你输入的月份有误，请重新输入！");
			}
			
			
		}
}
