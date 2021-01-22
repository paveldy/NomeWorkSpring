package geekbrains.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Init implements CommandLineRunner {
//    @Autowired

    private final ProductRepository productRepository;
    public Init(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.add(new Product(1, "apple", 10));
        productRepository.add(new Product(2, "orange", 20));
        productRepository.add(new Product(3, "banana", 30));
        productRepository.add(new Product(4, "onion", 40));
        productRepository.add(new Product(5, "potatas", 50));

        productRepository.print();
        productRepository.printByID(3);
    }
}
