package com.haomenghe.day_04;
/*
 * 
 * 4�����1-100֮���ż����
 * 5�����1-100֮���������
 * 6�����5�Ľ׳�
 * 7��������е�ˮ�ɻ���
 * 8��ͳ��ˮ�ɻ����ж��ٸ�
 * 
 * */
public class ForTest02 {
	public static void main(String[] args){
		//4�����1-100֮���ż����
		
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0){
				sum1 += i;
			}
		}
		System.out.println(sum1);
		System.out.println("----------------------");
		
		//5�����1-100֮���������
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0){
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		System.out.println("----------------------");
		//6�����5�Ľ׳�
		
		int jc = 1;
		for(int i=1; i<=5;i++){
			jc*=i;
		}
		System.out.println(jc);
		System.out.println("----------------------");
		
		//7��������е�ˮ�ɻ���
		
		for(int i=100; i<1000; i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			if(i == ge*ge*ge+shi*shi*shi+bai*bai*bai){
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------");
		//8��ͳ��ˮ�ɻ����ж��ٸ�
		int count = 0;
		for(int i=100; i<1000; i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			if(i == ge*ge*ge+shi*shi*shi+bai*bai*bai){
				count++;
			}
		}
		System.out.println(count);
	}
}
