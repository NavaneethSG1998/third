class Flower
{
	void hot()
	{
      System.out.println(" vasane ");
	}
}
class rose extends Flower
{
	void hot()
    {
		System.out.println("agergergergegea");
	}
}
class lilly extends Flower
{
	void hot()
	{
		System.out.println("svvfdbdfbd");
	}
}
class jasmin extends Flower
{
	void hot()
	{
		System.out.println("efdfdbfbbfde");
	}
}
class oledu
{
	static void heroo(Flower a1)
	{
          a1.hot();
    }
}
class mainclass
{
public static void main(String[] args) 
	{
		rose h=new rose();
		lilly n=new lilly();
		jasmin o=new jasmin();

		oledu.heroo(h);
		oledu.heroo(n);
		oledu.heroo(o);

	}
}
