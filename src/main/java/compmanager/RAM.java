package compmanager;

class RAM extends Part implements IComputerElement
{
	public RAM( String name, int price )
	{
		super( name, price );
	}

	public void accept( IComputerVisitor v )
	{
		v.visit( this );
	}
}


