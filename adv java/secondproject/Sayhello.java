import javax.servlet.http.*;
import java.io.*;

public class Sayhello extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        try{
            PrintWriter out=response.getWriter();
            out.println("<h1>hello Anvesh project</h1>");

        }
        catch(Exception e)
        {}
    }
}