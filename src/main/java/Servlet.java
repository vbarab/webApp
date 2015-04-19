import com.epam.vb.entity.Blog.factory.BlogFactory;

import com.epam.vb.entity.Blog.model.Blog;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet(name = "Servlet", urlPatterns = "/servlet")
@WebServlet("/register.jsp")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        super.doPost(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request,response);
   /*     Blog blog = BlogFactory.create();
        request.setAttribute("blog", blog);
        request.setAttribute("post",blog.getPostList());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
//TODO Count likes,vivod postov po date,vivod neudalennih , filetrs
        //TODO new class with static methods
        //TODO sort in servlet*/
    }
}
