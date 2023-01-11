package com.tns.shoppingmall.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	@Column(name="itemId")
	private long itemId;
	
	@Column(name="itemName")
	private String itemName;
	
	@Column(name="itemManufacturing")
	private LocalDate itemManufacturing;
	
	@Column(name="itemPrice")
	private float itemPrice;
	
	@Column(name="itemCategory")
	private String itemCategory;
	
	@ManyToOne
	private Shop shop;
	
	public Item() {
	}

	public Item(long itemId, String itemName, LocalDate itemManufacturing, float itemPrice, String itemCategory) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemManufacturing = itemManufacturing;
		this.itemPrice = itemPrice;
		this.itemCategory = itemCategory;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public LocalDate getItemManufacturing() {
		return itemManufacturing;
	}

	public void setItemManufacturing(LocalDate itemManufacturing) {
		this.itemManufacturing = itemManufacturing;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemManufacturing=" + itemManufacturing
				+ ", itemPrice=" + itemPrice + ", itemCategory=" + itemCategory + ", getItemId()=" + getItemId()
				+ ", getItemName()=" + getItemName() + ", getItemManufacturing()=" + getItemManufacturing()
				+ ", getItemPrice()=" + getItemPrice() + ", getItemCategory()=" + getItemCategory() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
/*id : long
-name : String
-manufacturing : LocalDate
-expiry: LocalDate
-price: float
-category: String
*/