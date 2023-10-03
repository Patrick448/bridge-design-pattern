package FileLoader;

public class NetworkFileLoader implements IFileLoader{

    String contents;
    String url;

    @Override
    public void loadFile(String url) {
        this.url = url;
        this.contents = "conteudo de " + url;
    }

    public String getContents() {
        return contents;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
