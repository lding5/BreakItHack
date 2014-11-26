import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class Greetings extends HttpServletRequest {
 
    private int hitCounter = 0;
 
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException
    {
        response.setContentType("text/html");
        // This output stream goes to the browser
        PrintWriter out = response.getWriter();
 
        out.println("");
        out.println("");
        out.println("<title>Greetings Hits Page</title>");
        out.println("");
        out.println("");
 
        out.println("<h1>Hello everyone!</h1>");
        hitCounter++;
        out.println("<p>I have now said "+hitCounter+" greetings.");
        out.println("");
        out.println("");
    }
}