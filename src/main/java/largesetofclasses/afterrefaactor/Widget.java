package largesetofclasses.afterrefaactor;

public abstract class Widget
{
	protected int x,  y;

	protected Widget(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public abstract String getWidgetRepresentation();
}