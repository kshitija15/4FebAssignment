package javapracticequestions;
//Question6
//Display Transpose of a Matrix
import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
          int i,j;
          System.out.println("Enter number of rows and columns:");
          Scanner s=new Scanner(System.in);
          int r=s.nextInt();
          int c=s.nextInt();
          int arr[][]=new int[r][c];
          System.out.println("Matrix:");
          for(i=0;i<r;i++) {
        	  for(j=0;j<c;j++) {
        		  arr[i][j]=s.nextInt();
        		  
        	  }
          }
          System.out.println("Matrix before Transpose:");
          for(i=0;i<r;i++) {
        	  for(j=0;j<c;j++) {
                   System.out.print(arr[i][j] + " ");        		  
        	  }
        	  System.out.println(" ");
          }
          System.out.println("Matrix after Transpose:");
          for(i=0;i<r;i++) {
        	  for(j=0;j<c;j++) {
                   System.out.print(arr[j][i] + " ");        		  
        	  }
        	  System.out.println(" ");
          }
          
	}

}
