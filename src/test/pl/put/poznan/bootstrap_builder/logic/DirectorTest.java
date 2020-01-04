package pl.put.poznan.bootstrap_builder.logic;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class DirectorTest {


//    private HTML htmlFooter = new HTML();
//    private HTML htmlStatic = new HTML();
//    private HTML htmlFixed = new HTML();
//    private HTML html = new HTML();


//    @Before
//    public void setUp() throws Exception {
//
//    }

    @Test
    public void constructHTML() {
        //setting object that mock will return
        HTML htmlFooter = new HTML();
        htmlFooter.setDescription("footer");
//        htmlFooter.setHtmlSkeleton("<html>\n" +
//                "<head>\n" +
//                "<meta name=\"description\" content=\"\" />\n" +
//                "<meta name=\"url\" content=\"\">\n" +
//                "<meta name=\"robots\" content=\"\" />\n" +
//                "<title></title>\n" +
//                "</head>\n\n" +
//                "<body>\n" +
//                "<main class=\"container\"></main>\n" +
//                "<body>\n" +
//                "</html>");

        //Testing htmlFooterBuilder using mocks
        HTMLBuilder htmlFooterBuilder = mock(HTMLFooterBuilder.class);
        when(htmlFooterBuilder.getHTML()).thenReturn(htmlFooter);
//        InOrder inOrder = inOrder(htmlFooterBuilder);
//
//        inOrder.verify(htmlFooterBuilder).addHTMLTag();
//        inOrder.verify(htmlFooterBuilder).addHeadTag();
//        inOrder.verify(htmlFooterBuilder).addMetaTag();
//        inOrder.verify(htmlFooterBuilder).addTitleTag();
//        inOrder.verify(htmlFooterBuilder).addHeadClosingTag();
//        inOrder.verify(htmlFooterBuilder).addBodyTag();
//        inOrder.verify(htmlFooterBuilder).addMainTag();
//        inOrder.verify(htmlFooterBuilder).addBodyClosingTag();
//        inOrder.verify(htmlFooterBuilder).addHTMLClosingTag();
//        inOrder.verify(htmlFooterBuilder).getHTML();

        Director director = new Director(htmlFooterBuilder);
        HTML result = director.constructHTML();

        verify(htmlFooterBuilder).getHTML();
        assertEquals(result.getHtmlSkeleton(), htmlFooter.getHtmlSkeleton());

    }
}
