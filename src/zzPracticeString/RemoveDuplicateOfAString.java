package zzPracticeString;

import java.util.LinkedHashSet;

public class RemoveDuplicateOfAString {
	public static void main(String[] args) {
		
		String s = "abcdefabcdef";
		String unistr="";
		
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(!hs.contains(c))
			{
				hs.add(c);
				unistr=unistr+c;
			}
		}
				System.out.println(unistr);
		
	}
}
