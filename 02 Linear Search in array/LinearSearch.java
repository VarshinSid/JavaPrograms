//VSid
public class LinearSearch
{
	int search(int[] arr,int n,int x)
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
		LinearSearch obj = new LinearSearch();
		int[] arr = {23,43,5,63,28,97,51,76,82,61};
		int n = arr.length;
		int x = 9;
		int ans = obj.search(arr,n,x);
		if(ans == 0)
		{
			System.out.println(x+ " Not found in array.");
		}
		else
		{
			System.out.println(x+ " Found in array at index: " +ans);
		}
	}
}
//VSid