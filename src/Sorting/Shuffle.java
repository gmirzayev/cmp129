package lecture8;

import java.util.Random;

public class Shuffle 
{

	public static int [] Range( int N)
	{
		int [] A = new int[N];
		for(int i = 0; i < N; i++)
		{
			A[i] = i;
		}
		return A;
	}
	
	public static void shuffle(int [] A)
	{
		Random rand = new Random();
		int N = 3 * A.length / 2;
		for(int i = 0; i < N; i++)
		{
			int j = rand.nextInt(A.length);
			int k = rand.nextInt(A.length);
			swap(j,k,A);
		}
	}
	
	public static void swap(int i, int j, int [] A)
	{
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	public static void print(int [] A)
	{
		for(int a : A)
		{
			System.out.format("%d ", a);
		}
		System.out.println();
	}
	
	public static void test(int N)
	{
		int [] A = Range(N);
		shuffle(A);
		print(A);
	}
	
	public static void main(String [] args)
	{
		for(int i = 0; i < 10; i++)
		{
			test(20);
		}
	}
}
