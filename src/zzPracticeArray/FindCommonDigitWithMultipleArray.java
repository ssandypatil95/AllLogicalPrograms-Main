package zzPracticeArray;

public class FindCommonDigitWithMultipleArray {
	public static void main(String[] args) {
		
        int [] arr1 = {1, 5, 8, 45, 60};
		
		int [] arr2 = {7, 6, 1, 45, 60};
		
		int [] arr3 = {1, 60, 5, 80, 7};
		
		for(int i=0; i<arr1.length; i++) 
		{
			for(int j=0; j<arr2.length; j++) 
			{
				for(int k=0; k<arr3.length; k++) 
				{
					if(arr1[i]==arr2[j] && arr2[j]==arr3[k]) 
					{
						System.out.println(arr1[i]);
					}
				}
			}
		}
	}
}
