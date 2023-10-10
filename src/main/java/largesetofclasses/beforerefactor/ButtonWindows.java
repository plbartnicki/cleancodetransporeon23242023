package largesetofclasses.beforerefactor;


public class ButtonWindows extends GUIElementRendererInWindowsStyle
{
	public ButtonWindows(int x, int y)
	{
		super(x, y);
	}

	public  void render()
	{
		super.render();
		System.out.println(String.format("Button. x=%d y=%d}", x, y));
		System.out.println("Completed rendering in Windows style");
	}
}
