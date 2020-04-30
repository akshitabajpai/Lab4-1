package com.cg.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ProductData")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_seq")
	@SequenceGenerator(sequenceName = "pk_seq", allocationSize = 1, name = "pk_seq")
	@Column
	private int productid;
	@Column
	private String productName;
	
	private double productcost;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductcost() {
		return productcost;
	}

	public void setProductcost(double productcost) {
		this.productcost = productcost;
	}
}
