class emp 
{
	int a;
	int b;
	int c;
	emp(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	public static void main(String[] args) 
	{
		emp e=new emp(2,2,2);
	System.out.println(e.a);
	System.out.println(e.b);
	System.out.println(e.c);
	emp e1=new emp(3,5,2);
	System.out.println(e1.a);
	System.out.println(e1.b);
	System.out.println(e1.c);
	}

}
