package com.boot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.entity.Customer;
import com.boot.service.CustomerServiceMgmtImpl;

@SpringBootApplication
public class BootJpaProj01CrudRepositotyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootJpaProj01CrudRepositotyApplication.class, args);
		
		CustomerServiceMgmtImpl custImpl = ctx.getBean(CustomerServiceMgmtImpl.class);
		Customer cust = new Customer();
		cust.setCname("Jack");
		cust.setCaddrs("UN");
		cust.setBillAmt(75000.0f);
		
		String result = custImpl.registerCustomer(cust);
		System.out.println(result);
		
		List<Customer> customers = List.of(new Customer("Atlas","Germany",45450.0f),
				                           new Customer("Micle","Canada",12500.0f));
		String customerGroup = custImpl.registerGroupOfCustomers(customers);
		System.out.println(customerGroup);
	}

}
