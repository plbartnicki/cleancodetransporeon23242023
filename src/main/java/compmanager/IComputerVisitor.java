package compmanager;

public interface IComputerVisitor
{
	void visit( Processor p );

	void visit( RAM p );

	void visit( Computer p );
}
