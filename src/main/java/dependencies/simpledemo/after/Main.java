package dependencies.simpledemo.after;

public class Main
{
	public static void main( String[] args )
	{
		new DataProcessingServiceImpl(new DataStoringServiceImpl()).processData( "test" );
	}
}
