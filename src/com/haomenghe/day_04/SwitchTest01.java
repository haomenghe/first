package com.haomenghe.day_04;

import java.util.Scanner;

//1������¼������1-7��Ȼ����ʾ��Ӧ������

public class SwitchTest01 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ֵ��1-7���� ");
		
		int day = sc.nextInt();
		
		switch (day){
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default :
				System.out.println("������������������������룡");
				break;
		}
		
	}
}
