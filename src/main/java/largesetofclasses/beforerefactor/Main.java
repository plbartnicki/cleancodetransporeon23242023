package largesetofclasses.beforerefactor;

/*
	Abstraction - GUIElementRenderer
		AbstrType1 - GUIElementinLinuxStyle
			ConcreteImpl1_OfAbstrType_1 - ButtonLinux
			ConcreteImpl1_OfAbstrType_2 - CheckedBoxLinux

		AbstrType2 - GUIElementinWindowsStyle
			ConcreteImpl1_OfAbstrType_1 - ButtonWindows
			ConcreteImpl1_OfAbstrType_2 - CheckedWindows

		f(n, k) = 1 + n*k
 */

public class Main
{
	public static void main( String[] args )
	{
		GUIElementRenderer linuxButton = new ButtonLinux(101, 201);
		linuxButton.render();

		GUIElementRenderer windowsCheckBox = new CheckBoxWindows(51, 51);
		windowsCheckBox.render();
	}
}