package table;

import java.text.SimpleDateFormat;
import java.util.Date;

public class YahooURL {

	public static String formUrl( String symbol , Date begin ,Date end ) {
		String l = getHost();
		l += "s=" + symbol;
		l += "&d=" + (GetMonth(end)-1);
		l += "&e=" + GetDay(end);
		l += "&f=" + GetYear(end);
		l += "&a=" + (GetMonth(begin)-1);
		l += "&b=" + GetDay(begin);
		l += "&c=" + GetYear(begin);
		l += "&ignore=.csv";
		return l;
	    }

	    private static SimpleDateFormat yearFmt = new SimpleDateFormat("yyyy");
	    private static SimpleDateFormat monthFmt = new SimpleDateFormat("MM");
	    private static SimpleDateFormat dayFmt = new SimpleDateFormat("dd");

	    private static String getHost() {
		return "http://real-chart.finance.yahoo.com/table.csv?";
	    }

	    private static int GetYear( Date d ) {
		return Integer.parseInt( yearFmt.format(d));
	    }

	    private static int GetMonth( Date d ) {
		return Integer.parseInt( monthFmt.format(d));
	    }
	    private static int GetDay( Date d ) {
		return Integer.parseInt( dayFmt.format(d));
	    }
}
