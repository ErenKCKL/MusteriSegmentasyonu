package demo.ecommerce.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
}
