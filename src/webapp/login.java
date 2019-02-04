package webapp;

import applayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        applayer.User u=new User();
        String name=request.getParameter("loginname");
        String password=request.getParameter("password");
        request.setAttribute("username",name);
        request.setAttribute("password",password);
        if(u.isValidUserCridentials(name,password)){
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        }
        else
        {
            request.setAttribute("Errormessage","Invalid login");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

}
