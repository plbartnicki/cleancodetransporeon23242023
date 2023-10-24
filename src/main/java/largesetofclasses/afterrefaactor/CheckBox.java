package largesetofclasses.afterrefaactor;

public class CheckBox extends Widget
{
	public CheckBox(int x, int y)
	{
		super(x, y);
	}

	public String getWidgetRepresentation()
	{
		return String.format("CheckBox. x=%d y=%d", x, y);
	}
}
