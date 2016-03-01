package lecture6;

public class Triangle extends Shape implements Bisect {

	protected double _base;
	protected double _height;
	
	public Triangle(double base, double height, long id)
	{
		super(id);
		_base = base;
		_height = height;
	}
	
	public double getBase()
	{
		return _base;
	}
	
	public double getHeight()
	{
		return _height;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (_base * _height)/2.0;
	}

	@Override
	public void scale(double scaleFactor) {
		// TODO Auto-generated method stub
		_base *= scaleFactor;
		_height *= scaleFactor;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Triangle";
	}

	@Override
	public Shape[] bisect() {
		Shape [] parts = new Shape[2];
		parts[0] = new Triangle(_base * 0.5, _height, _id+1);
		parts[1] = new Triangle(_base * 0.5, _height, _id+1);
		return parts;
	}

}
