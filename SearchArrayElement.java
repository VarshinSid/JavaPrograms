public class SearchArrayElement
{
	int search(int[] arr, int n , int x)
	{
		for(int i = 0 ; i < n ; i++)
		{
			if(arr[i] == x)
			{
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		SearchArrayElement obj = new SearchArrayElement();
		int[] arr = {1,2,3,4,78,54,30};
		int n = arr.length;
		int x = 78;
		System.out.println(obj.search(arr,n,x));
	}
}