package pl.put.poznan.bootstrap_builder.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


public class HTMLBootstrapBuilderTest {

    private HTMLBootstrapBuilder htmlBootstrapBuilder;

    @Before
    public void setUp() {
        htmlBootstrapBuilder =
                new HTMLBootstrapBuilder();
    }

    //testing if main tag has been added to skeleton properly
    @Test
    public void addMainTag() {
        htmlBootstrapBuilder.addMainTag();
        assertEquals("<main class=\"container\"></main>\n",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addLinkTag() {
        htmlBootstrapBuilder.addLinkTag();
        assertEquals("",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addTwitterMetaTag() {
        htmlBootstrapBuilder.addTwitterMetaTag();
        assertEquals("",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addOGMetaTag() {
        htmlBootstrapBuilder.addOGMetaTag();
        assertEquals("",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addMetaTag() {
        htmlBootstrapBuilder.addMetaTag();
        assertEquals("",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHTMLTag() {
        htmlBootstrapBuilder.addHTMLTag();
        assertEquals("<html>\n",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHTMLClosingTag() {
        htmlBootstrapBuilder.addHTMLClosingTag();
        assertEquals("</html>",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHeadTag() {
        htmlBootstrapBuilder.addHeadTag();
        assertEquals("<head>\n",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHeadClosingTag() {
        htmlBootstrapBuilder.addHeadClosingTag();
        assertEquals("</head>\n\n",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addBodyTag() {
        htmlBootstrapBuilder.addBodyTag();
        assertEquals("<body>\n",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addBodyClosingTag() {
        htmlBootstrapBuilder.addBodyClosingTag();
        assertEquals("</body>\n",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addTitleTag() {
        htmlBootstrapBuilder.addTitleTag();
        assertEquals("<title></title>\n",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

//    @Test
//    public void addBootstrapTag() {
//        htmlBootstrapBuilder.addBootstrapTag();
//        assertEquals("<main class=\"container\"></main>\n",
//                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
//    }

    @Test
    public void addFooterTag() {
        htmlBootstrapBuilder.addFooterTag();
        assertEquals("",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }

    @Test
    public void addHeaderTag() {
        htmlBootstrapBuilder.addHeaderTag();
        assertEquals("",
                htmlBootstrapBuilder.getHTML().getHtmlSkeleton());
    }


}
