package com.tns.shoppingmall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="userId")
	private int userId;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="userType")
	private String userType;
	
	@Column(name="userpassword")
	private String userpassword;
	
	@OneToOne
	private Customer customer;
	@OneToOne
	private MallAdmin malladmin;
	@OneToOne
	private ShopOwner shopowner;
	

	public User(int userId, String userName, String userType, String userpassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userpassword = userpassword;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", userpassword="
				+ userpassword + "]";
	}
	
	
}
/*-id : int
-name : String
-type : String
-password : String
*/