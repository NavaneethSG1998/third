class sample
{
	double tri()
	{
        int b=6;
		int h=6;
		double area=0.5*b*h;
        return area;
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 double x=s.tri();
		 System.out.println(x);

	}
}
