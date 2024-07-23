package demo.ecommerce.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Payments")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int amount;
    private String status;
}
