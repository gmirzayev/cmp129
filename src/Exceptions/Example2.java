package lecture7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example2 
{

	public static void read(String fileName, int ix)
	{
		try
		{
			File f = new File(fileName);
			Scanner scan = new Scanner(f);
			double sum = 0;
			try
			{
				boolean isheader = true;
				while(scan.hasNextLine())
				{
					String line = scan.nextLine();
					if(isheader)
					{
						isheader = false;
						continue;
					}
					String [] sv = line.split(",");
					sum += Double.parseDouble(sv[ix]);
					//double v = Double.parseDouble(line);
					//System.out.println(v);
				}
			} catch(NumberFormatException e)
			{
				e.printStackTrace(System.err);
			} catch(Exception e)
			{
				System.out.println("Catching generic exception " + e.getMessage());
			}
			finally
			{
				scan.close();
				System.out.println("finally block executing sum=" + sum);
			}
		} catch(java.io.FileNotFoundException e)
		{
			e.printStackTrace(System.err);
		}	
	}

	public static void main(String [] args)
	{
		//readData("someName");
		String fname = "C:/Users/mirzayev.gleb/Documents/GoogleRecords.csv";
		read(fname, 0);
		read(fname, 1);
		read(fname, 2);
		read(fname, 3);
		read(fname, 111);
		read(fname, 4);
	}
	
}