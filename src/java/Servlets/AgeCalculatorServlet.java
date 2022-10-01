package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("input_age");
        request.setAttribute("inputAge", age);
        if(age == null||age.equals("")){
            String message = "You must give your current age";
            request.setAttribute("message",message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
        
        try {
            int nextAge = Integer.parseInt(age) + 1;
            String s = "Your age next birthday will be ";
            request.setAttribute("result", nextAge);
            request.setAttribute("string", s);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        catch (NumberFormatException e) {
            String error_display = "You must enter a number.";
            request.setAttribute("errorDisplay", error_display);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
    }
}