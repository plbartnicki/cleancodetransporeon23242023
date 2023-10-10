package taxes.beforerefactor;

public class Main
{
	private static TaxComputeService taxComputeService = new TaxComputeService();

	public static void main( String[] args )
	{
		try
		{
			taxComputeService.computeTax( TaxType.PL, 100 );
		}
		catch ( IncorrectArgumentException e )
		{
			System.out.println(e);
		}
	}
}
