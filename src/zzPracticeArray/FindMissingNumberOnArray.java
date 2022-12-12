package zzPracticeArray;

import java.util.Arrays;

public class FindMissingNumberOnArray {
   public static void main(String[] args) {
	
	   int [] a= {2,6,5,1,3};
	   
	   Arrays.sort(a);
	   
	   for(int i=0; i<a.length; i++) 
	   {
		   if(a[i]+1==a[i+1]) 
		   {
			   continue;
		   }
		   else 
		   {
			   System.out.println(a[i]+1);
	     	   break;
		   }
	   }
 }
}
