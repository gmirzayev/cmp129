package table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class YahooURLReader {

	public static ArrayList<String> ReadURL( String urlString ) {
        ArrayList<String> data = new ArrayList<String>();
	try {
	    URL url = new URL( urlString );
	    URLConnection conn = url.openConnection();
	    HttpURLConnection httpConn = null;
	    if ( conn instanceof HttpURLConnection ) {
		httpConn = (HttpURLConnection)conn;
	    }
	    if ( httpConn == null ) 
	      return data;
	    BufferedReader in = new BufferedReader( new InputStreamReader(httpConn.getInputStream()));
	    String line = null;
	    while( (line = in.readLine()) != null ) {
	        data.add(line);
	    }
	}
	catch( IOException e ) {
	    System.out.println(e);
	}
	return data;
      }
}
