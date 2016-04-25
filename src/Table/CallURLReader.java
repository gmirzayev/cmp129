package table;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CallURLReader {

	 private static SimpleDateFormat dateFmt = new SimpleDateFormat( "yyyy-MM-dd");

     public static Date GetDate( String dateString ) {
	  try {
	    return dateFmt.parse(dateString);
	  } 
	  catch( java.text.ParseException e ) {
	    return new Date();
	  }
     }
   
     public static ArrayList<String> getData(String date1, String date2, String Symbol)
     {
    	 String url = YahooURL.formUrl( Symbol , GetDate(date1) , GetDate(date2) );
    	 return YahooURLReader.ReadURL(url);
     }
    
     public static void main( String [] args ) {
         String dateStr1 = "2016-04-01";
         String dateStr2 = "2016-04-18";
         String symbol = "GOOGL";

         Date date1 = GetDate( dateStr1 );
         Date date2 = GetDate( dateStr2 );
         String urlString = YahooURL.formUrl( symbol , date1 , date2 );
         ArrayList<String> data = YahooURLReader.ReadURL( urlString );     
         for(String d : data)
         {
        	 System.out.println(d);
         }
     }
}
