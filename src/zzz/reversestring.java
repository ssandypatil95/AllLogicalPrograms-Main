package zzz;

public class reversestring {
	public static void main(String[] args) {
		
		String s="RAHUL RAJURKAR";
		
		for(int i=s.length()-1; i>=0; i--) 
		{
			char c = s.charAt(i);
			System.out.print(c);
		}
		
	}

}
