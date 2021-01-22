import org.springframework.stereotype.Component;

@Component
public class Product {

    public String name;
    public int ID;
    public long price;

    public Product(int ID,String name,long price){
        this.ID =ID;
        this.name =name;
        this.price =price;

    }

}
