package FileLoader;

public class ImageView extends FileView{
    public ImageView(IFileLoader loader) {
        super(loader);
    }

    @Override
    public String renderFile() {
        return "Image: " + loader.getContents();
    }
}
