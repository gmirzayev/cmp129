package lecture6;

public abstract class Shape {

	protected long _id;
	
	public Shape()
	{
		_id = -1;
	}
	
	public Shape(long id)
	{
		System.out.println("Consructing shape:" + id);
		_id = id;
	}
	
	public abstract double area();
	public abstract void scale(double scaleFactor);
	public abstract String name();
	
	public long getId()
	{
		return _id;
	}
	
	public static void printInfo(Shape s)
	{
		System.out.println(s.name() + " " + s.area() + " " + s.getId());
		if(s instanceof Square)
		{
			Square square = (Square)s;
			System.out.println("Square length =" + square.getLength());
		}
		else if (s instanceof Triangle)
		{
			Triangle triangle = (Triangle)s;
			System.out.println("Triangle base =" + triangle.getBase() + " height =" + triangle.getHeight());
		}
	}
	
	public static Shape [] getShapes()
	{
		Shape [] shapes = new Shape[5];
		int i = 0;
		long id = 5;
		shapes[i++] = new Square(5.5, id++);
		shapes[i++] = new Square(7, id++);
		shapes[i++] = new Triangle(7,7, id++);
		shapes[i++] = new Triangle(3,4, id++);
		shapes[i++] = new Triangle(2,2, id++);
		return shapes;
	}
	
	public static void example()
	{
		Shape [] shapes = getShapes();
		for(Shape s : shapes)			
		{
			printInfo(s);
		}
		
	}
	
	public static void main(String [] args)
	{
		example();		
	}
	
}
