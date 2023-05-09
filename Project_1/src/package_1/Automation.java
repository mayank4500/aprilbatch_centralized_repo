package package_1;

public class Automation
{
	int xyz;
	public void display()
	{
		System.out.println("Automation is very easy");
	}
	
public static void main (String[]args)
{
	Automation ob=new Automation ();
	ob.display();
	ob.xyz=456;
	System.out.println(ob.xyz);
}
}
