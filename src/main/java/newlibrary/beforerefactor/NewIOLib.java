package newlibrary.beforerefactor;

//New library for reading the files - please, do not change the code here
public class NewIOLib
{
	private String  file;
		
	public NewIOLib(String file) {
		super();
		this.file = file;
	}

	public void scanFile() {
		System.out.println("Reading from " + file + " using new lib");		
	}
}
