package FileLoader;

public abstract class FileView {

    protected IFileLoader loader;

    public FileView(IFileLoader loader) {
        this.loader = loader;
    }

    public abstract String renderFile();

}
