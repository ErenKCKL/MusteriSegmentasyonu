package demo.ecommerce.dataAccess.abstracts;

import demo.ecommerce.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
