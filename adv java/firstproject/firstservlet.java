import java.rmi.server.ServerCloneException;

import javax.servlet.http.*;
import java.io.*;
 public class firstservlet extends HttpServlet
 {
    
    public void service(HttpServletRequest request,HttpServletResponse responce){
        //PrintWriter Object
        try{
        PrintWriter out=responce.getWriter();
        //Create responce
        out.println("<html><body>welcome to first servlet java program Anvesh");
        }
        catch(Exception e){
            
        }
    }
}
