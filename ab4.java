abstract class A
{
	A()
	{
		System.out.println("This is constructor of abstract class ");
	}
	abstract void a_method();
	void normal()
	{
		System.out.println( "\nThis is a normal method of abstract class");
	}
}
class Child extends A
{
   Child()
   {
	   super();
   }
	
	@Override
	void a_method() {
		// TODO Auto-generated method stub
		System.out.println("\nThis is abstract method");
	}
	
}

public class ab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Child c=new Child();
     c.normal();
     c.a_method();
	}

}
