class Movie
{
	void hot()
	{
      System.out.println(" 333333 ");
	}
}
class mungaru extends Movie
{
	void hot()
    {
		System.out.println("77777");
	}
}
class kalasi extends Movie
{
	void hot()
	{
		System.out.println("555555");
	}
}
class chittara extends Movie
{
	void hot()
	{
		System.out.println("7783535");
	}
}
class oledu
{
	static void heroo(Movie a1)
	{
          a1.hot();
    }
}
class mainclass
{
public static void main(String[] args) 
	{
		mungaru h=new mungaru();
		kalasi n=new kalasi();
		chittara o=new chittara();

		oledu.heroo(h);
		oledu.heroo(n);
		oledu.heroo(o);

	}
}
