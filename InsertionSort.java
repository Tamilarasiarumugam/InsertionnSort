package Practice;

public class InsertionSort {
	
	public static int[] insertion(int[] arr,int n)
	{
		//int[] ans=new int[n];
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
		
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {4,3,5,1,2};
		int n=arr.length;
		int[] ans=insertion(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
		;
	}

}
