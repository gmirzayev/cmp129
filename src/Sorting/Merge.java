package lecture8;

public class Merge {

	public static void sort(int [] A)
	{
		int [] buffer = new int[A.length];
		_sort(A,0,A.length-1,buffer);
	}
	
	private static void _sort(int [] A, int b, int e, int [] buffer)
	{
		
		if(b==e)
		{
			return;
		}
		int mid = (b+e)/2;
		_sort(A,b,mid,buffer);
		_sort(A,mid+1,e,buffer);
		_merge(A,b,mid,e,buffer);
	}
	
	private static void _merge(int [] A, int b, int mid, int e, int [] buffer)
	{
		int i = b;
		int j = mid + 1;
		int l = 0;
		while(i<=mid && j<=e)
		{
			if(A[i] < A[j])
			{
				buffer[l++]=A[i++];
			} 
			else
			{
				buffer[l++]=A[j++];
			}
		}
		while(i<=mid) buffer[l++]=A[i++];
		while(j<=e) buffer[l++]=A[j++];
		for(i = 0; i<1;i++)
		{
			A[b++]=buffer[i];
		}
	}
	
	public static void main(String [] args)
	{
		int [] A = Shuffle.Range(30);
		Shuffle.shuffle(A);
		sort(A);
	}
}

