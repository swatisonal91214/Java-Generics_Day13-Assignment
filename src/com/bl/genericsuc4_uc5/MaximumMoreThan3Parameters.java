package com.bl.genericsuc4_uc5;


	import java.util.Arrays;
	import java.util.List;

	public class MaximumMoreThan3Parameters <T extends Comparable<T>> {


		public static <T extends Comparable<T>> T findMax(List<T> arr) {

			T max = arr.get(0);
			for (T key : arr) {
				if (key.compareTo(max) > 0)
					max = key;
			}
			return max;
		}
		//************UC4***********************************
		public static <T extends Comparable<T>> T printMax() {

			System.out.println("The Maximum integer num is : " + findMax(Arrays.asList(4, 7, 8, 9, 44, 55)));
			System.out.println("The Maximum float num is: " + findMax(Arrays.asList(4.9, 7.8, 8.0, 9.6, 44.7, 55.6)));
			System.out.println(
					"The Maximum String  is: " + findMax(Arrays.asList("Hello", "Hi", "Welcome", "GoodBye", "GoodDay")));
			return null;
		}
//*****************************UC5*****************************
		public static void main(String[] args) {
			System.out.println("Printing the Maximum Value");
			printMax();

		}

	}

