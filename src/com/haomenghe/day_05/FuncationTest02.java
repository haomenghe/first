package com.haomenghe.day_05;

import java.util.Scanner;

//2������¼���������ݣ������������Ľϴ�ֵ

public class FuncationTest02 {

	public static void main(String[] args){
		//����¼��
		Scanner sc =  new Scanner(System.in);
		System.out.println("�������һ�����ݣ� ");
		int a = sc.nextInt();
		System.out.println("������ڶ������ݣ� ");
		int b = sc.nextInt();
		
		System.out.println("����������������ֵ�ǣ� " + getMax(a, b));
		
		
		
	}
	//�������������ֵ
	public static int getMax(int a, int b){
		return (a>b?a:b);
	}
}
