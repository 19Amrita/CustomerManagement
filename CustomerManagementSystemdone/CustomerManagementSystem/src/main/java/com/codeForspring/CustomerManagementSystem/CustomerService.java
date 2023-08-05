package com.codeForspring.CustomerManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String addCustomer(Customer customer){
        String res=customerRepository.createCustomer(customer);
        return res;
    }

    public Customer getCustomer_list(String email){
        Customer customer=customerRepository.getCustomer_list(email);
        return customer;
    }
    public Customer update_customer(Customer customer){
        Customer c=customerRepository.updateCustomer(customer);
        return c;
    }
    public String delete_customer(String email){
        String ans=customerRepository.deleteCustomer(email);
        return ans;
    }
}
