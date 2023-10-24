package largesetofclasses.afterrefaactor;

public class GUIElementRendererInWindowsStyle extends GUIElementRenderer
{
	public GUIElementRendererInWindowsStyle(Widget renderElement)
	{
		super(renderElement);
	}

	public void render()
	{
		System.out.println("Started rendering in Windows style");
		System.out.println(renderElement.getWidgetRepresentation());
		System.out.println("Completed rendering in Windows style");
	}
}
