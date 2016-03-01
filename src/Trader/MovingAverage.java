import java.util.ArrayList;

public class MovingAverage {

	public static ArrayList<Double> calc(ArrayList<Double> prices, int period)
	{
		ArrayList<Double> ma = new ArrayList<Double>();
		return ma;
	}
	
	public static double calcMA(ArrayList<Double> prices, int start, int period)
	{
		int N = 0;
		double sum = 0;
		int end = Math.min(start+period, prices.size());
		for(int i = start; i<end;i++)
		{
			sum += prices.get(i);
			N ++;
		}
		return sum / (double)N;
	}
	
	//write calculation to figure out moving average
	//double calcMA(ArrayList<Double> prices, int start, int period)	
}
