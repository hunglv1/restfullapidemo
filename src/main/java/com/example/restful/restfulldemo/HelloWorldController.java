package com.example.restful.restfulldemo;

import com.example.restful.entities.Customer;
import com.example.restful.serviceinterface.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping(value = "/getCustomerList", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getCustomerList() {
        List<Customer> customers = new CustomerService().initCustomerList();

        //using the below return, it's an another way to make a response
        //return new ResponseEntity<>(customers, HttpStatus.OK).getBody();

        return customers;
    }

    @PostMapping(value = "/searchCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> searchCustomer(@RequestParam int id, @RequestParam String name) {
        List<Customer> customers = new CustomerService().searchCustomerList(id, name);
        return customers;
    }
}
