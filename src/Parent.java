
public class Parent
{	
	//inherited
void eat()
{
	System.out.println("Parent eats");
}
//overridden
void sleep()
{
	System.out.println("Parent sleeps");
}
//inherited
void run()
{
	System.out.println("Parent run 5kms");

}
}

class Child extends Parent
{//overridden
	void swims()
	{
		System.out.println("child Swims");
	}
	//specialized
	void sleep()
	{
		System.out.println("child Sleeps");
	}
	
}

