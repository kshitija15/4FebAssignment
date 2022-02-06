package javapracticequestions;

import java.util.Scanner;

//Question7
//find all subsets of string
//number of subsets of string will be n(n+1)/2

public class SubsetOfString {
	static void subsetOfString(String str,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("String : "+str);
		System.out.println("Subsets of above string:");
		
		subsetOfString(str,str.length());
		
		

	}

}
