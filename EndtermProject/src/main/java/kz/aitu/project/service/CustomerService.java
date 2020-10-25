package kz.aitu.project.service;

import kz.aitu.project.entity.Customer;
import kz.aitu.project.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;


@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public List<Customer> findById(long id) {
        return customerRepository.findById(id);
    }

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateById(Customer customer, long customerId) {
        return customerRepository.save(customer);
    }

    public void deleteById(long id) {
        customerRepository.deleteById(id);
    }

    @Transactional
    public Customer login(Customer customer) throws Exception {
        if (customer == null){
            throw new Exception();
        }
        String token = UUID.randomUUID().toString();
        customer.setToken(token);
        return customerRepository.save(customer);
        //return customerRepository.findByCustomerEmailAndCustomerPhone(customer.getCustomerEmail(), customer.getCustomerPhone());
    }

    public Customer getCustomerByToken(String token) {
        return customerRepository.findCustomerByToken(token);
    }

}
