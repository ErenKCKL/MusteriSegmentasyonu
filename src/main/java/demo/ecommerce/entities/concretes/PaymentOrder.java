package demo.ecommerce.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "PaymentOrder")
@Entity
@Data
public class PaymentOrder {

    @Id
    @ManyToOne
    @JoinColumn(name = "Payments")
    private Payment payment;

    @Id
    @ManyToOne
    @JoinColumn(name = "Orders_id")
    private Order order;
}
