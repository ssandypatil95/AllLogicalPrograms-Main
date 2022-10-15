package zzPracticeString;

public class RemoveNumberFromString {
  public static void main(String[] args) {
	
	  String s = "bjsjdjsajdsaj54s5dsamslkdjsa45dsadsa";
	  String newstr="";
//	  String ss = s.replaceAll("[0-9]", "");
//	  
//	  System.out.println(ss);
	  
	  for(int i=0; i<s.length(); i++) 
	  {
		  char c = s.charAt(i);
		  
		  if(Character.isDigit(c)) 
		  {
			  continue;
		  }
		  else 
		  {
			  newstr=newstr+c;
		  }
	  }
	  System.out.println(newstr);
	
 }
}
