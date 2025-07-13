package com.boot.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.Customer;
import com.boot.repo.CustomerRepo;
@Service
public class CustomerServiceMgmtImpl implements ICustomerServiceMgmt {
	
	@Autowired
	private CustomerRepo custRepo;

	@Override
	public String registerCustomer(Customer cust) {
		 System.out.println("CustomerServiceMgmtImpl.registerCustomer()");
		 Customer cust1 = custRepo.save(cust);
		return "Customer is registerd successfully with id : "+cust1.getCno();
	}

	@Override
	public String registerGroupOfCustomers(List<Customer> custList) {
		Iterable<Customer> it = (Iterable) custRepo.saveAll(custList);
		List<Integer> listOfIds = (List<Integer>)((Collection)it).stream().map(c->((Customer)c).getCno()).collect(Collectors.toList());
 		return "Bulk of customers are registered with Id's : "+listOfIds;
	}

	@Override
	public boolean isCustomerAvailable(Integer id) {
		  boolean status = custRepo.existsById(id);
		return status;
	}

	@Override
	public long getAllCustomerCount() {
		 long count = custRepo.count();
		return count;
	}

	@Override
	public Iterable<Customer> getAllCustomer() {
		Iterable<Customer> it = custRepo.findAll();
		return it;
	}

	@Override
	public String getCustomerById(int id) {
		Optional<Customer> op = custRepo.findById(id);
		if (op.isPresent()) {
			return id + " customer details is available: " + op.get();
		} else {
			return id + " customer not found";
		}
	}

	@Override
	public Customer findById(int id) {

		return custRepo.findById(id).orElse(new Customer()); // defaul customer details if not found
	}

	@Override
	public Customer fetchById(int id) {

		return custRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("customer not found.")); // throw
																												// exception
	}

}
