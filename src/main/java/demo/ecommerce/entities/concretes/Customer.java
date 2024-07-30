package demo.ecommerce.entities.concretes;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "annual_income")
    private double annualIncome;

    @Column(name = "spending_score")
    private double spendingScore;

    @Column(name = "age")
    private int age;;
}
