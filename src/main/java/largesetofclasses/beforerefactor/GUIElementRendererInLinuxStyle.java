package largesetofclasses.beforerefactor;

//ok
public abstract class GUIElementRendererInLinuxStyle extends GUIElementRenderer
{
	protected GUIElementRendererInLinuxStyle(int x, int y)
	{
		super(x, y);
	}

	public void render()
	{
		System.out.println("Started rendering in Linux style");
	}
}