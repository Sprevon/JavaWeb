import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Comments 输出数据库连接的Listener
 * @Author LeonBwChen
 * @Date 2023/10/16 10:38
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataBaseLoginUtil dbUtil =(DataBaseLoginUtil) getServletContext().getAttribute("DataBaseUtil");
        PrintWriter pw = resp.getWriter();
        pw.println(dbUtil.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
