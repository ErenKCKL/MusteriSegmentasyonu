package demo.ecommerce.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "Products_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "Customers_id")
    private Customer customer;
}
