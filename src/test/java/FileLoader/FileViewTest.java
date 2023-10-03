package FileLoader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileViewTest {

    @Test
    void deveRetornarHTMLLocal(){
        IFileLoader loader = new LocalFileLoader();
        loader.loadFile("/dir/arq.html");
        FileView view = new HTMLView(loader);
        view.renderFile();
        assertEquals("HTML: conteudo de /dir/arq.html", view.renderFile());
    }

    @Test
    void deveRetornarHTMLNetwork(){
        IFileLoader loader = new NetworkFileLoader();
        loader.loadFile("http://www.google.com/index.html");
        FileView view = new HTMLView(loader);
        view.renderFile();
        assertEquals("HTML: conteudo de http://www.google.com/index.html", view.renderFile());
    }

    @Test
    void deveRetornarPDFLocal(){
        IFileLoader loader = new LocalFileLoader();
        loader.loadFile("/dir/arq.pdf");
        FileView view = new PDFView(loader);
        view.renderFile();
        assertEquals("PDF: conteudo de /dir/arq.pdf", view.renderFile());
    }

    @Test
    void deveRetornarPDFNetwork(){
        IFileLoader loader = new NetworkFileLoader();
        loader.loadFile("http://www.google.com/arq.pdf");
        FileView view = new PDFView(loader);
        view.renderFile();
        assertEquals("PDF: conteudo de http://www.google.com/arq.pdf", view.renderFile());
    }

    @Test
    void deveRetornarImageNetwork(){
        IFileLoader loader = new NetworkFileLoader();
        loader.loadFile("http://www.google.com/arq.jpg");
        FileView view = new ImageView(loader);
        view.renderFile();
        assertEquals("Image: conteudo de http://www.google.com/arq.jpg", view.renderFile());
    }

}