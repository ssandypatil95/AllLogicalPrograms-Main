package zzzzzzzzzzzztrypractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//Given a string s, find the length of the longest substring without repeating characters.
//
//Example 1:
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

public class New {
	public static void main(String[] args) {
		
	
	
String	s = "abcabcbb";

HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

for(int i=0; i<s.length(); i++) 
{
	char c=s.charAt(i);
	if(hm.containsKey(c))
	{
		hm.put(c, hm.get(c)+1);
	}
	else 
	{
		hm.put(c,1);
	}
//	System.out.println(hm);
}
    Set<Entry<Character, Integer>> value = hm.entrySet();
    
    for(Entry<Character, Integer> kv:value) 
    {
  //  	System.out.println(kv.getKey();
    	
    	int a = kv.getValue();
    	
    	int d=hm.size();
    	
    	
    	System.out.println(d);
    }
         


 }

}
