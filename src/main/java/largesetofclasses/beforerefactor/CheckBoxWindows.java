package largesetofclasses.beforerefactor;

public class CheckBoxWindows extends GUIElementRendererInWindowsStyle
{
	public CheckBoxWindows(int x, int y)
	{
		super(x, y);
	}

	public void render()
	{
		super.render();
		System.out.println(String.format("CheckBox. x=%d y=%d", x, y));
		System.out.println("Completed rendering in Windows style");
	}
}
