class sample
{
	void mul(int a,int b,int c)
	{
        int d=a*b*c;
        System.out.println(d);
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		sample s =new sample();
		s.mul(2,2,2);

	}
}
