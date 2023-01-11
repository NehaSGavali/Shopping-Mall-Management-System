package com.tns.shoppingmall.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="orderdetails")
public class OrderDetails {
	
	@Id
	@Column(name="")
	private int odId;
	
	@Column(name="oddateOfPurchase")
	private LocalDateTime oddateOfPurchase;
	
	@Column(name="odTotal")
	private float odTotal;
	
	@Column(name="odpaymentMode")
	private String odpaymentMode;

	@ManyToOne
	private Customer customer;
	public OrderDetails(int odId, LocalDateTime oddateOfPurchase, float odTotal, String odpaymentMode) {
		super();
		this.odId = odId;
		this.oddateOfPurchase = oddateOfPurchase;
		this.odTotal = odTotal;
		this.odpaymentMode = odpaymentMode;
	}

	public int getOdId() {
		return odId;
	}

	public void setOdId(int odId) {
		this.odId = odId;
	}

	public LocalDateTime getOddateOfPurchase() {
		return oddateOfPurchase;
	}

	public void setOddateOfPurchase(LocalDateTime oddateOfPurchase) {
		this.oddateOfPurchase = oddateOfPurchase;
	}

	public float getOdTotal() {
		return odTotal;
	}

	public void setOdTotal(float odTotal) {
		this.odTotal = odTotal;
	}

	public String getOdpaymentMode() {
		return odpaymentMode;
	}

	public void setOdpaymentMode(String odpaymentMode) {
		this.odpaymentMode = odpaymentMode;
	}

	@Override
	public String toString() {
		return "OrderDetails [odId=" + odId + ", oddateOfPurchase=" + oddateOfPurchase + ", odTotal=" + odTotal
				+ ", odpaymentMode=" + odpaymentMode + ", getOdId()=" + getOdId() + ", getOddateOfPurchase()="
				+ getOddateOfPurchase() + ", getOdTotal()=" + getOdTotal() + ", getOdpaymentMode()="
				+ getOdpaymentMode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
