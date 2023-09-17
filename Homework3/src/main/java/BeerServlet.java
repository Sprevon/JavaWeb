import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/9/17 12:45
 */
@WebServlet(name = "BeerServlet", value = "/selectBeer")
public class BeerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String c = req.getParameter("color");
        BeerExpert beerExpert = new BeerExpert();
        List<String> result = beerExpert.getBrands(c);
        req.setAttribute("style", result);
        req.setAttribute("color", c);

        RequestDispatcher view = req.getRequestDispatcher("advice.jsp");
        view.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
