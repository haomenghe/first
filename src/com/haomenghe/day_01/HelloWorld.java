package com.haomenghe.day_01;

public class HelloWorld {
	
	public static void main(String[] args){
		int  a  =  10;
		int  b =   10;
		int  c =  10;
		
		a = b++;    // a=10   b=11   c=10
		c = --a;    // a=9   b=11   c=9
		b = ++a;    // a=10   b=10   c=9
		a = c--;    // a=9   b=10   c=8
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		int x = 4;
		int y = (x++)+(++x)+(x*10); //  70
		
		
		System.out.println(y);
	}
		
}
