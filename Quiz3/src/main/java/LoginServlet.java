import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
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
        String username;
        String password;
        HttpSession httpSession = req.getSession();
        if (httpSession.isNew()){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index2.html");
            requestDispatcher.forward(req, resp);
        }else {
            username = (String) httpSession.getAttribute("username");
            password = (String) httpSession.getAttribute("password");
            req.setAttribute("username", username);
            req.setAttribute("password", password);
            resp.sendRedirect("/quiz/cookieTest1?username=" + username + "&password=" + password);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
