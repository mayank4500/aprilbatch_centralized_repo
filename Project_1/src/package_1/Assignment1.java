package package_1;

public class Assignment1 {
	
	public int sum (int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum result is" +c);	
		return c;
	}
	
	public int sub (int a1, int a2)
	{
		int b1;
		b1=a1-a2;
		System.out.println("Sub result is" +b1);
        return b1;
	}
	public int mul (int c1, int c2)
	{
		int d;
		d=c1*c2;
		System.out.println("mul result is" +d);
		return d;
		}
	public float div (int d1, int d2)
	{
		int e;
		e=d1/d2;
		System.out.println("div result is" +e);
		return e;
	}
	
	public static void main(String[] args)
	{
		Assignment1 ob=new Assignment1();
		//((((10+2)+2)-2)*2)/2)
		int sumresult=ob.sum(10,2);
		int sum2=ob.sum(sumresult,2);
		int subresult=ob.sub(10,2);
		int mulresult=ob.mul(subresult,2);
		float divresult=ob.div(mulresult,2);
		System.out.println("The result of ((((10+2)+2)-2)*2)/2) is...." +divresult);
	}			
	}
	
