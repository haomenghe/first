package com.haomenghe.day_05;

import java.util.Scanner;

//3������¼���������ݣ��Ƚ��������Ƿ����

public class FuncationTest03 {
	public static void main(String[] args){
		//����¼����������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ� ");
		int a = sc.nextInt();
		System.out.println("������ڶ������ݣ� ");
		int b = sc.nextInt();
		boolean flag = getEqual(a, b);
		if(flag){
			System.out.println("������������������" );
		}else{
			System.out.println("��������������ݲ����");
		}
	}
	
	
	//�Ƚ��������Ƿ����
	public static boolean getEqual(int a, int b){
		
		return a==b;
	}
}
