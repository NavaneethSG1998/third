class Gali
{
	void hot()
	{
      System.out.println("galiyali galiyali");
	}
}
class h2o extends Gali
{
	void hot()
    {
		System.out.println("aaaaaaaaaaaaaaa");
	}
}
class nh2 extends Gali
{
	void hot()
	{
		System.out.println("ssssssssss");
	}
}
class o2 extends Gali
{
	void hot()
	{
		System.out.println("eeeeeeeeeeeee");
	}
}
class oledu 
{
	static void heroo(Gali a1)
	{
          a1.hot();
    }
}
class mainclass
{
public static void main(String[] args) 
	{
		h2o h=new h2o();
		nh2 n=new nh2();
		o2 o=new o2();

		oledu.heroo(h);
		oledu.heroo(n);
		oledu.heroo(o);

	}
}
