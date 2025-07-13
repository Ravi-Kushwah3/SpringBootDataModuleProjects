package com.boot.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.boot.entity.Customer;

@Component
public interface ICustomerServiceMgmt {
	public String registerCustomer(Customer cust);
	public String registerGroupOfCustomers(List<Customer> custList);
	public boolean isCustomerAvailable(Integer id);
	public long getAllCustomerCount();
	public Iterable<Customer> getAllCustomer();
	public String getCustomerById(int id);
	public Customer findById(int id);
	public Customer fetchById(int id);

}
