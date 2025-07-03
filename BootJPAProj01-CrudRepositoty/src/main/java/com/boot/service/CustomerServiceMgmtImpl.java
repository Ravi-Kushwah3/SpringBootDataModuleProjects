package com.boot.service;

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

}
