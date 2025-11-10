import java.util.Scanner;

abstract class Bank
{
	
	abstract void getbalance();

}
class BankA extends Bank
{

	@Override
	void getbalance() {
		// TODO Auto-generated method stub
		
			Scanner s=new Scanner(System.in);
			System.out.println("deposit $ : ");
			int a=s.nextInt();
			System.out.println("$"+a+" deposit in Bank A");
		
	}
	
	
}
class BankB extends Bank
{
	@Override
	void getbalance()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("deposit $ : ");
		int b=s.nextInt();
		System.out.println("$"+b+" deposit in Bank B");
	}
}
class BankC extends Bank
{
	@Override
	void getbalance()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("deposit $ : ");
		int c=s.nextInt();
		System.out.println("$"+c+" deposit in Bank C");
	}
}
public class ab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		a.getbalance();
		b.getbalance();
		c.getbalance();
	}

}
