package com.tns.shoppingmall.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Shop")
public class Shop {
	@Id
	@Column(name="shopId")
	private int shopId;
	
	@Column(name="shopCategory")
	private String shopCategory;
	
	@Column(name="shopName")
	private String shopName;
	
	@Column(name="shopStatus")
	private String shopStatus;
	
	@Column(name="leaseStatus")
	private String leaseStatus;

	@OneToMany(mappedBy="shop")
	private List<Employee> employee;
	
	@OneToMany(mappedBy="shop")
	private List<Item> item;
	
	@OneToOne
	private ShopOwner shopowner;
	
	public Shop(int shopId, String shopCategory, String shopName, String shopStatus, String leaseStatus) {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopName = shopName;
		this.shopStatus = shopStatus;
		this.leaseStatus = leaseStatus;
	}

	public Shop() {
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopName=" + shopName + ", shopStatus="
				+ shopStatus + ", leaseStatus=" + leaseStatus + "]";
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	
	
}
/*shopId: int
-shopCategory: String
-shopEmployeeID: Employee
-shopName: String
-customers: String
-shopStatus: String
-shopOwner: ShopOwner
-leaseStatus: String
*/