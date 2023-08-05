package com.codeForspring.CustomerManagementSystem;


import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class CustomerRepository {

    public HashMap<String, Customer>map= new HashMap<>();
    public String createCustomer(Customer customer){
        String key=customer.email;
        map.put(key,customer);
        return "Successfully created";
    }
    public Customer getCustomer_list(String email){
        if (map.containsKey(email)) {

            return map.get(email);
        }else{
            return null;
        }
    }

    public Customer updateCustomer(Customer customer){
        Customer c=map.put(customer.email,customer);
        return c;
    }

    public String deleteCustomer(String email){
        if(map.containsKey(email)){
            map.remove(email);
        }else{
            return "not found";
        }
        return "Successfully deleted";
    }
}
