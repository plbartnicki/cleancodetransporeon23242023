package redundantcode.before;

public class Main
{
	public static void main( String[] args )
	{
		BService bService = new BService();
		System.out.println(bService.f( 2, 10, new double[]{ 1,2, 3, 4, 5, 6, 20, 30} ));

		CService cService = new CService();
		System.out.println(cService.f( 2, 10, new double[]{ 1,2, 3, 4, 5, 6, 20, 30} ));
	}
}
