class Apple
{
	public static void eat() 
	{
		System.out.println("eat..");
	}
	public void juice()
	{
		System.out.println("juice..");
		eat();
	}
}
class Bus
{
	public static void carry()
	{
		System.out.println("carry...");
		Bus b1=new Bus();
		b1.loadGoods();
	}
	public void loadGoods()
	{
		System.out.println("loadGoods...");
	}
}
class MainClass2
{
	public static void reading()
	{
		Bus.carry();
		System.out.println("raeding...");
	}
	public void write()
	{
		Apple a1=new Apple();
		a1.juice();
		System.out.println("write..");
	}
	public static void main(String[] args)
	{
		reading();
		MainClass2 m1=new MainClass2();
	    m1.write();
	}
}

	

