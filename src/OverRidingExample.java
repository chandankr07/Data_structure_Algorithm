

public class OverRidingExample {
	 
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	
	public static void main(String[] args) {
		OverRidingExample s=new Rectangle();
		s.draw();
		
		s=new Circle();
		s.draw();
	}
 
}

class Rectangle extends OverRidingExample
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
 
class Circle extends OverRidingExample
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}
 