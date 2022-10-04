class Sample 
{
	double disp()
	{
		int r=6;
		final double pi=3.142;
		double area=pi*r*r;
		return area;
	}
	public static void main(String[] args) 
	{
		Sample x =new Sample();
		double n=x.disp();
	    System.out.println(n);
	}
}
