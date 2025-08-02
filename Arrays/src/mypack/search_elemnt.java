package mypack;

import java.util.Scanner;

public class search_elemnt {
	public static void main(String[] args) {
		//program to search for an element among given elements
		System.out.println("Enter size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elemnts");
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
		
	}
	System.out.println("Enter target element to search: ");
	int target = sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		if(arr[i] == target) {
			System.out.println("Target element " + arr[i]  + " found at " + i + " position");
		}
	}
	
	}

}
