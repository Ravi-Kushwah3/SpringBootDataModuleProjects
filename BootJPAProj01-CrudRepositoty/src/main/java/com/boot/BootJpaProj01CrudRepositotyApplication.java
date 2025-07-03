package com.boot;

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
		cust.setCname("Alon");
		cust.setCaddrs("UK");
		cust.setBillAmt(70000.0f);
		
		String result = custImpl.registerCustomer(cust);
		System.out.println(result);
	}

}
