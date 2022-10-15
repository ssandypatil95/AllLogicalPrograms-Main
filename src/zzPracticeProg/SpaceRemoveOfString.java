package zzPracticeProg;

public class SpaceRemoveOfString {
	public static void main(String[] args) {
		
//		String s1="I Live In Pune";
//		String s2=s1.replace(" ", "");
//		System.out.println(s2);

// Second way :-
		
		String s1="I Lives In Pune";
		String [] s2=s1.split(" ");
		
		for(String a1:s2) 
		{
			System.out.print(a1);
		}
		
  }
}
