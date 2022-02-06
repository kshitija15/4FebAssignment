package javapracticequestions;

import java.util.Scanner;

//Question4
//Check if it is a Spy Number
public class SpyNumber {
	
    
    
	public static void main(String[] args) {
		int product=1,sum=0,n;
	    Scanner s= new Scanner(System.in);
	    int number=s.nextInt();
	    while(number>0) {
	    	n=number%10;
	    	sum=sum+n;
	    	product=product*n;
	    	number=number/10;
	    }
	    if(sum==product) 
	    	System.out.println("The number is a Spy Number");
	    	
	    else
	    	System.out.println("The Number is not a Spy Nmuber");
	    	

	}

}
