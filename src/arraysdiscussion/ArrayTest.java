package arraysdiscussion;

public class ArrayTest {
	public static void main(String[] args) {
		
		String [] a = new String [5];
		
		a[0]="sachin";
		a[1]="saurav";
		a[2]="rahul";
		a[3]="dinesh";
		a[4]="rohit";
		
		System.out.println(a[1]);
		
		for(int i=0; i<a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

}
