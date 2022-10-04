class sample
{
	double cir()
	{
        int r=6;
		final double pi=3.142;
		double area=pi*r*r;
        return area;
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 double x=s.cir();
		 System.out.println(x);

	}
}
