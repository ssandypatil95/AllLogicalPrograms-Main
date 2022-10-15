package stringSetProgram;

                                                   // Write a program to reverse a String ?
                                                   // For example String s= “sandeep zamade” expected Output ---  > edamaz peednas
public class ReverseString {
	
    public static void main(String[] args) {
		
		String s="sandeep zamade";
		String reverse="";
		
		for(int i=(s.length()-1); i>=0; i--){
			
			reverse=reverse+s.charAt(i);
		
		}
		System.out.println(reverse);
	}


}
