import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpClient;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/18 15:57
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //获取参数
        Cookie[] cookies = req.getCookies();
        String username = "";
        String password = "";
        //获取cookie内容
        for (Cookie cookie : cookies) {
            if ("username".equals(cookie.getName())) {
                username = cookie.getValue();
            }
            if ("password".equals(cookie.getName())) {
                password = cookie.getValue();
            }
        }
        //如果能获取到内容
        if (username != null && !"".equals(username) && password != null && !"".equals(password)) {
            req.setAttribute("username", username);
            req.setAttribute("password", password);
            req.setAttribute("cookie", true);
            resp.sendRedirect("/homework/cookieTest1?username=" + username + "&password=" + password);
        }else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
            requestDispatcher.forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
