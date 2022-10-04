class sample
{
	double sec()
	{
        int r=6;
		int ti=60;
		double area=0.5*r*r*ti;
        return area;
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 double x=s.sec();
		 System.out.println(x);

	}
}
