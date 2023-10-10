package largesetofclasses.beforerefactor;


public abstract class GUIElementRendererInWindowsStyle extends GUIElementRenderer
{
	protected GUIElementRendererInWindowsStyle(int x, int y) {
		super(x, y);
	}

	public void render()
	{
		System.out.println("Started rendering in Windows style");
	}
}