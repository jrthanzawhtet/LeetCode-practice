package com.dsa.practise.array;

public class ArrayUtil {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i ++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i = 0; i < arr.length; i ++) {
			temp[i] = arr[i];
		}	
		return temp;
	}
	
	
	public static void main(String[] args) {
		ArrayUtil arrUtil = new ArrayUtil();
		arrUtil.printArray(new int[] {5,1,2,9,10});
		int[] original = new int[] {5,1,2,9,10};
		System.out.println("The size of original array - " + original.length);
		original = arrUtil.resize(original, 10);
		System.out.println("The size of original after resize - " + original.length);
	}

}
