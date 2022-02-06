package javapracticequestions;
//Question8
//find min and max in list

import java.util.ArrayList;
import java.util.List;

public class ListMinimumMaximum {
      public static int findMinimum(List<Integer> list) {
    	  int min=Integer.MAX_VALUE;
    	  
    	  for(int i : list) {
    		  if(min>i)
    			  min=i;
    	  }
    	  return min;
      }
      public static int findMaximum(List<Integer> list) {
    	  int max=Integer.MIN_VALUE;
    	  
    	  for(int i : list) {
    		  if(max<i)
    			  max=i;
    	  }
    	  return max;
      }
	public static void main(String[] args) {
		
List<Integer> list=new ArrayList<Integer>();
list.add(25);
list.add(200);
list.add(56);
list.add(78);
System.out.println("Min:" + findMinimum(list));
System.out.println("Min:" + findMaximum(list));

	}

}
