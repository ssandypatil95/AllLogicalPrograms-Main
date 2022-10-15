package assignmentStrings;

public class ReverseString {
	public static void main(String[] args) {
		
		String s1="Sandeep Zamade";
		String reverse="";
		int s2=s1.length();
		
		for(int i=s2-1; i>=0; i--) {
			char s3=s1.charAt(i);
		
			reverse=reverse+s3;
		}
		System.out.println(reverse);
	}
	}
	