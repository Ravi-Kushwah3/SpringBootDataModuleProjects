package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "JPA_CUSTOMER_TAB")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CID")
	private Integer cno;
	
	@Column(name = "CNAME",length = 20)
	private String cname;
	
	@Column(name = "CADD",length = 20)
	private String caddrs;
	
	@Column(name = "BILLAMT")
	private Float billAmt;
	
}
	
