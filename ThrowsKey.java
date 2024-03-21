class ShyA
{
	void show() throws Exception
	{
		Class.forName("Test");
	}
}
	
class ThrowsKey	
{
	public static void main(String args[])
	{
	try
		{
			System.out.println("class found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
