package compmanager;

class PriceChangerVisitor implements IComputerVisitor
{
	public void visit( Processor p )
	{
		p.setPrice( p.getPrice( ) * 2 );
	}

	public void visit( RAM p )
	{
		p.setPrice( p.getPrice( ) * 3 );
	}

	public void visit( Computer p )
	{
		p.setPrice( p.getPrice( ) * 4 );
	}
}