package demo.ecommerce.dataAccess.abstracts;

import demo.ecommerce.entities.concretes.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
