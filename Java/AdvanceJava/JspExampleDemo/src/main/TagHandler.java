import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport {
    @Override
    public int doStartTag() throws JspException {
        try{
            JspWriter out = pageContext.getOut();
            out.print("<h2>this is my custom tag</h2>");

        }catch (Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
