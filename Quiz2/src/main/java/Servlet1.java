import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

/**
 * @Comments 第一题Servlet
 * @Author LeonBwChen
 * @Date 2023/10/14 8:04
 */
@WebServlet(name = "Servlet1", value = "/quiz21")
public class Servlet1 extends HttpServlet {
    /**
     * 对计算请求进行处理，传入shape, length两个参数
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据
        String type = Optional.ofNullable(req.getParameter("shape")).orElse("");
        double length = Double.parseDouble(Optional.ofNullable(req.getParameter("length")).orElse("0"));
        //判断并计算
        double cover = 0;
        if ("circle".equals(type)){
            cover = Math.PI * length * length;
        }else {
            cover = length * length;
        }
        //写入并返回
        PrintWriter w = resp.getWriter();
        w.println("Output:" + cover);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
