package largesetofclasses.beforerefactor;


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