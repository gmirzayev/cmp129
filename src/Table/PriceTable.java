package table;

import java.awt.BorderLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PriceTable extends JFrame {
	
	ArrayList<String> _data;
	
	public PriceTable(String date1, String date2, String Symbol)
	{
		super("PriceTable");
		setSize(600,600);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		_data = CallURLReader.getData(date1, date2, Symbol);
		
		buildTable();
		setVisible(true);
	}
	
	private void buildTable()
	{
		JTable table = new JTable(getDataFromURL(),getCols());
		JScrollPane scroll = new JScrollPane(table);
		add(scroll,BorderLayout.CENTER);
	}
	
	private String [] getCols() 
	{
		String [] cols = {"Date","Open","Close","Volume"};
		return cols;
	}
	
	private Object [][] getDataFromURL()
	{
		Object [][]data = new Object[_data.size()-1][4];
		for(int i = 1; i < _data.size()-1; i++)
		{
			String [] rdata = _data.get(i).split(",");
			int j = 0;
			int r = i-1;
			data[i][j++] = rdata[0];
			data[i][j++] = String.format("%.2f", Double.parseDouble(rdata[1]));
			data[i][j++] = String.format("%.2f", Double.parseDouble(rdata[4]));
			data[i][j++] = NumberFormat.getNumberInstance(Locale.US).format(Long.parseLong(rdata[5]));
		}
		return data;
		
	}
	
	private Object [][] getData()
	{
		Object [][]data = new Object[1][5];
		int row = 0;
		int j = 0;
		data[row][j++] = new String("GOOGL");
		data[row][j++] = new String("2016-04-18");
		data[row][j++] = new Double(760.0);
		data[row][j++] = new Double(763);
		data[row][j++] = new Long(1000000);
		return data;
	}
	
	
	public static void main(String [] args)
	{
		new PriceTable("2016-01-01","2016-04-18","GOOGL");
	}
}
