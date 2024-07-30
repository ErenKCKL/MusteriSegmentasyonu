package demo.ecommerce.api.controller;


import demo.ecommerce.business.concretes.PredictService;
import demo.ecommerce.dataAccess.abstracts.CustomerRepository;
import demo.ecommerce.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PredictService predictService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        int cluster = predictService.kmeansPredict(customer.getAnnualIncome(), customer.getSpendingScore());
        double spendingScore = predictService.regressionPredict(customer.getAnnualIncome());
        int spendingClass = predictService.classificationPredict(customer.getAnnualIncome(), customer.getAge());

        System.out.println("Cluster: " + cluster);
        System.out.println("Predicted Spending Score: " + spendingScore);
        System.out.println("Spending Class: " + spendingClass);

        return savedCustomer;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerRepository.findById(id).orElse(null);
    }
}