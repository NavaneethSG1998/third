class Sample 
{
	void disp(int a,int b,int c)
	{
		int d=a*b*c;
	    System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Sample x =new Sample(2,2,2);
		x.disp();
	}
}
