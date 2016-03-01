package lecture6;

public class Square extends Shape implements Bisect {

	protected double _length;
	
	public Square(double length, long id)
	{
		super(id);
		_length = length;
		System.out.println("Constructing square:" + id + " length = " + _length);
	}

	public double getLength()
	{
		return _length;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return _length * _length;
	}

	@Override
	public void scale(double scaleFactor) {
		// TODO Auto-generated method stub
		_length *= scaleFactor;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Square";
	}

	@Override
	public Shape[] bisect() {
		Shape [] parts = new Shape[2];
		parts[0] = new Square(_length * 0.5, _id+1);
		parts[1] = new Square(_length * 0.5, _id+1);
		return parts;
	}

}
