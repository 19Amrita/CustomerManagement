package com.codeForspring.CustomerManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add-customer")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return new ResponseEntity<>("Successfully Created", HttpStatus.CREATED);
    }

    @GetMapping("/get-customer")
        public ResponseEntity<Customer> getCustomer_list(@RequestParam("email") String email){
            Customer c=customerService.getCustomer_list(email);
            if(c!=null){
                return new ResponseEntity<>(c,HttpStatus.FOUND);
            }else {
                return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
            }
        }

        @PutMapping("/update-customer")
    public ResponseEntity<Customer> updateCustomer(@RequestParam Customer customer){
        Customer customer1=customerService.update_customer(customer);
        if(customer1!=null){
            return new ResponseEntity<>(customer1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        }
        @DeleteMapping("/delete-customer")
    public ResponseEntity<String> deleteCustomer(@RequestParam("email") String email){
        String res=customerService.delete_customer(email);
        return new ResponseEntity<>("deleted Successfully",HttpStatus.OK);
        }

    }


