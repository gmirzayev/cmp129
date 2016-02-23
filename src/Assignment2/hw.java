public class hw {
	//question 1 parts a,b,c
	public static void arrayStuff()
	{
		int [] A = { 1, 2, 3, 4, 5 };
		
		System.out.println(A[1]);
		//2
		
		int [] B = new int [1000];
		for(int i = 0; i < B.length; i++)
		{
			B[i] = i;
		}
	}
	
	//question 2 sum contents of int array
	public static long sum(int [] A)
	{
		long s = 0;
		for(int a : A)
		{
			s += a;
		}
		return s;
	}
	
	//find a string x  in an array of strings and return its position if found, otherwise return -1
	public static int find( String x, String [] A)
	{
		for(int i = 0; i < A.length; i++)
		{
			if(x.equals(A[i]))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void example()
	{
		String [] A = {"Bill", "Roger", "Lucy"};
		System.out.println("Lucy index " + find("Lucy",A));
		System.out.println("Lucy index " + find("John",A));
	}
	
	public static void main(String [] args)
	{
		example();
	}
}















