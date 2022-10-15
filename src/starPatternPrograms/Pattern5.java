package starPatternPrograms;

public class Pattern5 {
	public static void main(String[] args) {
		 for(int i=1; i<=9; i++)
		 {
			 for(int j=1; j<=17; j++) {
				 if(j>=(10-i)&& j<=(8+i)) 
				 {
					 System.out.print("*");
				 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		 
	}

}
