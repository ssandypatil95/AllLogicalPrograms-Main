package zzPracticeString;

public class PrintCharAndPosition {
	public static void main(String[] args) {
		String s = "Laddakh";
		
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			System.out.println("At "+i+"th position char is : "+c);
		}
	}

}
