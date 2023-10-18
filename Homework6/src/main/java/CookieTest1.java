import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/18 15:06
 */
public class CookieTest1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        //获取参数
        String username = (String) req.getParameter("username");
        String password = (String) req.getParameter("password");
        String save = req.getParameter("save");
        pw.println("welcome user, " + username);
        //允许保存时
        if ("yes".equals(save)) {
            Cookie usernameCookie = new Cookie("username", username);
            usernameCookie.setMaxAge(60);
            Cookie passwordCookie = new Cookie("password", password);
            passwordCookie.setMaxAge(60);
            resp.addCookie(usernameCookie);
            resp.addCookie(passwordCookie);
        }
        pw.println("<br>");
        pw.println("<a href = \"/homework/loginServlet\">go back to login</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
