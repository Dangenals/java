package kz.aitu.project.controller;

import kz.aitu.project.entity.Customer;
import kz.aitu.project.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @GetMapping("/api/customers")
    public ResponseEntity<?> getAllCustomers(){
        return ResponseEntity.ok(customerService.getAll());
    }

    @GetMapping("/api/customers/{customerId}")
    public ResponseEntity<?> getCustomerById(@PathVariable long customerId){
        return ResponseEntity.ok(customerService.findById(customerId));
    }

    @PostMapping("/api/customers")
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.create(customer));
    }

    @PutMapping("/api/customers/{customerId}")
    public ResponseEntity<?> updateCustomerById(@RequestBody Customer customer, @PathVariable long customerId){
        return ResponseEntity.ok(customerService.updateById(customer, customerId));
    }

    @DeleteMapping("/api/customers/{customerId}")
    public void deleteCustomerById(@PathVariable long customerId){
        customerService.deleteById(customerId);
    }

    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody Customer customer) throws Exception {
        try {
            return ResponseEntity.ok(customerService.login(customer));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @GetMapping("/api/customers/me")
    public ResponseEntity<?> getMe(@RequestHeader("Customer") String token){
        return ResponseEntity.ok(customerService.getCustomerByToken(token));
    }

}
