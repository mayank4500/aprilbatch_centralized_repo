package package_1;

public class Arithmetic 
{
	
		public int sum(int a,int b)
		{
			int c;
			c=a+b;
			System.out.println("Sum result is"+c);
			return c;
		}
	public int sub(int a1, int a2)
	{
		int r1;
		r1=a1-a2;
		System.out.println("Sub result is "+r1);
		return r1;
	}
public int mul(int b1, int b2)
{
      int c1;
      c1= b1*b2;
      System.out.println("Mul result is" +c1);
      return c1;
}

public static void main(String[] args) {
	
	Arithmetic ob=new Arithmetic();
	int sumresult=ob.sum(10,2);
	int subresult=ob.sub(10,2);
	ob.mul(sumresult,subresult);
}
}



	
