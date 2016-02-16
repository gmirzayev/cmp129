

public class TemperatureConversion {

	//take celsius double, multiply by 1.8 and then add 32
	public static double toFahrenheit(double cel)
	{
		return (cel * 1.8) + 32;
	}
	
	//take fahrenheit double, subtract 32 and then divide by 1.8
	public static double toCelsius(double fah)
	{
		return (fah-32)/1.8; 
	}
	
	public static void main(String[] args) {
		//test toFahrenheit
		System.out.println(toFahrenheit(0));
		
		//test toCelsius
		System.out.println(toCelsius(32));
	}
}
