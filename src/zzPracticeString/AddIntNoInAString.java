package zzPracticeString;

public class AddIntNoInAString {
	
	public static void main(String[] args) {
		
		String s = "60fdf5ffrf80frfr4fr5";
		String ss ="";
		boolean flag=false;
		int sum = 0;
		
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(Character.isDigit(c)) 
			{
				ss=ss+c;
				flag=true;
				if(i!=s.length()-1) 
				{
					continue;
				}
			}
			
			if(flag)
			{
				int value = Integer.parseInt(ss);
				sum=sum+value;
				ss="";
				flag=false;
			}
		}

		System.out.println(sum);
	}

}
