package com.haomenghe.day_03;

import java.util.Scanner;

//5������¼���·ݵ�ֵ�������Ӧ�ļ���  ��if����esle���
/*
 * 12-2��Ϊ������3-5��Ϊ������6-8��Ϊ�ļ���9-11��Ϊ�＾��       
 * 
 * */
public class ScannerTest05 {
		public static void  main(String[]  args){
			
			Scanner sc =  new Scanner(System.in);
			System.out.print("������Ҫ��ѯ���·ݣ�1-12�£� ��" );
			
			int month = sc.nextInt();
			
			if(month <=2 || month==12){
				System.out.println("������");
			}else if(month >=3 && month <=5){
				System.out.println("������");
			}else if(month >=6 && month <=8){
				System.out.println("�ļ���");
			}else if(month >=9 && month <=11){
				System.out.println("�＾��");
			}else {
				System.out.println("��������·��������������룡");
			}
			
			
		}
}
