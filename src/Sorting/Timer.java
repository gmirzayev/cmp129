package lecture8;

public class Timer {

	private long _start;
	private long _stop;
	
	public void start()
	{
		_start = System.nanoTime();
		_stop = 0;
	}
	
	public void stop()
	{
		_stop = System.nanoTime();
	}
	
	public long elapsed()
	{
		return _stop - _start;
	}
	
	public long getStart()
	{
		return _start;
	}
	
	public long getStop()
	{
		return _stop;
	}
	
	public static void main(String [] args)
	{
		try
		{
			Timer timer = new Timer();
			timer.start();
			Thread.sleep(4000);
			timer.stop();
			System.out.println("elapsed time = " + timer.elapsed() + " start=" + timer.getStart());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
