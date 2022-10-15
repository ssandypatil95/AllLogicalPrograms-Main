package zzPracticeString;

public class RemoveDuplicateArray {
	
	public static void main(String[] args) {
		String [] a = {"mohan", "ram", "sandeep", "ram", "pavan", "mohan"};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					
				}
				
			}	
			
		}
		
	}

}
