package geekbrains.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class ProductRepository {
//    public Application.Product product;
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
