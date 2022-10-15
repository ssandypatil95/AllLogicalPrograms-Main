package zPractice1;

public class Reverseword {
	public static void main(String[] args) {
		String s1="This Is Called As Pune";
		String s2[] = s1.split(" ");
		int s3=s2.length;
		for(int i= s3-1; i>=0; i--) {
			System.out.print(s2[i]+" ");
		}
	}

}
 