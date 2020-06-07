package ro.fasttrackit.travel.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.travel.domain.Tourist;
import ro.fasttrackit.travel.exception.ResourceNotFoundException;
import ro.fasttrackit.travel.persistence.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Tourist> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Tourist getCustomerById(Integer customerId) {
        return getOrThrow(customerId);
    }

    public Tourist addCustomer(Tourist tourist) {
        return customerRepository.save(tourist);
    }

    public Tourist deleteCustomer(int customerId) {
        Tourist touristToDelete = getOrThrow(customerId);
        customerRepository.deleteById(customerId);
        return touristToDelete;
    }

    private Tourist getOrThrow(int customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find customer with id " + customerId));
    }
}
