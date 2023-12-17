/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/12/17 18:00
 */
public class SpringBean {
    private String springBeanName;
    private InnerBean innerBean;

    public SpringBean(String springBeanName, InnerBean innerBean) {
        this.springBeanName = springBeanName;
        this.innerBean = innerBean;
    }

    public String getSpringBeanName() {
        return springBeanName;
    }

    public void setSpringBeanName(String springBeanName) {
        this.springBeanName = springBeanName;
    }

    public InnerBean getInnerBean() {
        return innerBean;
    }

    public void setInnerBean(InnerBean innerBean) {
        this.innerBean = innerBean;
    }
}
