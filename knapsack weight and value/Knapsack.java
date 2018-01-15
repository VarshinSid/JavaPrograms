public class Knapsack
{
	static int calculate(int[] wt, int[] vl, int w, int i)
	{
		int max = 0;
		if(w <= 0 || i < 0)
		{
			return 0;
		}
		int incl = vl[i] + calculate(wt, vl , w - wt[i] ,i-1);

		int excl = calculate(wt, vl , w ,i-1);
		if(incl > excl)
		{
			max = incl;
		}
		else
		{
			max = excl;
		}
		System.out.println("weight: "+w+ "\tinclude: "+incl+ "\texclude: "+excl+ "\tindex: " +i);
		return max;
	}

	public static void main(String[] args)
	{

		int[] wt = {10,20,30};
		int[] vl = {60,100,120};
		int w = 50;
		int i = wt.length - 1;

		int maxVal = calculate(wt, vl , w ,i);
		System.out.println("Max value: "+maxVal);
	}
}