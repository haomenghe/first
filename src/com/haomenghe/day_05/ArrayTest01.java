package com.haomenghe.day_05;

//1¡¢Êı×é±éÀú

public class ArrayTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,3,4,56,7};
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				System.out.println(arr[i]);
			}else{
				System.out.print(arr[i] + ", ");
			}
			
		}

	}

}
