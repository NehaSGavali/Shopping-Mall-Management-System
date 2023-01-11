package com.tns.shoppingmall.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="shopowner")
public class ShopOwner {

	@Id
	@Column(name="shopownerId")
	private int shopownerId;
	
	@Column(name="shopownerName")
	private String shopownerName;
	
	@Column(name="shopownerDOB")
	private LocalDate shopownerDOB;
	
	@Column(name="shopownerAddress")
	private String shopownerAddress;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="malladminId")
	private MallAdmin malladmin;
	
	
	
	public ShopOwner() {	}

	public ShopOwner(int shopownerId, String shopownerName, LocalDate shopownerDOB, String shopownerAddress) {
		super();
		this.shopownerId = shopownerId;
		this.shopownerName = shopownerName;
		this.shopownerDOB = shopownerDOB;
		this.shopownerAddress = shopownerAddress;
	}

	public int getShopownerId() {
		return shopownerId;
	}

	public void setShopownerId(int shopownerId) {
		this.shopownerId = shopownerId;
	}

	public String getShopownerName() {
		return shopownerName;
	}

	public void setShopownerName(String shopownerName) {
		this.shopownerName = shopownerName;
	}

	public LocalDate getShopownerDOB() {
		return shopownerDOB;
	}

	public void setShopownerDOB(LocalDate shopownerDOB) {
		this.shopownerDOB = shopownerDOB;
	}

	public String getShopownerAddress() {
		return shopownerAddress;
	}

	public void setShopownerAddress(String shopownerAddress) {
		this.shopownerAddress = shopownerAddress;
	}

	@Override
	public String toString() {
		return "ShopOwner [shopownerId=" + shopownerId + ", shopownerName=" + shopownerName + ", shopownerDOB="
				+ shopownerDOB + ", shopownerAddress=" + shopownerAddress + "]";
	}
	
	
}
