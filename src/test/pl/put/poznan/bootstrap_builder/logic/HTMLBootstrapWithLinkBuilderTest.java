package pl.put.poznan.bootstrap_builder.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HTMLBootstrapWithLinkBuilderTest {


    private HTMLBootstrapWithLinkBuilder htmlBootstrapWithLinkBuilder;

    @Before
    public void setUp() {
        htmlBootstrapWithLinkBuilder =
                new HTMLBootstrapWithLinkBuilder();
    }

    //testing if main tag has been added to skeleton properly
    @Test
    public void addMainTag() {
        htmlBootstrapWithLinkBuilder.addMainTag();
        assertEquals("<main class=\"container\"></main>\n",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addLinkTag() {
        htmlBootstrapWithLinkBuilder.addLinkTag();
        assertEquals("<link rel=\"stylesheet\" type=\"text/css\" href=\"\">\n",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addTwitterMetaTag() {
        htmlBootstrapWithLinkBuilder.addTwitterMetaTag();
        assertEquals("",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addOGMetaTag() {
        htmlBootstrapWithLinkBuilder.addOGMetaTag();
        assertEquals("",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addMetaTag() {
        htmlBootstrapWithLinkBuilder.addMetaTag();
        assertEquals("",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHTMLTag() {
        htmlBootstrapWithLinkBuilder.addHTMLTag();
        assertEquals("<html>\n",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHTMLClosingTag() {
        htmlBootstrapWithLinkBuilder.addHTMLClosingTag();
        assertEquals("</html>",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHeadTag() {
        htmlBootstrapWithLinkBuilder.addHeadTag();
        assertEquals("<head>\n",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHeadClosingTag() {
        htmlBootstrapWithLinkBuilder.addHeadClosingTag();
        assertEquals("</head>\n\n",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addBodyTag() {
        htmlBootstrapWithLinkBuilder.addBodyTag();
        assertEquals("<body>\n",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addBodyClosingTag() {
        htmlBootstrapWithLinkBuilder.addBodyClosingTag();
        assertEquals("</body>\n",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addTitleTag() {
        htmlBootstrapWithLinkBuilder.addTitleTag();
        assertEquals("<title></title>\n",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

//    @Test
//    public void addBootstrapTag() {
//        htmlBootstrapBuilder.addBootstrapTag();
//        assertEquals("<main class=\"container\"></main>\n",
//                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
//    }

    @Test
    public void addFooterTag() {
        htmlBootstrapWithLinkBuilder.addFooterTag();
        assertEquals("",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHeaderTag() {
        htmlBootstrapWithLinkBuilder.addHeaderTag();
        assertEquals("",
                htmlBootstrapWithLinkBuilder.getHTML().getHtmlSkeleton());
    }

}
