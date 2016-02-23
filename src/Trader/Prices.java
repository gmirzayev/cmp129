import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Prices {

	private final String 			  _ticker;
	private final ArrayList<Double>   _prices;
	
	public Prices( String ticker )
	{
		_ticker = ticker;
		_prices = new ArrayList<Double>();
	}
	
	public String getTicker()
	{
		return _ticker;
	}
	
	public ArrayList<Double> getPrices()
	{
		return _prices;
	}
	
	public void read(String fileName)throws Exception
	{
		File f = new File(fileName);
		Scanner scan = new Scanner(f);
		int lineNum = 0;
		int adjCloseIndex = 6;
		
		while(scan.hasNextLine())
		{
			String aline = scan.nextLine();
			if(lineNum++ == 0) continue;
			String [] sv = aline.split(",");
			if(sv.length != 7) continue;
			double adjClose = Double.parseDouble(sv[adjCloseIndex]);
			_prices.add(adjClose);
		}
		scan.close();
	}
	
	public static void readTest(String fileName, String ticker)
	{
		try {
			Prices p = new Prices(ticker);
			p.read(fileName);
			System.out.format("%f %f\n",p._prices.get(0),p._prices.get(p._prices.size()-1));
		} catch(Exception e)
		{
			e.printStackTrace(System.err);
		}
	}
	
	public static void main(String [] args)
	{
		String fileName = "C:/Users/mirzayev.gleb/Documents/GoogleRecords.csv";
		readTest(fileName,"GOOGL");
	}
}
