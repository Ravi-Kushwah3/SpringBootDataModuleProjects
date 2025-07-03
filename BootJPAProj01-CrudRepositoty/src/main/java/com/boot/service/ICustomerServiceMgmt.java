package com.boot.service;

import org.springframework.stereotype.Component;

import com.boot.entity.Customer;

@Component
public interface ICustomerServiceMgmt {
	public String registerCustomer(Customer cust);

}
