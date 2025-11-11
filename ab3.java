abstract class Animal
{
	abstract void cats();
	abstract void dog();
}

abstract class Cat extends Animal
{
	@Override
	void cats() {
		// TODO Auto-generated method stub
		System.out.println( "class CAT \nCats meow meow");
	}

	abstract void dog();
}

 class Dog extends Cat
{



	@Override
	void dog() {
		// TODO Auto-generated method stub
		System.out.println("\nclass DOG\nDogs bhaoo bhaoooooo");
	}
	
}
public class ab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	Dog d=new Dog();
	d.cats();
	d.dog();
		
	}

}
