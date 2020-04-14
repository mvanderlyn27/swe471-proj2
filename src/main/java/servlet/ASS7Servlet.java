package servlet;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/"}
    )

public class HelloServlet extends HttpServlet
{
  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    
    String URL = "https://ass7swe432.herokuapp.com/results/?";
    URL+="Comments="+req.getParameter("Comments")+"&";
    URL+="last_name="+req.getParameter("last_name")+"&";
    URL+="building="+req.getParameter("building")+"&";
    URL+="number="+req.getParameter("number")+"&";
    URL+="Date of Visit="+req.getParameter("Date of Visit")+"&";
    URL+="first_name="+req.getParameter("first_name")+"&";
    URL+="email="+req.getParameter("email");
    resp.sendRedirect(URL);
    }
}
