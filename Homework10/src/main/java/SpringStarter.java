import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/12/17 18:00
 */
public class SpringStarter {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        SpringBean springBean= context.getBean("springBean", SpringBean.class);
        InnerBean innerBean = springBean.getInnerBean();
        System.out.println("SpringBean name: " + springBean.getSpringBeanName());
        System.out.println("InnerBean name: " + innerBean.getInnerBeanName());
    }
}
