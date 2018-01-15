import java.util.*;

public class Coins
{
	public static void createArray(int[][] coinsArray)
	{
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < 4 ; j++)
			{
				if(i % 2 != 0)
				{
					if(j % 2 != 0)
					{
						coinsArray[i][j] = 1;						
					}	
				}
			}
		}
	}

	public static void printArray(int[][] coinsArray)
	{
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < 4 ; j++)
			{		
					System.out.print(coinsArray[i][j]);	
			}
			System.out.println(); 
		}
	}

	static int calculate(int[][] coinsArray, int i, int j)
	{
		int max = 0;
		int l = coinsArray.length - 1;
		if(i > l || j > l)		
		{
			return 0;
		}

		if (visited.containsKey(i + "," + j)) 
		{
			System.out.println("Found: "+i + "," + j);
			return visited.get(i + "," + j);
		} 

		System.out.println("i: "+i+ "\tj: "+j);

		int right = coinsArray[i][j] + calculate(coinsArray, i, j+1);
		int down = coinsArray[i][j] + calculate(coinsArray, i+1, j);
		int diagonal = coinsArray[i][j] + calculate(coinsArray, i+1, j+1);

		if(right >= down && right >= diagonal)
		{
			max = right;
		}
		else if(down >= right && down >= diagonal) 
		{
			max = down;	
		}
		else
		{
			max = diagonal;
		}
		visited.put(i + "," + j, max);
		return max; 
	}

	static HashMap<String, Integer> visited = new HashMap<>();

	public static void main(String[] args)
	{
		int[][] coinsArray = new int[4][4];
		createArray(coinsArray);
		printArray(coinsArray);

		int i = 0, j = 0;
		int totalCoins = calculate(coinsArray,i,j);
		System.out.println("Max coins: "+totalCoins);
	}
}