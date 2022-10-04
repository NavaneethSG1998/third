class Frnd
{
	void hot()
	{
      System.out.println(" tttttttta ");
	}
}
class rohith extends Frnd
{
	void hot()
    {
		System.out.println("gjjjjjj");
	}
}
class megha extends Frnd
{
	void hot()
	{
		System.out.println("ddoooooooooo");
	}
}
class manu extends Frnd
{
	void hot()
	{
		System.out.println("dccccccc");
	}
}
class oledu
{
	static void heroo(Frnd a1)
	{
          a1.hot();
    }
}
class mainclass
{
public static void main(String[] args) 
	{
		rohith h=new rohith();
		megha n=new megha();
		manu o=new manu();

		oledu.heroo(h);
		oledu.heroo(n);
		oledu.heroo(o);

	}
}
