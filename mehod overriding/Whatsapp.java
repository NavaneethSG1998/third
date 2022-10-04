class whatsappv1 
{
	void status()
	{
      System.out.println("able to uplod send phots");
	}
}
class whatsappv2 extends whatsappv1
{
	void status()
	{
		System.out.println("able to uplod send photo,video,mog,gif,song");
	}
}
class mainclass
{
    public static void main(String[] args) 
	{
		whatsappv2 x=new whatsappv2();
			x.status();
	}
}
