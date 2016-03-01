package lecture6;

public class Rectangle extends Square {
	
	protected double _width;
	
	public Rectangle(double width, double length, long id)
	{
		super(length, id);
		_width = width;
		System.out.println("Constructing rectangle:" + id + " width = " + _width);
	}
	
	@Override
	public double area()
	{
		return _length * _width;
	}
	
	@Override
	public void scale(double scaleFactor)
	{
		_length *= scaleFactor;
		_width *= scaleFactor;
	}
	
	@Override 
	public String name()
	{
		return "Rectangle";
	}
	
	public static void main(String [] args)
	{
		//Shape s = new Rectangle(5,6,123);
		Shape s = new Square(5, 123);
		if(s instanceof Square)
		{
			Square square = (Square)s;
			System.out.println("Converted to Square " + square.getLength());
		}
		if(s instanceof Rectangle)
		{
			Rectangle rectangle = (Rectangle)s;
			System.out.println("Converted to Rectangle " + rectangle.getLength());
		}
	}

	@Override
	public Shape[] bisect() {
		Shape [] parts = new Shape[2];
		parts[0] = new Rectangle(_length, _width * 0.5, _id+1);
		parts[1] = new Rectangle(_length, _width * 0.5, _id+1);
		return parts;
	}
}





