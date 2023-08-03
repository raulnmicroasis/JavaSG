package com.skynet.javafx.models.repositories;

import org.springframework.data.repository.CrudRepository;
import com.skynet.javafx.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    
}
