package com.haomenghe.day_03;

import java.util.Scanner;

//4������¼���������ݣ��Ƚ�������ֵ�Ƿ����

public class ScannerTest04 {
		public static void main(String[]  args){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�������һ������ �� ");
			int a = sc.nextInt();
			
			System.out.print("������ڶ������� �� ");
			int b = sc.nextInt();
			
			System.out.println( a==b ? "���������" : "�����������");
			
		}
}
