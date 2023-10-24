package largesetofclasses.afterrefaactor;

public class Button extends Widget
{
	public Button(int x, int y)
	{
		super(x, y);
	}

	public  String getWidgetRepresentation()
	{
		return String.format("Button. x=%d y=%d", x, y);
	}
}