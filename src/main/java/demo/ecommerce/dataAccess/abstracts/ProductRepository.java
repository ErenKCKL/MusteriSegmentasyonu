package demo.ecommerce.dataAccess.abstracts;

import demo.ecommerce.entities.concretes.Order;
import demo.ecommerce.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
