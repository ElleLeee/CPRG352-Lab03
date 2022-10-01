package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Elle
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstarithmetic = request.getParameter("first_arithmetic");
        String secondarithmetic = request.getParameter("second_arithmetic");
        String calculate = request.getParameter("calculate");
        
        request.setAttribute("firstArithmetic", firstarithmetic);
        request.setAttribute("secondArithmetic", secondarithmetic);
        
        if(firstarithmetic.equals("")||secondarithmetic.equals("")) {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        try {
            int first = Integer.parseInt(firstarithmetic);
            int second = Integer.parseInt(secondarithmetic);
            
            if(calculate.equals("+")){
                request.setAttribute("result", first + second);
            }
            else if(calculate.equals("-")){
                request.setAttribute("result", first - second);
            }
            else if(calculate.equals("*")){
                request.setAttribute("result", first * second);
            }
            else if(calculate.equals("%")){
                request.setAttribute("result", first % second);
            }
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        catch (NumberFormatException e){
            String error = "Invalid";
            request.setAttribute("error", error);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

    }
}