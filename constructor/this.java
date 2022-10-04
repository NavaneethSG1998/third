class nav
{
	String name;
	int mbno;
	String address;
	nav(String name,int mbno,String address)
	{
		this.name=name;
		this.mbno=mbno;
		this.address=address;
	}
	public static void main(String[] args) 
	{
		nav x=new nav("navaneeth",94498,"sagar");
		System.out.println(x.name);
		System.out.println(x.mbno);
		System.out.println(x.address);
		nav x1=new nav("bala",94498,"shivamogga");
		System.out.println(x1.name);
		System.out.println(x1.mbno);
		System.out.println(x1.address);
	}
}
