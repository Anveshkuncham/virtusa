import javax.servlet.http.*;
import java.io.*;

public class Sayhai extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        try{
            PrintWriter out=response.getWriter();
            out.println("<h1>hai Anvesh</h1>");

        }
        catch(Exception e)
        {}
    }
}