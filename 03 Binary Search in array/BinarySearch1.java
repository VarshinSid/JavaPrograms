public class BinarySearch1
{
	int search(int[] arr, int n, int x)
	{
		int left = 0;
		int right = n-1;
		int mid = (left + right)/2;
		
		while(arr[mid] != x)
		{
			if(left == right)
			{
				break;
			}
			if(x == arr[mid])
			{
				return mid;
			}
			else if(x < arr[mid])
			{
				right = mid -1;
				mid = (left + right)/2;
			}
			else if(x > arr[mid])
			{
				left = mid + 1;
				mid = (left + right)/2;
			}
		}
		return mid;
	}
	
	public static void main(String[] args)
	{
		BinarySearch1 obj = new BinarySearch1();
		int[] arr = {3,11,24,39,48,56,67,72,83,94};
		int n = arr.length;
		int x = 31;
		int ans = obj.search(arr,n,x);
		
			System.out.println("index at: " +ans);
		
		
	}
}