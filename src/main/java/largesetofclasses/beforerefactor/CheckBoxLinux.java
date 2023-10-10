package largesetofclasses.beforerefactor;


public class CheckBoxLinux extends GUIElementRendererInWindowsStyle
{
	public CheckBoxLinux(int x, int y)
	{
		super(x, y);
	}

	public void render()
	{
		super.render();
		System.out.println(String.format("CheckBox. x=%d y=%d", x, y));
		System.out.println("Completed rendering in Linux style");
	}
}

