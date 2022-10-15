package zPractice1;

public class Reverse {
	public static void main(String[] args) {
		
		String s1="sandeep zamade";
		String reverse="";
		int s2=s1.length();
		for(int i=s2-1; i>=0; i--){
			
			reverse=reverse+s1.charAt(i);
		
		}
		System.out.println(reverse);
	}

}
