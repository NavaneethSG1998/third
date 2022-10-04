class sample
{
	double rec()
	{
        int w=6;
		int h=6;
		double area=w*h;
        return area;
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 double x=s.rec();
		 System.out.println(x);

	}
}
