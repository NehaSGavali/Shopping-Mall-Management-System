package com.tns.shoppingmall.entity;

import javax.persistence.*;

@Entity
@Table(name="mall")
public class Mall {
	@Id
	@Column(name="mallId")
	private int mallId;
	
	@Column(name="mallName")
	private String mallName;
	
	@Column(name="mallLocation")
	private String mallLocation;
	
	@Column(name="mallCategories")
	private String mallCategories;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="malladminId")
	private MallAdmin malladmin;

	public int getMallId() {
		return mallId;
	}

	public void setMallId(int mallId) {
		this.mallId = mallId;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getMallLocation() {
		return mallLocation;
	}

	public void setMallLocation(String mallLocation) {
		this.mallLocation = mallLocation;
	}

	public String getMallCategories() {
		return mallCategories;
	}

	public void setMallCategories(String mallCategories) {
		this.mallCategories = mallCategories;
	}

	public Mall(int mallId, String mallName, String mallLocation, String mallCategories) {
		super();
		this.mallId = mallId;
		this.mallName = mallName;
		this.mallLocation = mallLocation;
		this.mallCategories = mallCategories;
	}

	public Mall() {
	}

	@Override
	public String toString() {
		return "Mall [mallId=" + mallId + ", mallName=" + mallName + ", mallLocation=" + mallLocation
				+ ", mallCategories=" + mallCategories + ", getMallId()=" + getMallId() + ", getMallName()="
				+ getMallName() + ", getMallLocation()=" + getMallLocation() + ", getMallCategories()="
				+ getMallCategories() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
