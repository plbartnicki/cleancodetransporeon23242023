package newlibrary.beforerefactor;

public class NewIOLibAdapter implements ISimpleIO{
    private final NewIOLib newIOLib;

    public NewIOLibAdapter(String path) {
        this.newIOLib = new NewIOLib(path);
    }

    @Override
    public void readFromFile() {
        newIOLib.scanFile();
    }
}
