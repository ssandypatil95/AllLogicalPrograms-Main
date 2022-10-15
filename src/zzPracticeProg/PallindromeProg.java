package zzPracticeProg;

public class PallindromeProg {
	public static void main(String[] args) {
		
		int a=112211;
		int temp=a;
		int reverse=0;
		
		while(a!=0) 
		{
			int remainder=a%10;
			
			reverse=reverse*10+remainder;
			a=a/10;
		}
		System.out.println(reverse);
		
		if(temp==reverse)
		{
			System.out.println("Number "+reverse+" is pallindrome");
		}
		else 
		{
			System.out.println("Number "+reverse+" is not pallindrome");
		}
	}
}
