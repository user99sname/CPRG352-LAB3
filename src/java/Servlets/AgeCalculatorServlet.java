
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class AgeCalculatorServlet
*/
public class AgeCalculatorServlet extends HttpServlet {
/**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
* @see HttpServlet#HttpServlet()
*/ 
// Get requests
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       

        //This will load a JSP from the servlet.
        getServletContext().getRequestDispatcher("/WEB-INF/Agecalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        //capture both incoming parameters
        String age = request.getParameter("age");

           
        request.setAttribute("age", age);

        if (age == null || age.equals("")) {
            String message = "You must give your current age";

            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return; 
        }

                boolean isNum;
        try {
            Double.parseDouble(age);
            isNum = true;
        } catch (NumberFormatException e) {
            isNum = false;
        }

        if (!isNum) {
            String message = "You must enter a number";

            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return; 
        }
        
        int ageNum = Integer.parseInt(age);



        String message = "Your age next birthday will be " + (ageNum + 1);
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}