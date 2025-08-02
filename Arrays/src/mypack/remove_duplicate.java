package mypack;

import java.util.Scanner;


public class remove_duplicate {


		    public static void main(String[] args) {
		    	System.out.println("Enter size: ");
				Scanner sc = new Scanner(System.in);
				int size = sc.nextInt();
				int arr[] = new int[size];
				System.out.println("Enter array elemnts");
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
				
			}
		        

		        System.out.println("Unique elements in the array:");

		        for (int i = 0; i < arr.length; i++) {
		            boolean isDuplicate = false;

		           
		            for (int j = 0; j < i; j++) {
		                if (arr[i] == arr[j]) {
		                    isDuplicate = true;
		                    break;
		                }
		            }
		            	//Printing Unique elements
		            if (!isDuplicate) 
		                System.out.print(arr[i] + " ");
		        }		

}
}
