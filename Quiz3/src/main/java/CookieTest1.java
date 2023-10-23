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
        resp.setCharacterEncoding("GBK");
        PrintWriter pw = resp.getWriter();
        HttpSession httpSession = req.getSession();
        //获取参数
        String username = (String) req.getParameter("username");
        String password = (String) req.getParameter("password");
        String save = req.getParameter("save");
        pw.println("欢迎你，" + username);
        //允许保存时
        if ("yes".equals(save)) {
            httpSession.setAttribute("username", username);
            httpSession.setAttribute("password", password);
        }
        pw.println("<br>");
        pw.println("<a href = \"\">添加信息</a>");
        //如果是管理员
        if ("admin".equals(username)) {
            pw.println("<br><a href = \"\">删除信息</a>");
        }
        pw.println("<br><a href = \"\">修改信息</a>");
        pw.println("<br><a href = \"/quiz/reLogServlet\">重新登录</a>");
        pw.println("<br><a href = \"/quiz/logoutServlet\">退出</a>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
