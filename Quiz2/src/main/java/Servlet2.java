import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/14 8:04
 */
@WebServlet(name = "Servlet2", value = "/quiz22")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String welcome = getInitParameter("welcome");
        String name = getInitParameter("name");
        PrintWriter pw = resp.getWriter();
        pw.println(welcome);
        pw.println(name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
