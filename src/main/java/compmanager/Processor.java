package compmanager;

class Processor extends Part implements IComputerElement
{
	public Processor( String name, int price )
	{
		super( name, price );
	}

	public void accept( IComputerVisitor v )
	{
		v.visit( this );
	}
}

