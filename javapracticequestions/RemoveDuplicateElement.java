package javapracticequestions;

import java.util.Scanner;

//Question3
// remove duplicate element in an Array

public class RemoveDuplicateElement {
	
    public static int removeDuplicateElement(int arr[],int n) {
    	int j=0;
    	for(int i=0;i<n-1;i++) {
    		if(arr[i]!=arr[i+1]) {
    			arr[j++]=arr[i];
    		}
    		
    	}
    	arr[j++]=arr[n-1];
    	return j;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number:");
		int number=s.nextInt();
		int arr[]=new int[number];
		for(int i=0;i<number;i++) {
			arr[i]=s.nextInt();
			
		}
		int len=removeDuplicateElement(arr,number);
		System.out.println("after removing duplicate elements:");

		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
