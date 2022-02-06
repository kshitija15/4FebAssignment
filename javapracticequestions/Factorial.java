package javapracticequestions;

import java.util.Scanner;

//Question1
//factorial
public class Factorial {
	
      public static int factorial(int n) {
    	  
    	  if(n==0)
    		  return 1;
    	  else
    		  return(n* factorial(n-1));
    	  
    	  
      }
	public static void main(String[] args) {
		int f=1;
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		f=factorial(number);
		System.out.println("Factorial of " +number+":"+f);
		
		
		
		

		
	}


	

}
