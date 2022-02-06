package javapracticequestions;

import java.util.Scanner;

// Question2
// Check if a Given Number is Perfect Square
public class PerfectSqaure {

	static boolean perfectSquare(double number) {
		double squareroot=Math.sqrt(number);
		return ((squareroot-Math.floor(squareroot)==0));
		
	}
	public static void main(String[] args) {
      
		Scanner s=new Scanner(System.in);
		double number=s.nextDouble();
		
		if(perfectSquare(number)) 
			
		System.out.println("yes, perfect square");
			
		else
			
		System.out.println("no,not a perfect square");
		
	}

}
