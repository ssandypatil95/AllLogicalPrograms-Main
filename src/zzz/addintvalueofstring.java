package zzz;

public class addintvalueofstring {
	public static void main(String[] args) {
		
		String s= "jhghjgh5ghuhih25jgygg20hgkjg25hjgj";
		String ss="";
		int sum = 0;
		
		boolean flag = false;
		
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
