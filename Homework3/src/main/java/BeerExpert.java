import java.util.ArrayList;
import java.util.List;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/9/17 13:39
 */
public class BeerExpert {
    public List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if ("amber".equals(color)){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
