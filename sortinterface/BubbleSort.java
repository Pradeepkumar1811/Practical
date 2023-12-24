package com.sortinterface;

public class BubbleSort implements Sorting{

	@Override
	public void sort(int []arr) {
		 int length=arr.length; 
		 for (int i = 0; i < length-1; i++) {
	         for (int j = 0; j < length-i-1; j++) {
	              if (arr[j] > arr[j+1]) {
	                  int temp = arr[j];
	                  arr[j] = arr[j+1];
	                  arr[j+1] = temp;
	              }
	          }
	     }
		 System.out.println("Bubble sort: ");
		 for(int i=0;i<length;i++) {
				System.out.print(arr[i]+" ");
		 }
		
	}

}
