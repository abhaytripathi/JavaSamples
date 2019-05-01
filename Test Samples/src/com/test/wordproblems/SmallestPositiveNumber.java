/**
 * 
 */
package com.test.wordproblems;

import java.util.HashSet;

/**
 * @author ABHAY
 *
 */
public class SmallestPositiveNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solutionUsingHashSet(new int[] {1, 2, 3}));
		
		System.out.println(solutionUsingSorting(new int[] {1, 2, 3}));

	}
	
	public static int solutionUsingHashSet(int[] a) {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        int smallInt = 1;
        for (int i = 0 ; i < a.length; i++) {
            hashSet.add(a[i]);                     
        }
        
        while (hashSet.contains(smallInt)) {
             smallInt++;
        }
        return smallInt;
    }
	
	public static int solutionUsingSorting(int A[]) {
        // write your code in Java SE 8
        if(A.length == 0) {
        	return 1;
        }
        
        int temp;
        // Sort the array of integers
        for(int i = 0; i < A.length ; i++) {
        	for(int j = i+1; j < A.length; j++) {
        		if(A[i] > A[j]) {
        			temp = A[i];
        			A[i] = A[j];
        			A[j] = temp;
        		}
        	}
        }
        
        for(int i = 0 ; i < A.length; i++) {
        	int x = Math.abs(A[i]);
        	if((x - 1 < A.length) && (A[x - 1] > 0)) {
        		A[x - 1] = -A[x - 1];
        	}
        }
        
        for(int i = 0; i < A.length; i++) {
        	if(A[i] > 0) {
        		return i+1;
        	}
        }
        return A.length + 1;
    }
}
