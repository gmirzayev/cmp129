package table;

import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Simple extends JFrame {

	JTable _table1;
	JTable _table2;
	
	public Simple()
	{
		super();
		setSize(800,800);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		buildTable1();
		buildTable2();
		setVisible(true);
		
	}
	
	private void buildTable2()
	{
		int rows = 20;
		int cols = 10;
		Double [][] data = new Double[rows][cols];
		Random rand = new Random(54321);
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				data[i][j] = rand.nextGaussian();
			}
		}
		String [] colNames = new String [cols];
		for(int x = 0; x < cols; x++)
		{
			colNames[x] = "col" + Integer.toString(x);	
		}
		_table2 = new JTable(data,colNames);
		JScrollPane scroll = new JScrollPane(_table2);
		add(scroll,BorderLayout.CENTER);
	}	
		
	private void buildTable1()
	{
		JPanel panel = new JPanel();
		String [][] data = {
				{"Randolph", "New Jersey"},
				{"Chicago", "Illinois"}};
		String [] cols = {"City", "State"};
		_table1 = new JTable(data,cols);
		
		panel.add(_table1);		
		add(panel);
	}
	
	public static void main(String [] args)
	{
		new Simple();
	}
	
}
