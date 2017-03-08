package com.haomenghe.day_04;
/*
 * 
 * 4、求出1-100之间的偶数和
 * 5、求出1-100之间的奇数和
 * 6、求出5的阶乘
 * 7、求出所有的水仙花数
 * 8、统计水仙花数有多少个
 * 
 * */
public class ForTest02 {
	public static void main(String[] args){
		//4、求出1-100之间的偶数和
		
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0){
				sum1 += i;
			}
		}
		System.out.println(sum1);
		System.out.println("----------------------");
		
		//5、求出1-100之间的奇数和
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 != 0){
				sum2 += i;
			}
		}
		System.out.println(sum2);
		
		System.out.println("----------------------");
		//6、求出5的阶乘
		
		int jc = 1;
		for(int i=1; i<=5;i++){
			jc*=i;
		}
		System.out.println(jc);
		System.out.println("----------------------");
		
		//7、求出所有的水仙花数
		
		for(int i=100; i<1000; i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			if(i == ge*ge*ge+shi*shi*shi+bai*bai*bai){
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------");
		//8、统计水仙花数有多少个
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
