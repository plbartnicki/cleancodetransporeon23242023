package largesetofclasses.afterrefaactor;

public class GUIElementRendererLinuxStyle extends GUIElementRenderer
{
	public GUIElementRendererLinuxStyle(Widget renderElement)
	{
		super(renderElement);
	}

	public void render()
	{
		System.out.println("Started rendering in Linux style");
		System.out.println(renderElement.getWidgetRepresentation());
		System.out.println("Completed rendering in Linux style");
	}
}