/**
 * Given a sorted array arr[] of distinct elements which is rotated at some unknown point, 
 * the task is to find the maximum element in it
 * Input: arr[] = {3, 4, 5, 1, 2} 
 * Output: 5
 * Input: arr[] = {1, 2, 3} 
 * Output: 3 
 */
package com.practice.examples;

public class MaximumElementInSortedArray {

	static int findMaxElement(int[] arr, int low, int high) {
		// base case, If there is only one element left
		if (high == low)
			return arr[low];

		int mid = (low + high) / 2;

		// if there are only 2 elements in the array
		if (mid == 0 && arr[mid] > arr[mid + 1])
			return arr[mid];

		if (arr[low] > arr[mid])
			return findMaxElement(arr, low, mid - 1);
		else
			return findMaxElement(arr, mid + 1, high);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 5, 4, 3, 2, 1 };
		int n = arr.length;
		System.out.println(findMaxElement(arr, 0, n - 1));
	}
}
