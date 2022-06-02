
package AgeCalculatorServlet;

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
* Servlet implementation class AgeCalculatorServlet
*/
@WebServlet("/AgeCalculatorServlet")
public class AgeCalculatorServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public AgeCalculatorServlet() {
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
       response.setContentType("text/html");
       try (PrintWriter out = response.getWriter()) {
           String a=request.getParameter("age");
           //System.out.println("your age is"+i);
           
           if(a.equals("")||a==null){
               out.print("You must enter a number");
               RequestDispatcher rd=request.getRequestDispatcher("/agecalculator.jsp");
               rd.include(request, response);
           }
           else{
               int i=Integer.parseInt(a);
               i=i+1;
               HttpSession session =request.getSession();
               session.setAttribute("nextage",i);
               RequestDispatcher rd=request.getRequestDispatcher("/agecalculator.jsp");
               rd.include(request, response);
               session.invalidate();
               
           }          out.print("");
           
       }
      
   }

}