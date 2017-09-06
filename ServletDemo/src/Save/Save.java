package Save;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Save
 */
@WebServlet("/Save")
public class Save extends HttpServlet {
	/*private static final long serialVersionUID = 1L;*/
	 public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {
	
		 	String n=req.getParameter("name");  
		    String l=req.getParameter("surname");  
		              
		    String w=n+" "+l;  
		    
		    PrintWriter out=res.getWriter();
		    out.println(w);
		     
     }  
    /**
     * @see HttpServlet#HttpServlet()
     */
    /*public Save() {
        super();
            // TODO Auto-generated constructor stub
    }*/

	
}
