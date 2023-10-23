package compmanager;

//Part, IComputerElement, Procesor, RAM, Computer, IComputerVisitor, InfoVisitor, PriceChangerVisitor, Main

class Main
{
	public static void main( String[] args )
	{
		Computer comp = new Computer( "yyy", 4000 );
		InfoVisitor iv = new InfoVisitor( );
		PriceChangerVisitor pcv = new PriceChangerVisitor( );
		comp.accept( iv );
		comp.accept( pcv );
		comp.accept( iv );
	}
}

