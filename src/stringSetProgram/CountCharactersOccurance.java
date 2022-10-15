 package stringSetProgram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharactersOccurance {
	public static void main(String[] args) {
		
		String s = "communittee";
		
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
			System.out.println("Character "+kv.getKey()+" is available "+kv.getValue()+" times");
		}
  }
}
