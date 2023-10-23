import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.util.Optional;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/10/23 8:58
 */
public class UserListener implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        ServletContext sc = event.getSession().getServletContext();
        //获取统计人数
        int counter = (int) Optional.ofNullable(sc.getAttribute("counter")).orElse(0);
        counter++;
        sc.setAttribute("counter", counter);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        ServletContext sc = event.getSession().getServletContext();
        //获取统计人数
        int counter = (int) Optional.ofNullable(sc.getAttribute("counter")).orElse(0);
        if (counter == 0){
            return;
        }else {
            counter--;
            sc.setAttribute("counter", counter);
        }
    }
}
