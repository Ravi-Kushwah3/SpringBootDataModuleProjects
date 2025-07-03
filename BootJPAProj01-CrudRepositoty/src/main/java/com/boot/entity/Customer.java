package com.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JPA_CUSTOMER_TAB")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CID")
	private Integer cno;
	
	@Column(name = "CNAME",length = 20)
	@NonNull
	private String cname;
	
	@Column(name = "CADD",length = 20)
	@NonNull
	private String caddrs;
	
	@Column(name = "BILLAMT")
	@NonNull
	private Float billAmt;
	
}
	
