class parent{
	void message()
	{
		System.out.println("this is parent class ");
	}
	
}
class subclass1 extends parent{
	void message()
	{
		System.out.println("this is first class ");
	}
	
}
class subclass2 extends parent
{
	void message()
	{
		System.out.println("this is second class ");
	}
}
public class ab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass1 a=new subclass1();
		subclass2 b=new subclass2();
		a.message();
		b.message();

	}

}
