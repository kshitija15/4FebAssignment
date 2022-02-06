package javapracticequestions;

import java.util.Scanner;

//Question5
//find the nth prime number

public class NthPrimeNumber {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the value of n:");
      int number=s.nextInt();
      int n=1,c=0,i;
      while(c<number) {
    	  n=n+1;
    	  for( i=2;i<=n;i++) {
    		  if(n%i==0) 
    			  break;
    	  }
    		  if(i==n)
    			  c=c+1;
    		   
    	  }
    	  
    	  
      
	  System.out.println(number +"th prime is :" +n);

	}

}
