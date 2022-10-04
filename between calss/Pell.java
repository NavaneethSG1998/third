class sample
{
	void sec(int a,int b)
	{ 
		final double pi=3.142;
		double area=pi*a*b;
        System.out.println(area);
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 s.sec(6,6);

	}
}
