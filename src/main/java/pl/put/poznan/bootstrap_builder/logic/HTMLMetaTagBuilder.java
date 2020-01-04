package pl.put.poznan.bootstrap_builder.logic;

public class HTMLMetaTagBuilder implements HTMLBuilder {

    /**
     * Represents HTML which builder builds
     */
    private HTML html;

    /**
     * Represents StringBuilder in which creates HTML skeleton
     */
    private StringBuilder sb;

    /**
     * Creates a HTMLStaticHeaderBuilder
     * Inside creates new instance of StringBuilder and HTML class
     */
    public HTMLMetaTagBuilder() {
        sb = new StringBuilder();
        html = new HTML();
    }


    /**
     * Method that adds main tag with container class to skeleton
     */
    @Override
    public void addMainTag() {
        sb.append("<main class=\"container\"></main>\n");
    }

    @Override
    public void addTwitterMetaTag() {

    }

    @Override
    public void addOGMetaTag() {

    }

    @Override
    public void addMetaTag() {

    }

    /**
     * Method that adds HTML opening tag to skeleton
     */
    @Override
    public void addHTMLTag() {
        sb.append("<html>\n");
    }

    /**
     * Method that adds HTML closing tag to skeleton
     */
    @Override
    public void addHTMLClosingTag() {
        sb.append("</html>");
    }

    /**
     * Method that adds head opening tag to skeleton
     */
    @Override
    public void addHeadTag() {
        sb.append("<head>\n");
    }

    /**
     * Method that adds head closing tag to skeleton
     */
    @Override
    public void addHeadClosingTag() {
        sb.append("</head>\n\n");
    }

    /**
     * Method that adds body opening tag to skeleton
     */
    @Override
    public void addBodyTag() {
        sb.append("<body>\n");
    }

    /**
     * Method that adds body closing tag to skeleton
     */
    @Override
    public void addBodyClosingTag() {
        sb.append("</body>\n");
    }

    /**
     * Method that adds title opening and closing tag to skeleton
     */
    @Override
    public void addTitleTag() {
        sb.append("<title></title>\n");
    }

    /**
     * Method that adds Bootstrap tags to skeleton
     */
    @Override
    public void addBootstrapTag() {

    }

    /**
     * Empty method because footer tag isn't needed in this skeleton
     */
    @Override
    public void addFooterTag() {
    }

    /**
     * Empty method because header tag isn't needed in this skeleton
     */
    @Override
    public void addHeaderTag() {
    }

    @Override
    public HTML getHTML() {
        html.setHtmlSkeleton(sb.toString());
        html.setDescription("meta");
        return html;
    }
}
