package zzz;

public class addnoindivdually {
	
	public static void main(String[] args) {
		
		String s = "dd5we10fwf3ef7ef25wd35fea6sa4s";
		String ss="";
		int sum=0; 
		for(int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if(Character.isDigit(c)) 
			{
				ss=ss+c;
				int value = Integer.parseInt(ss);
				sum=sum+value;
				ss="";
			}
		}
		
		System.out.println(sum);
		
		
	}
}
