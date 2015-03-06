import com.epam.vb.entity.Blog.factory.BlogFactory;
import com.epam.vb.entity.Blog.factory.PostFactory;
import com.epam.vb.entity.Blog.model.Blog;
import com.epam.vb.entity.Blog.model.Post;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet",urlPatterns = "/servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Blog blog = BlogFactory.createBlog();
      //  Blog blog = BlogFactory.createPoliticBlog();
        Post post = PostFactory.createRandomPost();
        request.setAttribute("blog",blog);
        request.setAttribute("post",post);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request,response);
//TODO Count likes,vivod postov po date,vivod neudalennih , filetrs
        //TODO new class with static methods
        //TODO sort in servlet
        //TODO deleted
    }
}
