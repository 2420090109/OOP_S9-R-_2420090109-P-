package mypack;

import java.util.Scanner;

public class dynamic_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to print elements with static values
		// program to read elements and print them on console
		System.out.println("Enter size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elemnts");
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
		
	}
	System.out.println("Array Elements are: ");
	for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	}

	}

}
