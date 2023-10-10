package largesetofclasses.beforerefactor;

public abstract class GUIElementRenderer
{
	protected int x, y;

	protected GUIElementRenderer(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public abstract void render();
}
