package com.haomenghe.day_05;

//4����ȡ����Ԫ�ص�һ�γ��ֵ�����

public class ArrayTest04 {

	public static void main(String[] args) {
		int[] arr = {23,34,6,3,654,12};
		int index = getIndex( arr, 6);
		System.out.println("������Ԫ��6���ֵ������ǣ� " + index);

	}
	//����ĳ��Ԫ�ص�һ�γ��ֵ�����	
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
