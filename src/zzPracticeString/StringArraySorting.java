package zzPracticeString;

import java.util.Arrays;

public class StringArraySorting {
	
	public static void main(String[] args) {
		
		String [] a=new String[5];
		
		  a[0]="rahul";
		  a[1]="aman";
		  a[2]="mohan";
		  a[3]="jaguu";
		  a[4]="zebra";
		
			Arrays.sort(a);
			
			for(String aa:a) 
			{
				System.out.println(aa);
			}
	}

}
