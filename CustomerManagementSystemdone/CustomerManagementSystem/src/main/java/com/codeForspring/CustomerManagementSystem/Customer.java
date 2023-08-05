package com.codeForspring.CustomerManagementSystem;

public class Customer {
    String first_name;
    String last_name;
    String street;
    String address;
    String city;
    String state;
    String email;
    String phone;

     Customer(String first_name, String last_name, String phone, String email, String state, String city, String street, String address){
         this.address=address;
         this.city=city;
         this.street=street;
         this.email=email;
         this.phone=phone;
         this.first_name=first_name;
         this.last_name=last_name;
         this.state=state;

    }
}
