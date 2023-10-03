package FileLoader;

public class HTMLView extends FileView{
    public HTMLView(IFileLoader loader) {
        super(loader);
    }

    @Override
    public String renderFile() {
        return "HTML: " + loader.getContents();
    }
}
