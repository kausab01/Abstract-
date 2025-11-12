abstract class Shape
{
	abstract void RectangleArea(int length , int breadth );
	abstract void SquareArea(int side);
	abstract void CircleArea(int radius);
}
class Area extends Shape
{
	int length,breadth,side,radius;

	@Override
	void RectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		this.length=length;
		this.breadth=breadth;
		System.out.println("Area of rectangle : "+(this.length*this.breadth));
	}

	@Override
	void SquareArea(int side) {
		// TODO Auto-generated method stub
		this.side=side;
		System.out.println("Area of square : "+(this.side*this.side));
	}

	@Override
	void CircleArea(int radius) {
		// TODO Auto-generated method stub
		this.radius=radius;
		System.out.println("Area of circle : "+((3.14)*this.radius*this.radius));
	}
	
}
public class ab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		a.RectangleArea(5, 7);
		a.SquareArea(8);
		a.CircleArea(4);

	}

}
