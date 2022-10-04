class sample
{
	void sec(int r)
	{ 
		final double pi=3.142;
		double area=pi*r*r;
        System.out.println(area);
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 s.sec(6);

	}
}
