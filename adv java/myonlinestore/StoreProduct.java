import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.sql.PreparedStatement;

public class StoreProduct extends HttpServlet
{
    public void service(HttpServletRequest request,HttpServletResponse response)
    {
        try{
            String prodid=request.getParameter("pid");
            String prodname=request.getParameter("pname");
            String prodcat=request.getParameter("pcat");
            int prodqty=Integer.parseInt(request.getParameter("qty"));

            //database connectivity
            String driver="com.mysql.cj.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/mystore";
            String username="root";
            String password="Anvesh1234#";

            Class.forName(driver);
            Connection con=DriverManager.getConnection(url,username,password);
            String qry="insert into  products values(?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(qry);
            stmt.setString(1,prodid);
            stmt.setString(2,prodname);
            stmt.setString(3,prodcat);
            stmt.setInt(4,prodqty);
           

            stmt.executeUpdate();

            con.close();


//send responce to the user
            PrintWriter out=response.getWriter();
            out.println("product id"+prodid);
            out.println("product name"+prodname);
            out.println("product cat"+prodcat);
            out.println("product qty"+prodqty);

            out.println("<br/><h1>Product Inserted Successfully...</h1>");
            

        }
        catch(Exception e)
        {
            System.out.println("Error is:"+e);
        }
    }
}