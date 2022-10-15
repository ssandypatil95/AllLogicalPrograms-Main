package stringSetProgram;

public class RemoveNumberFromString {
	public static void main(String[] args) {
	
	String s = "bjsjdjsajdsaj54s5dsamslkdjsa45dsadsa"; 
	String alphabeticalstr ="";
	
//	s.replaceAll("[0-9]", "");             // shortcut method to remove numbers
	
	for(int i=0; i<s.length(); i++) 
	{
		char c = s.charAt(i);
		if(Character.isDigit(c)) 
		{
			continue;
		}
		else 
		{
			alphabeticalstr=alphabeticalstr+c;
		}
	}
	
	System.out.println(alphabeticalstr);
  }
}
