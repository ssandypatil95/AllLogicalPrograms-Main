package arraysdiscussion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySortingWithMethod1 {
	
	public static void main(String[] args) {
		
	  int [] a = new int [5];
	  
	  a[0]=20;
	  a[1]=10;
	  a[2]=5;
	  a[3]=90;
	  a[4]=300;
	  
	  Arrays.sort(a);                                //--------------By using this method we are sorting Array(this is direct method for sorting Array)
	  
	  System.out.println(a[a.length-2]);
		
	}
}
