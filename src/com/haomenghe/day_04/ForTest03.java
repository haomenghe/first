package com.haomenghe.day_04;
/*
 * 9���ҹ����ɽ������������壺8848m����������һ���㹻���ֽ�����Ϊ��0.01m��
 *  	���ʣ��۵����ٴΣ��Ϳ��Ա�֤��Ȳ��������������ĸ߶�
 * 
 * 10�����һ���������е�*
 * 
 * 11�����        *
 * 			  **
 * 			  ***
 * 			  ****
 * 			  *****
 * 12����� �žų˷���
 * */
public class ForTest03 {
	public static void main(String[] args){
		//9�������������ϰ
		
		double count = 0;
		double land = 0.01;  //���Ϊ0.01m
		double height = 8848;
		while(land <= height){
			land *= 2;
			count++;
			//System.out.println("���Ϊ�� " + land);
		}
		
		System.out.println(count);
		
		
		System.out.println("----------------");
		
		//10���������е�**
		
		for(int x = 0; x<4; x++){
			for(int y=0; y<5; y++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		/*
		 * 11�����        *
  			  		  **
  			  		  ***
  			  		  ****
  			  		  *****
		 * 
		 * 
		 * */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("----------------");
		//12����� �žų˷���
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" * "+i+" = " + i*j + "\t");
			}
			System.out.println();
		}
	}
}
