public class Stock {
	private final String _name;
	private final String _ticker;
	private final double _pe;
	private final double _52weekHigh;
	private final double _52weekLow;
	
	public Stock(String name, String ticker,
				double pe, double high52, double low52)
	{
		_name = name;
		_ticker = ticker;
		_pe = pe;
		_52weekHigh = high52;
		_52weekLow = low52;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public String getTicker()
	{
		return _ticker;
	}
	
	public double getPE()
	{
		return _pe;
	}
	
	public double get52WeekHigh()
	{
		return _52weekHigh;
	}
	
	public double get52WeekLow()
	{
		return _52weekLow;
	}
}
