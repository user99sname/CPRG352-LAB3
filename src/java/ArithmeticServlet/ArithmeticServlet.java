/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArithmeticServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alira
 */
public class ArithmeticServlet extends HttpServlet {

   
/**
* Servlet implementation class ArithmaticServlet
*/
@WebServlet("/ArithmaticServelt")
public class ArithmaticServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public ArithmaticServlet() {
super();
// TODO Auto-generated constructor stub
}

   /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // TODO Auto-generated method stub
       PrintWriter out=response.getWriter();
       response.setContentType("text/html");
       
       
      


       
       String s1=request.getParameter("no1");
       String s2=request.getParameter("no2");
    
               int add=Integer.parseInt(s1)+Integer.parseInt(s2);
       HttpSession session=request.getSession();
       session.setAttribute("add",add);
        out.print("result is:"+session.getAttribute("add")); 
      
         int sub=Integer.parseInt(s1)-Integer.parseInt(s2); 
         session.setAttribute("sub",sub); 
         out.print("result is:"+session.getAttribute("sub")); 
       
         int mult=Integer.parseInt(s1)*Integer.parseInt(s2); 
         session.setAttribute("mult",mult);
         out.print("result is:"+session.getAttribute("mult")); 
        
        int div=Integer.parseInt(s1)%Integer.parseInt(s2); 
         session.setAttribute("div",div);
         out.print("result is:"+session.getAttribute("div")); 
         
       RequestDispatcher rd=request.getRequestDispatcher("/arithmatic.jsp");
       rd.include(request, response);
   }

}
}
