package com.sortinterface;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=input.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Numbers:");
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		}
		Sorting bubble=new BubbleSort();
		bubble.sort(arr);
		System.out.println();
		Sorting selection=new SelectionSort();
		selection.sort(arr);

	}

}
