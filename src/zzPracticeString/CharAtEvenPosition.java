package zzPracticeString;

public class CharAtEvenPosition {
	public static void main(String[] args) {
		
		String s = "Laddakh";
		
		for(int i=0; i<s.length(); i++) 
		{
			if(i%2==0) 
			{
				char c = s.charAt(i);
				System.out.println("At "+i+"th position char is :"+c);
			}
		}
	}
}
