package com.haomenghe.day_03;

import java.util.Scanner;

//2������¼���������ݣ���ȡ���������е����ֵ


public class ScannerTest02 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ�����ݣ� ");
		int a = sc.nextInt();
		System.out.print("������ڶ������ݣ� ");
		int b = sc.nextInt();
		
		System.out.println("�����������ֵ�ǣ� " + (a>b?a:b) );
	}
}
