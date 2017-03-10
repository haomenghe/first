package com.haomenghe.day_05;

//2、数组获取最值

public class ArrayTest02 {

	public static void main(String[] args) {
		int[] arr = {12,453,65,31,4,753};
		
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>temp){
				temp = arr[i];
			}
		}
		System.out.println("数组中的最大值是： " + temp);
	}

}
