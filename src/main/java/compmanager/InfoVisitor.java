package compmanager;

class InfoVisitor implements IComputerVisitor
{

	public void visit( Processor p )
	{
		System.out.println( "Infowizytor odwiedza procesor  Cena: " + p.getPrice( ) + ". Nazwa: " + p.getName( ) );
	}

	public void visit( RAM p )
	{
		System.out.println( "Infowizytor odwiedza RAM  Cena: " + p.getPrice( ) + ". Nazwa: " + p.getName( ) );
	}

	public void visit( Computer p )
	{
		System.out.println( "Infowizytor odwiedza komputer Cena: " + p.getPrice( ) + ". Nazwa: " + p.getName( ) );
	}
}
