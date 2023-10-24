package largesetofclasses.afterrefaactor;

public abstract class GUIElementRenderer
{
	protected Widget renderElement;

	protected GUIElementRenderer(Widget renderElement)
	{
		this.renderElement = renderElement;
	}

	public abstract void render();
}