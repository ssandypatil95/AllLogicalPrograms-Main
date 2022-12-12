package zzPracticeArray;

public class DuplicateElementFromArray {
	public static void main(String[] args) {
		
		int [] a = {2, 1, 2, 5, 1};
		
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
		
//        String [] s = {"ram", "sham", "dam", "dam", "sham"};
//		
//		for(int i=0; i<s.length; i++) 
//		{
//			for(int j=i+1; j<s.length; j++) 
//			{
//				if(s[i]==s[j]) 
//				{
//					System.out.println(s[i]);
//				}
//			}
//		}		
	}
}
