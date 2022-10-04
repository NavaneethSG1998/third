class sample
{
	double para()
	{
        int b=6;
		int h=6;
		double area=b*h;
        return area;
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 double x=s.para();
		 System.out.println(x);

	}
}
