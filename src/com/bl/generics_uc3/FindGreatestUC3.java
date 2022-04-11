package com.bl.generics_uc3;

public abstract class FindGreatestUC3<E> implements Comparable<E>{
	
	public static <E extends Comparable<E>> E findGreatest(E num1, E num2, E num3)
	{ 
		System.out.println("The numbers are : " + num1 + ",  "+ num2 + ",   " + num3);
		E max = num1;
		if (max.compareTo(num2) < 0) {
			max = num2;
		}
		if (max.compareTo(num3) < 0) {
			max = num3;
		}
		//System.out.println(max);
		return max;
	}	
	
	public static void main(String[] args) {
		double num1 = Math.random()*1000;
		double num2 = Math.random()*1000;
		double num3 = Math.random()*1000;
		double doubleMax = FindGreatestUC3.findGreatest(num1,num2, num3);
		System.out.println("Greatest number of double type is : " + doubleMax);
		System.out.println();
		
		int num4 = (int)( Math.random()*1000);
		int num5 =   (int)( Math.random()*1000);
		int num6 =  (int)( Math.random()*1000);
		int intMax= FindGreatestUC3.findGreatest(num4,num5,num6);
		System.out.println("Greatest number of int type is : " + intMax);
		System.out.println();
		
		String name1 = "hello";
		String name2 =   "how are you";
		String name3 =  "m fine!!";
		String stringMax = FindGreatestUC3.findGreatest(name1, name2, name3);
		System.out.println("Greatest number of String type is : " + stringMax);
	}
}

	