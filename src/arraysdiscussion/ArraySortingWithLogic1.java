package arraysdiscussion;

public class ArraySortingWithLogic1 {
	
	public static void main(String[] args) {
		
		  int [] a = new int [5];
		  
		  a[0]=20;
		  a[1]=10;
		  a[2]=5;
		  a[3]=90;
		  a[4]=300;
		  
		  int temp;
		  
		  for(int i=0; i<a.length; i++) 
		  {
			  for(int j=i+1; j<a.length; j++)
			  {
				if(a[i]>a[j]) 
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			  }
		  }
		  
		  System.out.println(a[a.length-2]);                //------------------get second highest no
		  
		  for(int aa:a)                                     //------------------get all no with sorting
		  {
			  System.out.println(aa);
		  }
		
  }
}
