package stringSetProgram;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class RemoveDuplicateCharAndPrintCharCount {
	public static void main(String[] args) {
		
		String s = "abcdefabcdef";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) 
		{
			if(hm.containsKey(s.charAt(i))) 
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}		
		System.out.println(hm);
		
		Set<Entry<Character, Integer>> value = hm.entrySet();
		for(Entry<Character, Integer> kv:value) 
		{
			System.out.println(kv.getKey()+" "+kv.getValue());
		}
  }

	
}
