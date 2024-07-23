package demo.ecommerce.dataAccess.abstracts;

import demo.ecommerce.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
