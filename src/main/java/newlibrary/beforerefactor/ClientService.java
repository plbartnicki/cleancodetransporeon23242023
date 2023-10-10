package newlibrary.beforerefactor;

public class ClientService
{
	//Let's assume there is a lot of methods like these methods below with the reference by ISimpleIO
	//and we don't want to change these methods
	public static void logicForFile( ISimpleIO freader)
	{
		System.out.println("additional logic...");
		freader.readFromFile();
	}
	
	public static void checkFile( ISimpleIO freader)
	{
		System.out.println("additional logic...");
		freader.readFromFile();
	}
}
