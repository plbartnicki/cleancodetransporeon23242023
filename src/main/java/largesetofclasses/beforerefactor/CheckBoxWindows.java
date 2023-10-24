package largesetofclasses.beforerefactor;


//	Abstraction ~ GUIElementRenderer
//			AbstrType1 ~ GUIElementRendererInLinuxStyle
	//			ConcreteImpl1_OfAbstrType_1 ~ ButtonLinux
	//			ConcreteImpl1_OfAbstrType_2 ~ CheckBoxLinux
//
//			AbstrType2 ~ GUIElementRendererInWindowsStyle
	//			ConcreteImpl1_OfAbstrType_1 ~ ButtonWindows
	//			ConcreteImpl1_OfAbstrType_2 ~ CheckBoxWindows

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
