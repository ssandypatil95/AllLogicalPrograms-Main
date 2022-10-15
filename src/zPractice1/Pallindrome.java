package zPractice1;

public class Pallindrome {
	public static void main(String[] args) {
		
		int a= 1221;
		int temp=a;
		int reverse=0;
		
		while(a!=0) {
			int remainder=a%10;
			reverse=reverse*10+remainder;
			a=a/10;
		}
		System.out.println(reverse);
		
		if(temp==reverse) { 
			System.out.println("this no "+reverse+" is pallindrom");
		}
		else {
			System.out.println("this no "+reverse+" is not pallindrom");
		
		}

	}
}
