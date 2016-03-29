package lecture8;

public class Insertion 
{

	public static void sort( int [] A)
	{
		for(int i = 0; i < A.length - 1; i++)
		{
			int ix = findMinIndex(i, A.length, A);
			swap(i, ix, A);
		}
	}
	
	public static void print(int [] A)
	{
		for(int a : A) System.out.format("%d ",a);
		System.out.println();
	}
	
	public static void swap(int i, int j, int [] A)
	{
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	public static int findMinIndex(int start, int end, int [] A)
	{
		int v = start;
		for(int i = start + 1; i < end; i++)
		{
			if(A[i] < A[v]) v = i;
		}
		return v;
	}
	
	public static int findMinValue(int start, int end, int [] A)
	{
		int v = A[start];
		for(int i = start + 1; i < end; i++)
		{
			if(A[i] < v) v = A[i];
			
		}
		return v;
	}
	
	public static void main(String [] args)
	{
		int [] A = {6,2,0,1};
		sort(A);
	}
}
