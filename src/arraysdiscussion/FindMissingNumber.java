package arraysdiscussion;

import java.util.Arrays;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
	int [] a= {2,6,5,1,3};
	
	Arrays.sort(a);
	
	for(int i=0; i<a.length;i++) 
	{
		if(a[i]+1==a[i+1]) 
		{
			continue;
		}
		else
		{
			int missingnumber = a[i]+1;	
			System.out.println(missingnumber);
			
			break;           // if more then one missing no find so we remove break;
		}
	}
	
 }
}
