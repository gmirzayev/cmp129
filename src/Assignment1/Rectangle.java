public class Rectangle 
{
	private final double length_;
	private final double width_;
	
	public Rectangle(final double length, final double width)
	{
		length_ = length;
		width_ = width;
	}
	
	public Rectangle(Rectangle rectangle)
	{
		length_ = rectangle.length_;
		width_ = rectangle.width_;
	}
	
	public static Rectangle copy(Rectangle rectangle)
	{
		return new Rectangle(rectangle.length_, rectangle.width_);
	}
	
	public double getArea()
	{
		return length_ * width_;
	}
	
	public boolean equals(Rectangle rectangle)
	{
		return length_ == rectangle.length_ && width_ == rectangle.width_;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("length=").append(length_).append(":width=").append(width_);
		return sb.toString();
		//return new String("rectangle 1ength=" + length_ + " width=" + width_);
	}
	
	public static void main(String [] args)
	{
		//create instances of rectangle
		Rectangle rect1 = new Rectangle(5,5);
		Rectangle rect2 = new Rectangle(10,10);
		
		//test getArea
		System.out.println(rect1.getArea());
		System.out.println(rect2.getArea());
		
		//test equals method 
		System.out.println(rect1.equals(rect2));
		
		//test copy method
		Rectangle rect3 = copy(rect1);
		System.out.println(rect3.toString());
		
		//test copy constructor
		Rectangle rect4 = new Rectangle(rect2);
		System.out.println(rect4.toString());
		
	}

}

