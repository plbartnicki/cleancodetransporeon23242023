package newlibrary.beforerefactor;

public class OldFileReader implements ISimpleIO
{
	private String path;
	
	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void readFromFile() {
		System.out.println("Reading from " + path + " using old lib");
	}
}
