package zzPracticeString;

public class CountNoOfOccuranceOfAChar {
	
	public static void main(String[] args) {
		
		String s = "PhiPPPladelphiapppp";
		int count=0;
		
//		for(int i=0; i<s.length(); i++) 
//		{
//			char c = s.charAt(i);
//			
//			if(c=='P' || c=='p') 
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++) 
			{
				char c = s.charAt(i);
				
				if(c=='p') 
				{
					count++;
				}
			}
		System.out.println(count);
	}
}
