package com.haomenghe.day_05;

import java.util.Scanner;

//4������¼���������ݣ����ؽϴ�ֵ

public class FuncationTest04 {
	public static void main(String[] args){
		//����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();
		System.out.println("������ڶ������ݣ� ");
		int b = sc.nextInt();
		System.out.println("��������������ݣ� ");
		int c = sc.nextInt();
		
		System.out.println("�����������ֵ�� �� " + getMax(a, b, c));
	}
	
	//��������ֵ�����ֵ
	
	public static int getMax(int a, int b, int c){
		
		int temp = ((a>b) ? a : b);
		int max = ((temp>c) ? temp : c);
		
		return max;
	}
}
