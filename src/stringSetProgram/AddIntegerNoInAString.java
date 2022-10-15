package stringSetProgram;

                                         // WAP to add the integer available in the String ?
                                         // For example : String s = “10value8with20value”; then the sum should be10+8+20 = 38
public class AddIntegerNoInAString {
	
	public static void main(String[] args) {
		
		String s = "60fdf5ffrf80frfr4fr5";
		String number = "";
		boolean flag = false;
		int temp = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i))) 
			{
				number=number+s.charAt(i);
				flag=true;
				
				if(i!=s.length()-1) 
				{
					continue;
				}
			}
			
			if(flag) 
			{
				int value = Integer.parseInt(number);
				number = "";
				
				temp=value+temp;
				flag=false;
			}
		}
		
		System.out.println(temp);		
 }	
}
