package com.tns.shoppingmall.entity;

import javax.persistence.*;

@Entity
@Table(name="malladmin")
public class MallAdmin {
	
	@Id
	@Column(name="malladminId")
	private int malladminId;
	
	@Column(name="malladminName")
	private  String malladminName;
	
	@Column(name="malladminpassword")
	private String malladminpassword;
	
	@Column(name="malladminphone")
	private String malladminphone;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mallId")
	private Mall mall;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shopownerId")
	private ShopOwner shopowner;
	
	public MallAdmin() {
		super();
	}

	public MallAdmin(int malladminId, String malladminName, String malladminpassword, String malladminphone) {
		super();
		this.malladminId = malladminId;
		this.malladminName = malladminName;
		this.malladminpassword = malladminpassword;
		this.malladminphone = malladminphone;
	}

	public int getMalladminId() {
		return malladminId;
	}

	public void setMalladminId(int malladminId) {
		this.malladminId = malladminId;
	}

	public String getMalladminName() {
		return malladminName;
	}

	public void setMalladminName(String malladminName) {
		this.malladminName = malladminName;
	}

	public String getMalladminpassword() {
		return malladminpassword;
	}

	public void setMalladminpassword(String malladminpassword) {
		this.malladminpassword = malladminpassword;
	}

	public String getMalladminphone() {
		return malladminphone;
	}

	public void setMalladminphone(String malladminphone) {
		this.malladminphone = malladminphone;
	}	
}
