package com.boot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.entity.Customer;
import com.boot.service.ICustomerServiceMgmt;

@SpringBootApplication
public class BootJpaProj01CrudRepositotyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootJpaProj01CrudRepositotyApplication.class, args);
		
		ICustomerServiceMgmt custService = ctx.getBean(ICustomerServiceMgmt.class);
	 	Customer cust = new Customer();
		cust.setCname("Jack");
		cust.setCaddrs("UN");
		cust.setBillAmt(75000.0f);
		
		String result = custService.registerCustomer(cust);
		System.out.println(result);
		
		List<Customer> customers = List.of(new Customer("Atlas","Germany",45450.0f),
				                           new Customer("Micle","Canada",12500.0f));
		String customerGroup = custService.registerGroupOfCustomers(customers);
		System.out.println(customerGroup);
		
		boolean isAvailable = custService.isCustomerAvailable(new Integer(202));
		if(isAvailable) {
			System.out.println("Customer Available");
		}else {
			System.out.println("Customer not Available");
		} 
		long count =  custService.getAllCustomerCount();
		System.out.println("Count of all customer : "+count);
		
		Iterable<Customer> it = custService.getAllCustomer();
		it.forEach(cust1 ->{System.out.println(cust1);}); // forEach method
		System.out.println("--------------------");     
		it.forEach(System.out::println);  // static method reference
		System.out.println("--------------------");     
		for(Customer cu: it) {            // Enhanced for loop
			System.out.println(cu);         
		} 
		
		String isAvailable1 = custService.getCustomerById(201);
		System.out.println(isAvailable1);
		
		Customer isAvailable2 = custService.findById(101);
		System.out.println(isAvailable2);
		
		Customer isAvailable3 = custService.fetchById(99);
		System.out.println(isAvailable3);
	}

}
