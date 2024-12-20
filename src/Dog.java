
public class Dog {
	public void Name()
{
	System.out.println("Snoozy");
}
	public void color()
 {
	 System.out.println("White");
 }

}
class Puppy extends Dog
{
	public void height()
	{
		System.out.println("1 Feet");
	}
	public void weight()
	{
		System.out.println("7kgs");
	}
}
class Puppy1 extends Puppy
{
	public void food()
	{
		System.out.println("Bread");
	}
	public void drink()
	{
		System.out.println("Milk");
	}
}