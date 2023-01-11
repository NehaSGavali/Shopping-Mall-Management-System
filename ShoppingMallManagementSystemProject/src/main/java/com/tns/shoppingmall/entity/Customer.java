package com.tns.shoppingmall.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name="custId")
	private int custId;
	
	@Column(name="custName")
	private String custName;
	//private OrderDetails orderId;
	
	@Column(name="custPhone")
	private String custPhone;
	
	@Column(name="custEmail")
	private String custEmail;

	@OneToMany(mappedBy="customer")
	private List<OrderDetails> orderdetails;
	
	public Customer(int custId, String custName, String custPhone, String custEmail) {
		
		this.custId = custId;
		this.custName = custName;
		this.custPhone = custPhone;
		this.custEmail = custEmail;
	}

	public Customer() {
	
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPhone=" + custPhone + ", custEmail="
				+ custEmail + ", getCustId()=" + getCustId() + ", getCustName()=" + getCustName() + ", getCustPhone()="
				+ getCustPhone() + ", getCustEmail()=" + getCustEmail() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
