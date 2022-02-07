package javapracticequestions;

import java.util.Scanner;

//Question 9
//Given a number N. Find the minimum number of operations required to reach N starting from 0. 
//You have 2 operations available:
//Double the number
//Add one to the number

// Input:
// N = 8
// Output: 4
// Explanation: 0 + 1 = 1, 1 + 1 = 2,
// 2 * 2 = 4, 4 * 2 = 8

public class MinimumOperations {

	public int minimumOperation(int number) {
		int result=0;
		while(number>0) {
			if(number%2==0)
			{
				number=number/2;
				result++;
			}
			else
			{
				number=number-1;
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        MinimumOperations minimumoperations=new MinimumOperations();
        System.out.println(minimumoperations.minimumOperation(num));
	}

}
