package compmanager;

import java.util.ArrayList;
import java.util.List;

public class Computer extends Part implements IComputerElement
{
	private List<IComputerElement> elList = null;

	public Computer( String name, int price )
	{
		super( name, price );
		elList = new ArrayList<IComputerElement>( );
		elList.add( new Processor( "xx", 2000 ) );
		elList.add( new RAM( "ram", 1000 ) );
	}

	public void accept( IComputerVisitor v )
	{
		for ( IComputerElement el : elList )
		{
			//metoda accept mowi ze dany wizytor v moze odwiedzic część el (wywowalc odpowiednia implementacje metody visit)
			el.accept( v );  //kazda czesc w swojej definicji metody Accept wywola metode visit odpowiedniego vizytora
		}

		v.visit( this );  //to samo dla obiektu komputera
	}
}