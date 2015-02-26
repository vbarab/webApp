import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        {
            final Writer writer = new Writer() {
                @Override
                public void write(char[] cbuf, int off, int len) throws IOException {

                }

                @Override
                public void flush() throws IOException {

                }

                @Override
                public void close() throws IOException {

                }
            };
            writer.write("asdasd");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
