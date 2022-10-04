class sample
{
	void sec(int r,int ti)
	{ 
		double area=r*r*ti*0.5;
        System.out.println(area);
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		 s.sec(6,60);

	}
}
