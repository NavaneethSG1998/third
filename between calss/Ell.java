class sample
{
	double ell()
	{
        int a=6;
		int b=6;
        final double pi=3.142;
		double area=pi*a*b;
        return area;
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 double x=s.ell();
		 System.out.println(x);

	}
}
