class hot
{
  void air()
	{
	  System.out.println("Hello World!");
	}
}
class cold extends hot
{
	void coold()
	{
		System.out.println("Hello java");
	}
}
class mainclass
{
	public static void main(String[] args) 
	{
		hot v=new cold();
		v.air();
		cold f=(cold)v;
		f.coold();
		f.air();
	}
}
