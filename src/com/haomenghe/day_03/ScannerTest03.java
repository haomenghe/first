package com.haomenghe.day_03;

import java.util.Scanner;

//  3������¼���������ݣ���ȡ�����������е����ֵ


public class ScannerTest03 {
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�������һ������ �� ");
			int a = sc.nextInt();
			
			System.out.print("������ڶ������� �� ");
			int b = sc.nextInt();
			
			System.out.print("��������������� �� ");
			int c = sc.nextInt();
			//int max = ((a>b?a:b)>c?(a>b?a:b):c);
			System.out.println("���������е����ֵ�� ��" + ((a>b?a:b)>c?(a>b?a:b):c) );
			
			
		}
}
