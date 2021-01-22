import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
//    public Product product;
//    public int ID;
    HashMap<Integer, Product> map = new HashMap<>();

    public void add(Product product) {
        map.put(product.ID, product);

    }

    public void print() {
        for (Map.Entry<Integer, Product> pair : map.entrySet()) {
            Integer id = pair.getKey();
            Product product = pair.getValue();
            System.out.println(id + " " + product.name + " " + product.price);
        }
    }

    public void printByID(int ID) {
        for (Map.Entry<Integer, Product> pair : map.entrySet()) {
            Integer id = pair.getKey();
            if (id == ID) {
                Product product = pair.getValue();
                System.out.println(id + " " + product.name + " " + product.price);
            }
        }


    }
}
