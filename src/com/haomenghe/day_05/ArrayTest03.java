package com.haomenghe.day_05;

//3¡¢Êı×éÔªËØÄæĞò

public class ArrayTest03 {

	public static void main(String[] args) {
		int[] arr = {12,34,62,54,36,333};
		int temp = 0;
		for (int i = 0; i < arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1-i] ;
			arr[arr.length-1-i]  =temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
