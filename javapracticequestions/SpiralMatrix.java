package javapracticequestions;

import java.util.Scanner;

public class SpiralMatrixNew {

	public static void main(String[] args) {
	int i,j;
		
	System.out.println("Enter the value of n:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int minRow=0;
        int minCol=0;
        int maxRow=n-1;
        int maxCol=n-1;
        int currentNumber=1;
        
        int [][] matrix=new int [n][n];
        
        while(minRow<=maxRow && minCol<=maxCol) {
        	
        	//left to right
        	for( i = minRow , j = minCol; j <= maxCol; j++) {
                
        		matrix[i][j]=currentNumber;
        		currentNumber++;
        		}
        	minRow++;
        	    
        	//top to bottom
        	for(i = minRow,j = maxCol; i <= maxRow; i++) {
                
        		matrix[i][j]=currentNumber;
        		currentNumber++;
        		}
        	maxCol--;
        	
        	//right to left
        	for(i = maxRow,j = maxCol; j >= minCol; j--) {
                
        		matrix[i][j]=currentNumber;
        		currentNumber++;
        	}
        	maxRow--;
        	
        	//bottom to top
        	for(i = maxRow, j = minCol; i >= minRow; i--) {
        		matrix[i][j]=currentNumber;
        		currentNumber++;
        	}
        	minCol++;
        		
        }
        
        for(i = 0; i <n; i++) {
        	for(j = 0; j<n; j++) {
                
        		System.out.print( matrix[i][j] + " ");

        	}
        	System.out.println(" ");
        }
	}

}
