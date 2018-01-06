package org.online.store.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 普通用户
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer extends BaseEntity {

	private static final long serialVersionUID = 3064172540569236999L;

	/**
	 * 用户名
	 */
	@Column(name = "USER_NAME", length = 32)
	private String userName;

	/**
	 * 密码
	 */
	@Column(name = "PASSWORD", length = 64)
	private String password;

	/**
	 * 昵称
	 */
	@Column(name = "NICK_NAME", length = 32)
	private String nickName;

	/**
	 * 性别
	 */
	@Column(name = "SEX", length = 12)
	private String sex;

	/**
	 * 生日
	 */
	@Column(name = "BIRTHDAY")
	@Temporal(TemporalType.TIME)
	private Date birthday;

	/**
	 * 电话号码
	 */
	@Column(name = "PHONE_NUMBER", length = 16)
	private String phoneNumber;

	/**
	 * 邮箱
	 */
	@Column(name = "EMAIL", length = 32)
	private String email;

	/**
	 * 头像
	 */
	@Column(name = "PORTRAIT", length = 64)
	private String portrait;

	/**
	 * 收货地址
	 */
	@OneToMany
	@JoinColumn(name = "CUSTOMER_ID")
	private Set<Address> address;

	/**
	 * 购物车
	 */
	@OneToMany
	@JoinColumn(name = "CUSTOMER_ID")
	private Set<ShoppingCart> carts;

	/**
	 * 订单
	 */
	@OneToMany
	@JoinColumn(name = "CUSTOMER_ID")
	private Set<Indent> indents;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Set<ShoppingCart> getCarts() {
		return carts;
	}

	public void setCarts(Set<ShoppingCart> carts) {
		this.carts = carts;
	}

	public Set<Indent> getIndents() {
		return indents;
	}

	public void setIndents(Set<Indent> indents) {
		this.indents = indents;
	}

}
