package com.sortinterface;

public class SelectionSort implements Sorting{

	@Override
	public void sort(int[] arr) {
		int length=arr.length;
		for (int i = 0; i < length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
		System.out.println("Selection sort: ");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
