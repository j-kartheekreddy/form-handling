import javax.servlet.http.*; 
import javax.servlet.*; 
import java.io.*; 
public class ServletRequest extends HttpServlet{ 
public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException 
  {  
      
     PrintWriter pwriter=res.getWriter(); 
     String name = req.getParameter("uname");
     String contact= req.getParameter("cno");
     pwriter.println("!Welcome: "+name); 
     pwriter.println("Your Contact no: "+contact); 
     pwriter.close(); 
  }   
 }

