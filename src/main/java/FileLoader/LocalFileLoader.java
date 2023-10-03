package FileLoader;

public class LocalFileLoader implements IFileLoader{

    String contents;
    String path;

    @Override
    public void loadFile(String path) {
        this.path = path;
        this.contents = "conteudo de " + path;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
