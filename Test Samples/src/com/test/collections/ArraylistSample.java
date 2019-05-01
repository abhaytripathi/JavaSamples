/**
 * 
 */
package com.test.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ABHAY
 *
 */
public class ArraylistSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		method1();
	}
	
	/**
	 * Static method to enter the values and print the same.
	 */
	public static void method1() {
		List<String> data = new ArrayList<>();
		data.add("A");
		data.add("B");
		method2(data);
		data.add("E");
		
		for(String text : data) {
			System.out.println(text);
		}
	}
	
	/**
	 * New method with argument as the original arraylist and add further new values
	 * @param data1 - original arraylist
	 */
	public static void method2(List<String> data1) {
		data1.add("C");
		
		data1 = new ArrayList<>();
		data1.add("D");
	}

}
