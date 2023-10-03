package FileLoader;

public class PDFView extends FileView{
    public PDFView(IFileLoader loader) {
        super(loader);
    }

    @Override
    public String renderFile() {
        return "PDF: " + loader.getContents();
    }
}
