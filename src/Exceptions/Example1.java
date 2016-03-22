package lecture7;

public class Example1 
{

	public static void test1() 
	{
		try 
		{
			int [] X = new int[4];
			X[4]=1000;
			System.out.format("%d",1.111);
		//} catch(java.util.IllegalFormatConversionException e)
		//{
		//	System.out.println("Catching illegal format but continuing");
		//} catch(java.lang.ArrayIndexOutOfBoundsException e)
		//{
		//	System.out.println("Catching array out of bounds");
		} catch(Exception e)
		{
			System.out.println("Catching generic exception");
			e.printStackTrace(System.out);
		}
	}
	
	public static void test2()
	{
		System.out.println("We are still running");
	}
	
	public static void main(String [] args)
	{
		test1();
		test2();
	}
	
}
