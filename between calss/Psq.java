class sample
{
	void sec(int a)
	{ 
		double area=a*a;
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
