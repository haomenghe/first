package com.haomenghe.day_04;
/*
 * 9、我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸，厚度为：0.01m，
 *  	请问，折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度
 * 
 * 10、输出一个四行五列的*
 * 
 * 11、输出        *
 * 			  **
 * 			  ***
 * 			  ****
 * 			  *****
 * 12、输出 九九乘法表
 * */
public class ForTest03 {
	public static void main(String[] args){
		//9、珠穆朗玛峰练习
		
		double count = 0;
		double land = 0.01;  //厚度为0.01m
		double height = 8848;
		while(land <= height){
			land *= 2;
			count++;
			//System.out.println("厚度为： " + land);
		}
		
		System.out.println(count);
		
		
		System.out.println("----------------");
		
		//10、四行五列的**
		
		for(int x = 0; x<4; x++){
			for(int y=0; y<5; y++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		/*
		 * 11、输出        *
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
		//12、输出 九九乘法表
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" * "+i+" = " + i*j + "\t");
			}
			System.out.println();
		}
	}
}
