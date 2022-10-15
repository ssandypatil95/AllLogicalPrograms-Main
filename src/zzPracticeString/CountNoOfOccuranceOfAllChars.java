package zzPracticeString;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountNoOfOccuranceOfAllChars {
	public static void main(String[] args) {
		
		String s = "communittee";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(hm.containsKey(c)) 
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
		Set<Entry<Character, Integer>> value = hm.entrySet();
		for(Entry<Character, Integer> kv:value) 
		{
			System.out.println(kv.getKey()+"="+kv.getValue());
		}

	}
}
