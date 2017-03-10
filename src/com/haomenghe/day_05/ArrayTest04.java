package com.haomenghe.day_05;

//4、索取数组元素第一次出现的索引

public class ArrayTest04 {

	public static void main(String[] args) {
		int[] arr = {23,34,6,3,654,12};
		int index = getIndex( arr, 6);
		System.out.println("数组中元素6出现的索引是： " + index);

	}
	//数组某个元素第一次出现的索引	
	public static int getIndex(int[] arr, int value){
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == value){
				index = i;
				break;
			}
		}
		
		return index;
	}

}
