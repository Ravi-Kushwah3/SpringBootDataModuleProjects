package com.boot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.entity.Customer;
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
