package zzPracticeString;

public class ReverseTheCompleteSentance {
	public static void main(String[] args) {
		
		String s="This Is Called As Pune";
		
		String[] s1 = s.split(" ");
		
		for(int i=(s1.length-1); i>=0; i--) 
		{
			System.out.println(s1[i]+" ");
		}
	}
}
