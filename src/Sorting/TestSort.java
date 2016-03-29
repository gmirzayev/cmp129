package lecture8;

public class TestSort {

	public static void run(int trials, int N, String algo)
	{
		int T = algo.equals("insertion") ? 1 : 2;
		Timer timer = new Timer();
		timer.start();
		int [] A = Shuffle.Range(N);
		for(int i = 0; i<trials; i++)
		{
			Shuffle.shuffle(A);
			if(T == 1)
			{
				Insertion.sort(A);
			} 
			else
			{
				Merge.sort(A);;
			}
		}
		timer.stop();
		results(algo,trials,N,timer.elapsed());
	}
	
	public static void results(String algo, int trials, int N, long elapsed)
	{
		System.out.format("%10s %10d %5d %20d\n",algo,trials,N,elapsed);
	}
	
	public static void main(String [] args)
	{
		int [] N = {100,10000,20000,100000,1000000};
		for(int n : N)
		{
			if(n<=100000)
			{
				run(1,n,"insertion");
			}
			run(1,n,"merge");
		}
	}
}
