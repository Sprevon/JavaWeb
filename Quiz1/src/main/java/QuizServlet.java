import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/9/13 20:32
 */
@WebServlet(name = "QuizServlet", value = "/quiz")
public class QuizServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受表单数据
        String quantity = Optional.ofNullable(req.getParameter("quantity")).orElse("0");
        String price = Optional.ofNullable(req.getParameter("price")).orElse("0");
        PrintWriter writer = resp.getWriter();

        //数据类型转换
        try{
            int quantityNumb = Integer.parseInt(quantity);
            double priceNumb = Double.parseDouble(price);
            //结果输出
            double total = quantityNumb * priceNumb;
            writer.write("total is: " + total);
        }catch (Exception e){
            writer.write("wrong data type!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
