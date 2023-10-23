package newlibrary.beforerefactor;

public class Main
{
	public static void main( String[] args )
	{
		//At some parts of the project we want to still use old library, so we want to keep it as it is
		OldFileReader oldFileReader = new OldFileReader();
		ClientService.logicForFile(oldFileReader);

		//Now, at the different parts of the same project, we want to use new library for reading the files
		//We cannot do it in the following way:
		NewIOLibAdapter newFileReader = new NewIOLibAdapter("c:\\test.txt");

		//robimy instancje newFileReader pewnej klasy
		ClientService.logicForFile(newFileReader);
		ClientService.checkFile(newFileReader);

		//So, your task is to find proffesional solution to pass the logic from NewIOLib to logicForFile(..) and checkFile(..)
		//without changing these methods
	}
}
