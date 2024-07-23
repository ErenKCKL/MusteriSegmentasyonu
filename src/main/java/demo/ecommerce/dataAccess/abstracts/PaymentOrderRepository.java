package demo.ecommerce.dataAccess.abstracts;

import demo.ecommerce.entities.concretes.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder, Integer> {
}
