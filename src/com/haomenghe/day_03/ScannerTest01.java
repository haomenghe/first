package com.haomenghe.day_03;

import java.util.Scanner;


//1������¼���������ݣ�����������������ͣ�������Ľ��



public class ScannerTest01 {
		public static void main(String[] args){
			
			Scanner scanner = new  Scanner(System.in);
			System.out.print("�������һ�����ݣ� ");
			int a = scanner.nextInt();
			System.out.print("������ڶ������ݣ� ");
			int b = scanner.nextInt();
			System.out.println("������ĵ�һ�������ǣ�" + a);
			System.out.println("������ĵڶ��������ǣ�" + b);
			
			System.out.println("�������ݵĺ�Ϊ�� " + (a+b) );
		}
}
